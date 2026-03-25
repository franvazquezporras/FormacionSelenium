package org.formacion.pageobject.pantallas.Performance.ManageReviews.ManageReviews;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceAddManageReviewsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By txtSupervisorReviewer = By.xpath("");
    private By txtReviewPeriodStartDate = By.xpath("");
    private By txtReviewPeriodEndDate = By.xpath("");
    private By txtDueDate = By.xpath("");
    private By btnActivate = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de una nueva revisión
     * de desempeño (Add Review) dentro del módulo de Performance.
     *
     * Esta vista permite registrar una nueva evaluación de desempeño, definiendo
     * al empleado evaluado, al evaluador, el período de revisión, la fecha programada
     * y cualquier otro parámetro requerido para iniciar el proceso de evaluación.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceAddManageReviewsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de una nueva revisión de desempeño
     * esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Review");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado para el que se creará la revisión.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta el nombre del supervisor revisor.
     * @param texto Nombre del supervisor.
     */
    public void insertarSupervisorReviewer(String texto){
        esClickeable(txtSupervisorReviewer);
        setText(txtSupervisorReviewer, texto);
    }

    /**
     * Inserta la fecha de inicio del periodo de revisión.
     * @param texto Fecha inicial.
     */
    public void insertarReviewPeriodStartDate(String texto){
        esClickeable(txtReviewPeriodStartDate);
        setText(txtReviewPeriodStartDate, texto);
    }

    /**
     * Inserta la fecha de fin del periodo de revisión.
     * @param texto Fecha final.
     */
    public void insertarReviewPeriodEndDate(String texto){
        esClickeable(txtReviewPeriodEndDate);
        setText(txtReviewPeriodEndDate, texto);
    }

    /**
     * Inserta la fecha límite de la revisión.
     * @param texto Fecha límite.
     */
    public void insertarDueDate(String texto){
        esClickeable(txtDueDate);
        setText(txtDueDate, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Activate.
     * Activa la revisión antes de guardarla.
     */
    public void pulsarBotonActivate(){
        esClickeable(btnActivate);
        clickElemento(btnActivate, "Pulsar botón Activate");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda la nueva revisión.
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
