package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimSubmitClaimPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaEvent = By.xpath("");
    private By listaCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnCreate = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimSubmitClaimPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnCreate,"Pantalla Submit Claim");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

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
     * Realiza clic en el botón Create.
     * Crea un nuevo reclamo con los datos ingresados.
     */
    public void pulsarBotonCreate(){
        esClickeable(btnCreate);
        clickElemento(btnCreate, "Pulsar botón Create");
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
