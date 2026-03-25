package org.formacion.pageobject.pantallas.Time.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AttendanceSummaryPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnView = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By listaSubUnit = By.xpath("");
    private By listaEmploymentStatus = By.xpath("");
    private By txtDateFrom = By.xpath("");
    private By txtDateTo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla Attendance Summary.
     *
     * Permite consultar el resumen de asistencia de los empleados.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AttendanceSummaryPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla Attendance Summary cargue verificando el botón View.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnView,"Pantalla Attendance Summary ");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta la fecha inicial del reporte.
     * @param texto Fecha desde.
     */
    public void insertarDateFrom(String texto){
        esClickeable(txtDateFrom);
        setText(txtDateFrom, texto);
    }

    /**
     * Inserta la fecha final del reporte.
     * @param texto Fecha hasta.
     */
    public void insertarDateTo(String texto){
        esClickeable(txtDateTo);
        setText(txtDateTo, texto);
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

    /**
     * Selecciona un Sub Unit.
     * @param opcion Subunidad.
     */
    public void seleccionarListaSubUnit(String opcion){
        esClickeable(listaSubUnit);
        seleccionarOpcion(listaSubUnit, opcion);
    }

    /**
     * Selecciona un Employment Status.
     * @param opcion Estado laboral.
     */
    public void seleccionarListaEmploymentStatus(String opcion){
        esClickeable(listaEmploymentStatus);
        seleccionarOpcion(listaEmploymentStatus, opcion);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón View.
     * Genera el reporte con los filtros aplicados.
     */
    public void pulsarBotonView(){
        esClickeable(btnView);
        clickElemento(btnView, "Pulsar botón View");
    }

// </editor-fold>

}
