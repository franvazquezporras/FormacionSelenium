package org.formacion.pageobject.pantallas.Leave.Configure.Holidays;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditHolidaysPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDate = By.xpath("");
    private By listaFullDay = By.xpath("");
    private By checkRepeatsAnnuallySi = By.xpath("");
    private By checkRepeatsAnnuallyNo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public EditHolidaysPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Holidays");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Holiday.
     * @param texto Nombre del Holiday.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la fecha del Holiday.
     * @param texto Fecha del Holiday.
     */
    public void insertarDate(String texto){
        esClickeable(txtDate);
        setText(txtDate, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona si el Holiday es Full Day o no.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaFullDay(String opcion){
        esClickeable(listaFullDay);
        seleccionarOpcion(listaFullDay, opcion);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona la opción "Repeats Annually - Sí".
     */
    public void pulsarCheckRepeatsAnnuallySi(){
        esClickeable(checkRepeatsAnnuallySi);
        clickElemento(checkRepeatsAnnuallySi, "Seleccionar Repeats Annually Sí");
    }

    /**
     * Selecciona la opción "Repeats Annually - No".
     */
    public void pulsarCheckRepeatsAnnuallyNo(){
        esClickeable(checkRepeatsAnnuallyNo);
        clickElemento(checkRepeatsAnnuallyNo, "Seleccionar Repeats Annually No");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el Holiday.
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
