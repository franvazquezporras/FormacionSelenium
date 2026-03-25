package org.formacion.pageobject.pantallas.Claim.AssignClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimAssignClaimPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaEvent = By.xpath("");
    private By listaCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnShare = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de asignación de un reclamo.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimAssignClaimPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de asignación de reclamo esté completamente cargada.
     * Se sincroniza verificando la presencia del campo de nombre del empleado.
     */
    public void esperarSincronizacion(){
        esperarPagina(txtEmployeeName,"Pantalla Assign Claim");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta las observaciones del reclamo.
     * @param texto Observaciones o comentarios.
     */
    public void insertarRemarks(String texto){
        esClickeable(txtRemarks);
        setText(txtRemarks, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un evento en la lista Event.
     * @param opcion Evento a seleccionar.
     */
    public void seleccionarListaEvent(String opcion){
        esClickeable(listaEvent);
        seleccionarOpcion(listaEvent, opcion);
    }

    /**
     * Selecciona una moneda en la lista Currency.
     * @param opcion Moneda a seleccionar.
     */
    public void seleccionarListaCurrency(String opcion){
        esClickeable(listaCurrency);
        seleccionarOpcion(listaCurrency, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Share.
     * Comparte o asigna el reclamo según los datos ingresados.
     */
    public void pulsarBotonShare(){
        esClickeable(btnShare);
        clickElemento(btnShare, "Pulsar botón Share");
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
