package org.formacion.pageobject.pantallas.PIM.Configuration.CustomFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationEditCustomFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFieldName = By.xpath("");
    private By listaScreen = By.xpath("");
    private By txtSelectOption = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationEditCustomFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Custom Field");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Custom Field.
     * @param texto Nombre del campo personalizado.
     */
    public void insertarFieldName(String texto){
        esClickeable(txtFieldName);
        setText(txtFieldName, texto);
    }

    /**
     * Inserta el valor de la opción seleccionada (Select Option).
     * @param texto Valor de la opción.
     */
    public void insertarSelectOption(String texto){
        esClickeable(txtSelectOption);
        setText(txtSelectOption, texto);
    }

// -------------------------
// LISTA
// -------------------------

    /**
     * Selecciona una pantalla (Screen) donde se aplica el Custom Field.
     * @param opcion Pantalla a seleccionar.
     */
    public void seleccionarListaScreen(String opcion){
        esClickeable(listaScreen);
        seleccionarOpcion(listaScreen, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios del Custom Field.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la edición y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
