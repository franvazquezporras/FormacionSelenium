package org.formacion.pageobject.pantallas.Recruitment.Vacancies;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentEditVacancyPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtVacancyName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By txtDescription = By.xpath("");
    private By txtHiringManager = By.xpath("");
    private By txtNumberPositions = By.xpath("");
    private By checkActive = By.xpath("");
    private By checkPublishRSS = By.xpath("");
    private By btnRSSFeedURL = By.xpath("");
    private By btnWebPageURL = By.xpath("");
    private By btnAddAttachment = By.xpath("");
    private By btnEditAttachment = By.xpath("");
    private By btnDeleteAttachment = By.xpath("");
    private By btnDescargarAttachment = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentEditVacancyPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Vacancy");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre de la Vacancy.
     * @param texto Nombre de la vacante.
     */
    public void insertarVacancyName(String texto){
        esClickeable(txtVacancyName);
        setText(txtVacancyName, texto);
    }

    /**
     * Inserta la descripción de la Vacancy.
     * @param texto Descripción.
     */
    public void insertarDescription(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }

    /**
     * Inserta el Hiring Manager.
     * @param texto Nombre del manager.
     */
    public void insertarHiringManager(String texto){
        esClickeable(txtHiringManager);
        setText(txtHiringManager, texto);
    }

    /**
     * Inserta el número de posiciones disponibles.
     * @param texto Número de posiciones.
     */
    public void insertarNumberPositions(String texto){
        esClickeable(txtNumberPositions);
        setText(txtNumberPositions, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Job Title.
     * @param opcion Título del puesto.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox Active.
     */
    public void pulsarCheckActive(){
        esClickeable(checkActive);
        clickElemento(checkActive, "Seleccionar/Deseleccionar Active");
    }

    /**
     * Selecciona o deselecciona el checkbox Publish in RSS.
     */
    public void pulsarCheckPublishRSS(){
        esClickeable(checkPublishRSS);
        clickElemento(checkPublishRSS, "Seleccionar/Deseleccionar Publish in RSS");
    }

// -------------------------
// BOTONES PRINCIPALES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios de la Vacancy.
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

    /**
     * Realiza clic en el botón RSS Feed URL.
     * Abre la URL del RSS Feed.
     */
    public void pulsarBotonRSSFeedURL(){
        esClickeable(btnRSSFeedURL);
        clickElemento(btnRSSFeedURL, "Pulsar botón RSS Feed URL");
    }

    /**
     * Realiza clic en el botón Web Page URL.
     * Abre la URL de la página web.
     */
    public void pulsarBotonWebPageURL(){
        esClickeable(btnWebPageURL);
        clickElemento(btnWebPageURL, "Pulsar botón Web Page URL");
    }

// -------------------------
// BOTONES DE ATTACHMENTS
// -------------------------

    /**
     * Realiza clic en el botón Add Attachment.
     * Permite agregar un archivo adjunto.
     */
    public void pulsarBotonAddAttachment(){
        esClickeable(btnAddAttachment);
        clickElemento(btnAddAttachment, "Pulsar botón Add Attachment");
    }

    /**
     * Realiza clic en el botón Edit Attachment.
     * Permite editar el archivo adjunto seleccionado.
     */
    public void pulsarBotonEditAttachment(){
        esClickeable(btnEditAttachment);
        clickElemento(btnEditAttachment, "Pulsar botón Edit Attachment");
    }

    /**
     * Realiza clic en el botón Delete Attachment.
     * Elimina el archivo adjunto seleccionado.
     */
    public void pulsarBotonDeleteAttachment(){
        esClickeable(btnDeleteAttachment);
        clickElemento(btnDeleteAttachment, "Pulsar botón Delete Attachment");
    }

    /**
     * Realiza clic en el botón Descargar Attachment.
     * Descarga el archivo adjunto seleccionado.
     */
    public void pulsarBotonDescargarAttachment(){
        esClickeable(btnDescargarAttachment);
        clickElemento(btnDescargarAttachment, "Pulsar botón Descargar Attachment");
    }

// </editor-fold>

}
