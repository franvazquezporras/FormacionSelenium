package org.formacion.pageobject.pantallas.Performance.Configure.Trackers;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceConfigureEditTrackerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtTrackerName = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By txtReviewers = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de un Tracker
     * dentro del módulo de Performance.
     *
     * Esta vista permite modificar un tracker de desempeño previamente creado,
     * ajustando supervisores, empleados asignados y cualquier otro parámetro
     * utilizado para el seguimiento de actividades o métricas de rendimiento.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceConfigureEditTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de edición de un Tracker esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Editar Tracker");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Tracker.
     * @param texto Nombre del tracker.
     */
    public void insertarTrackerName(String texto){
        esClickeable(txtTrackerName);
        setText(txtTrackerName, texto);
    }

    /**
     * Inserta el nombre del empleado asociado al Tracker.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta los reviewers asignados al Tracker.
     * @param texto Lista de reviewers.
     */
    public void insertarReviewers(String texto){
        esClickeable(txtReviewers);
        setText(txtReviewers, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el Tracker.
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
