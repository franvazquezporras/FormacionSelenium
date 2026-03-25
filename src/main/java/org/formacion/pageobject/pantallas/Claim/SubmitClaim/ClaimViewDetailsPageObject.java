package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimViewDetailsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtReferenceID = By.xpath("");
    private By txtEvent = By.xpath("");
    private By txtStatus = By.xpath("");
    private By txtCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnAddExpense = By.xpath("");
    private By btnEditarExpense = By.xpath("");
    private By btnBorrarExpense = By.xpath("");
    private By checkPrimerRegistroExpenses = By.xpath("");
    private By btnAddAttachments = By.xpath("");
    private By btnEditarAttachments = By.xpath("");
    private By btnBorrarAttachments = By.xpath("");
    private By btnDescargarAttachments = By.xpath("");
    private By checkPrimerRegistroAttachments = By.xpath("");

    private By btnBack = By.xpath("");
    private By btnCancel = By.xpath("");
    private By btnSubmit = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de visualización de detalles
     * de un reclamo. Desde esta vista se accede a la información completa del
     * reclamo, así como a sus adjuntos, gastos y acciones disponibles.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimViewDetailsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de detalles del reclamo esté completamente cargada.
     * Se sincroniza verificando la presencia del campo Reference ID.
     */
    public void esperarSincronizacion(){
        esperarPagina(txtReferenceID,"Pantalla View Details Claim");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS (solo lectura, pero mantenemos el patrón insertarX)
// -------------------------

    /**
     * Inserta el Reference ID.
     * @param texto Reference ID.
     */
    public void insertarReferenceID(String texto){
        esClickeable(txtReferenceID);
        setText(txtReferenceID, texto);
    }

    /**
     * Inserta el Event.
     * @param texto Evento.
     */
    public void insertarEvent(String texto){
        esClickeable(txtEvent);
        setText(txtEvent, texto);
    }

    /**
     * Inserta el Status.
     * @param texto Estado.
     */
    public void insertarStatus(String texto){
        esClickeable(txtStatus);
        setText(txtStatus, texto);
    }

    /**
     * Inserta la Currency.
     * @param texto Moneda.
     */
    public void insertarCurrency(String texto){
        esClickeable(txtCurrency);
        setText(txtCurrency, texto);
    }

    /**
     * Inserta las observaciones del reclamo.
     * @param texto Observaciones.
     */
    public void insertarRemarks(String texto){
        esClickeable(txtRemarks);
        setText(txtRemarks, texto);
    }

// -------------------------
// EXPENSES
// -------------------------

    /**
     * Realiza clic en el botón Add Expense.
     */
    public void pulsarBotonAddExpense(){
        esClickeable(btnAddExpense);
        clickElemento(btnAddExpense, "Pulsar botón Add Expense");
    }

    /**
     * Realiza clic en el botón Edit Expense.
     */
    public void pulsarBotonEditarExpense(){
        esClickeable(btnEditarExpense);
        clickElemento(btnEditarExpense, "Pulsar botón Edit Expense");
    }

    /**
     * Realiza clic en el botón Delete Expense.
     */
    public void pulsarBotonBorrarExpense(){
        esClickeable(btnBorrarExpense);
        clickElemento(btnBorrarExpense, "Pulsar botón Delete Expense");
    }

    /**
     * Activa o desactiva el checkbox del primer registro de Expenses.
     */
    public void pulsarCheckPrimerRegistroExpenses(){
        esClickeable(checkPrimerRegistroExpenses);
        clickElemento(checkPrimerRegistroExpenses, "Seleccionar/Deseleccionar primer registro de Expenses");
    }

// -------------------------
// ATTACHMENTS
// -------------------------

    /**
     * Realiza clic en el botón Add Attachments.
     */
    public void pulsarBotonAddAttachments(){
        esClickeable(btnAddAttachments);
        clickElemento(btnAddAttachments, "Pulsar botón Add Attachments");
    }

    /**
     * Realiza clic en el botón Edit Attachments.
     */
    public void pulsarBotonEditarAttachments(){
        esClickeable(btnEditarAttachments);
        clickElemento(btnEditarAttachments, "Pulsar botón Edit Attachments");
    }

    /**
     * Realiza clic en el botón Delete Attachments.
     */
    public void pulsarBotonBorrarAttachments(){
        esClickeable(btnBorrarAttachments);
        clickElemento(btnBorrarAttachments, "Pulsar botón Delete Attachments");
    }

    /**
     * Realiza clic en el botón Download Attachments.
     */
    public void pulsarBotonDescargarAttachments(){
        esClickeable(btnDescargarAttachments);
        clickElemento(btnDescargarAttachments, "Pulsar botón Download Attachments");
    }

    /**
     * Activa o desactiva el checkbox del primer registro de Attachments.
     */
    public void pulsarCheckPrimerRegistroAttachments(){
        esClickeable(checkPrimerRegistroAttachments);
        clickElemento(checkPrimerRegistroAttachments, "Seleccionar/Deseleccionar primer registro de Attachments");
    }

// -------------------------
// BOTONES FINALES
// -------------------------

    /**
     * Realiza clic en el botón Back.
     */
    public void pulsarBotonBack(){
        esClickeable(btnBack);
        clickElemento(btnBack, "Pulsar botón Back");
    }

    /**
     * Realiza clic en el botón Cancel.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

    /**
     * Realiza clic en el botón Submit.
     * Envía el reclamo para aprobación.
     */
    public void pulsarBotonSubmit(){
        esClickeable(btnSubmit);
        clickElemento(btnSubmit, "Pulsar botón Submit");
    }

// </editor-fold>

}
