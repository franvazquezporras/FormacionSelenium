package org.formacion.pageobject.pantallas.Recruitment.Vacancies;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentAddVacancyPageObject extends BasePageObject {

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
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de una nueva vacante
     * (Add Vacancy) dentro del módulo de Recruitment.
     *
     * Esta vista permite registrar una vacante en el sistema, definiendo el puesto,
     * el gerente responsable, el número de posiciones disponibles y cualquier otro
     * dato requerido para iniciar el proceso de contratación asociado a la vacante.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public RecruitmentAddVacancyPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Add Vacancy esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Vacancy");
    }
// </editor-fold>

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
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la nueva Vacancy.
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

// </editor-fold>

}
