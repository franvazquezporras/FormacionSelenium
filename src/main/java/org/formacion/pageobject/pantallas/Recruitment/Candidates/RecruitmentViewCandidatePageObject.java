package org.formacion.pageobject.pantallas.Recruitment.Candidates;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentViewCandidatePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnReject = By.xpath("");
    private By btnShortlist = By.xpath("");

    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtFirstName = By.xpath("");
    private By txtMidName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By listaVacancy = By.xpath("");
    private By txtEmail = By.xpath("");
    private By txtContactNumber = By.xpath("");
    private By txtResume = By.xpath("");
    private By checkKeepCurrent = By.xpath("");
    private By checkDeleteCurrent = By.xpath("");
    private By checkReplaceCurrent = By.xpath("");

    private By txtKeywords = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtNotes = By.xpath("");
    private By checkConsent = By.xpath("");
    private By checkEdit = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentViewCandidatePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEdit,"Pantalla Edit Candidate");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES DE ACCIÓN PRINCIPAL
// -------------------------

    /**
     * Realiza clic en el botón Reject.
     * Rechaza al candidato.
     */
    public void pulsarBotonReject(){
        esClickeable(btnReject);
        clickElemento(btnReject, "Pulsar botón Reject");
    }

    /**
     * Realiza clic en el botón Shortlist.
     * Añade al candidato a la lista corta.
     */
    public void pulsarBotonShortlist(){
        esClickeable(btnShortlist);
        clickElemento(btnShortlist, "Pulsar botón Shortlist");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el First Name del candidato.
     * @param texto Nombre.
     */
    public void insertarFirstName(String texto){
        esClickeable(txtFirstName);
        setText(txtFirstName, texto);
    }

    /**
     * Inserta el Middle Name del candidato.
     * @param texto Segundo nombre.
     */
    public void insertarMidName(String texto){
        esClickeable(txtMidName);
        setText(txtMidName, texto);
    }

    /**
     * Inserta el Last Name del candidato.
     * @param texto Apellido.
     */
    public void insertarLastName(String texto){
        esClickeable(txtLastName);
        setText(txtLastName, texto);
    }

    /**
     * Inserta el Email del candidato.
     * @param texto Correo electrónico.
     */
    public void insertarEmail(String texto){
        esClickeable(txtEmail);
        setText(txtEmail, texto);
    }

    /**
     * Inserta el número de contacto del candidato.
     * @param texto Número de teléfono.
     */
    public void insertarContactNumber(String texto){
        esClickeable(txtContactNumber);
        setText(txtContactNumber, texto);
    }

    /**
     * Inserta el texto o ruta del Resume.
     * @param texto Ruta o contenido del CV.
     */
    public void insertarResume(String texto){
        esClickeable(txtResume);
        setText(txtResume, texto);
    }

    /**
     * Inserta las Keywords del candidato.
     * @param texto Palabras clave.
     */
    public void insertarKeywords(String texto){
        esClickeable(txtKeywords);
        setText(txtKeywords, texto);
    }

    /**
     * Inserta la fecha.
     * @param texto Fecha.
     */
    public void insertarDate(String texto){
        esClickeable(txtDate);
        setText(txtDate, texto);
    }

    /**
     * Inserta notas adicionales del candidato.
     * @param texto Notas.
     */
    public void insertarNotes(String texto){
        esClickeable(txtNotes);
        setText(txtNotes, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona una Vacancy.
     * @param opcion Vacante a seleccionar.
     */
    public void seleccionarListaVacancy(String opcion){
        esClickeable(listaVacancy);
        seleccionarOpcion(listaVacancy, opcion);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona o deselecciona Keep Current Resume.
     */
    public void pulsarCheckKeepCurrent(){
        esClickeable(checkKeepCurrent);
        clickElemento(checkKeepCurrent, "Seleccionar/Deseleccionar Keep Current Resume");
    }

    /**
     * Selecciona o deselecciona Delete Current Resume.
     */
    public void pulsarCheckDeleteCurrent(){
        esClickeable(checkDeleteCurrent);
        clickElemento(checkDeleteCurrent, "Seleccionar/Deseleccionar Delete Current Resume");
    }

    /**
     * Selecciona o deselecciona Replace Current Resume.
     */
    public void pulsarCheckReplaceCurrent(){
        esClickeable(checkReplaceCurrent);
        clickElemento(checkReplaceCurrent, "Seleccionar/Deseleccionar Replace Current Resume");
    }

    /**
     * Selecciona o deselecciona el checkbox de Consent.
     */
    public void pulsarCheckConsent(){
        esClickeable(checkConsent);
        clickElemento(checkConsent, "Seleccionar/Deseleccionar Consent");
    }

    /**
     * Selecciona o deselecciona el checkbox Edit.
     */
    public void pulsarCheckEdit(){
        esClickeable(checkEdit);
        clickElemento(checkEdit, "Seleccionar/Deseleccionar Edit");
    }

// -------------------------
// BOTONES SECUNDARIOS
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios del candidato.
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
