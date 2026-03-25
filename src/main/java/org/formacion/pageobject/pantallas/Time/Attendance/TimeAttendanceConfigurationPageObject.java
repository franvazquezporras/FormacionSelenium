package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeAttendanceConfigurationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkEmployeecanchange = By.xpath("");
    private By checkEmployeecanedit = By.xpath("");
    private By checkSupervisorcanadd = By.xpath("");
    private By btnSave = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de configuración de asistencia
     * (Time Attendance Configuration) dentro del módulo de Time.
     *
     * Esta vista permite definir y ajustar parámetros relacionados con el registro
     * de asistencia, tales como reglas de marcaje, tolerancias, políticas de
     * redondeo y cualquier otra configuración que afecte al control horario.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public TimeAttendanceConfigurationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Time Attendance Configuration esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save, que indica que la vista
     * está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Time Attendance Configuration");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox Employee can change.
     */
    public void pulsarCheckEmployeeCanChange(){
        esClickeable(checkEmployeecanchange);
        clickElemento(checkEmployeecanchange, "Seleccionar/Deseleccionar Employee can change");
    }

    /**
     * Selecciona o deselecciona el checkbox Employee can edit.
     */
    public void pulsarCheckEmployeeCanEdit(){
        esClickeable(checkEmployeecanedit);
        clickElemento(checkEmployeecanedit, "Seleccionar/Deseleccionar Employee can edit");
    }

    /**
     * Selecciona o deselecciona el checkbox Supervisor can add.
     */
    public void pulsarCheckSupervisorCanAdd(){
        esClickeable(checkSupervisorcanadd);
        clickElemento(checkSupervisorcanadd, "Seleccionar/Deseleccionar Supervisor can add");
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración de asistencia.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

// </editor-fold>

}
