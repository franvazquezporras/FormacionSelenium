package org.formacion.pageobject.pantallas.Recruitment.Candidates;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentAddCandidatePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtFirstName = By.xpath("");
    private By txtMidName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By listaVacancy = By.xpath("");
    private By txtEmail = By.xpath("");
    private By txtContactNumber = By.xpath("");
    private By txtResume = By.xpath("");
    private By txtKeywords = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtNotes = By.xpath("");
    private By checkConsent = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentAddCandidatePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Candidate");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

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
     * Inserta la fecha de aplicación.
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
// CHECKBOX
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox de Consent.
     */
    public void pulsarCheckConsent(){
        esClickeable(checkConsent);
        clickElemento(checkConsent, "Seleccionar/Deseleccionar Consent");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo candidato.
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
