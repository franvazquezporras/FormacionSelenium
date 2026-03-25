package org.formacion.pageobject.pantallas.Performance.Configure.Trackers;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceConfigureAddTrackerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtTrackerName = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By txtReviewers = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de un nuevo Tracker
     * dentro del módulo de Performance.
     *
     * Esta vista permite registrar un nuevo tracker de desempeño, definiendo
     * supervisores, empleados asignados y los parámetros necesarios para realizar
     * el seguimiento de actividades o métricas asociadas al rendimiento.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceConfigureAddTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de un nuevo Tracker esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Añadir Tracker");
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
     * Guarda el nuevo Tracker.
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
