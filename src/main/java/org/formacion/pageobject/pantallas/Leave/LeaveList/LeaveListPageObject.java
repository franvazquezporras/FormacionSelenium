package org.formacion.pageobject.pantallas.Leave.LeaveList;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeaveType = By.xpath("");
    private By listaSubUnit = By.xpath("");
    private By listaShowLeaveStatus = By.xpath("");
    private By checkIncludePastEmployees = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de consulta de permisos (Leave List).
     *
     * Esta vista permite buscar, filtrar y visualizar los registros de permisos
     * solicitados por los empleados dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public LeaveListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de consulta de permisos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Search.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSearch,"Pantalla Leave List");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Leave Type en la lista.
     * @param opcion Tipo de permiso a seleccionar.
     */
    public void seleccionarListaLeaveType(String opcion){
        esClickeable(listaLeaveType);
        seleccionarOpcion(listaLeaveType, opcion);
    }

    /**
     * Selecciona un Sub Unit en la lista.
     * @param opcion Subunidad a seleccionar.
     */
    public void seleccionarListaSubUnit(String opcion){
        esClickeable(listaSubUnit);
        seleccionarOpcion(listaSubUnit, opcion);
    }

    /**
     * Selecciona un estado de Leave en la lista.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaShowLeaveStatus(String opcion){
        esClickeable(listaShowLeaveStatus);
        seleccionarOpcion(listaShowLeaveStatus, opcion);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva la opción "Include Past Employees".
     */
    public void pulsarCheckIncludePastEmployees(){
        esClickeable(checkIncludePastEmployees);
        clickElemento(checkIncludePastEmployees, "Seleccionar/Deseleccionar Include Past Employees");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la fecha From para filtrar.
     * @param texto Fecha inicial.
     */
    public void insertarFromDate(String texto){
        esClickeable(txtFromDate);
        setText(txtFromDate, texto);
    }

    /**
     * Inserta la fecha To para filtrar.
     * @param texto Fecha final.
     */
    public void insertarToDate(String texto){
        esClickeable(txtToDate);
        setText(txtToDate, texto);
    }

    /**
     * Inserta el nombre del empleado para filtrar.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda según los filtros ingresados.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia todos los filtros del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// </editor-fold>

}
