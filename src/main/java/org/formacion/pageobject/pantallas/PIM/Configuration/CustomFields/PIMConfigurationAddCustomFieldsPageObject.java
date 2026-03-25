package org.formacion.pageobject.pantallas.PIM.Configuration.CustomFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationAddCustomFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFieldName = By.xpath("");
    private By listaScreen = By.xpath("");
    private By listaType = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de un nuevo
     * campo personalizado (Add Custom Field) dentro del módulo de configuración
     * de PIM.
     *
     * Esta vista permite añadir nuevos campos personalizados que pueden ser
     * utilizados para ampliar la información almacenada sobre los empleados,
     * permitiendo adaptar el sistema a necesidades específicas de la organización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMConfigurationAddCustomFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Add Custom Field esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Custom Field");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre del Custom Field.
     * @param texto Nombre del campo personalizado.
     */
    public void insertarFieldName(String texto){
        esClickeable(txtFieldName);
        setText(txtFieldName, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona una pantalla (Screen) donde se aplicará el Custom Field.
     * @param opcion Pantalla a seleccionar.
     */
    public void seleccionarListaScreen(String opcion){
        esClickeable(listaScreen);
        seleccionarOpcion(listaScreen, opcion);
    }

    /**
     * Selecciona el tipo de Custom Field.
     * @param opcion Tipo a seleccionar.
     */
    public void seleccionarListaType(String opcion){
        esClickeable(listaType);
        seleccionarOpcion(listaType, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Custom Field.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
