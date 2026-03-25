package org.formacion.pageobject.pantallas.Time.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnView = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By txtProjectName = By.xpath("");
    private By listaActivityName = By.xpath("");
    private By txtProjectDateRangeFrom = By.xpath("");
    private By txtProjectDateRangeTo = By.xpath("");
    private By checkOnlyIncludeApprovedTimesheets = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla Employee Report.
     *
     * Permite consultar los reportes de asistencia por empleado.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EmployeeReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla Employee Report cargue verificando el botón View.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnView,"Pantalla Employee Report");
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
     * Inserta el nombre del proyecto.
     * @param texto Nombre del proyecto.
     */
    public void insertarProjectName(String texto){
        esClickeable(txtProjectName);
        setText(txtProjectName, texto);
    }

    /**
     * Inserta la fecha inicial del rango del proyecto.
     * @param texto Fecha desde.
     */
    public void insertarProjectDateRangeFrom(String texto){
        esClickeable(txtProjectDateRangeFrom);
        setText(txtProjectDateRangeFrom, texto);
    }

    /**
     * Inserta la fecha final del rango del proyecto.
     * @param texto Fecha hasta.
     */
    public void insertarProjectDateRangeTo(String texto){
        esClickeable(txtProjectDateRangeTo);
        setText(txtProjectDateRangeTo, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona una Activity Name.
     * @param opcion Actividad.
     */
    public void seleccionarListaActivityName(String opcion){
        esClickeable(listaActivityName);
        seleccionarOpcion(listaActivityName, opcion);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox Only Include Approved Timesheets.
     */
    public void pulsarCheckOnlyIncludeApprovedTimesheets(){
        esClickeable(checkOnlyIncludeApprovedTimesheets);
        clickElemento(checkOnlyIncludeApprovedTimesheets, "Seleccionar/Deseleccionar Only Include Approved Timesheets");
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
