package org.formacion.pageobject.pantallas.Leave.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveEntitlementsUsageReportPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkGenerateForLeaveType = By.xpath("");
    private By checkGenerateForEmployee = By.xpath("");
    private By listaLeaveType = By.xpath("");
    private By listaLeavePeriod = By.xpath("");
    private By listaLocation = By.xpath("");
    private By listaSubUnit = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By checkIncludePastEmployees = By.xpath("");
    private By btnGenerate = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public LeaveEntitlementsUsageReportPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnGenerate,"Pantalla Leave Entitlements Usage Report");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona la opción "Generate for Leave Type".
     */
    public void pulsarCheckGenerateForLeaveType(){
        esClickeable(checkGenerateForLeaveType);
        clickElemento(checkGenerateForLeaveType, "Seleccionar Generate for Leave Type");
    }

    /**
     * Selecciona la opción "Generate for Employee".
     */
    public void pulsarCheckGenerateForEmployee(){
        esClickeable(checkGenerateForEmployee);
        clickElemento(checkGenerateForEmployee, "Seleccionar Generate for Employee");
    }

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
     * Selecciona un Leave Period en la lista.
     * @param opcion Periodo a seleccionar.
     */
    public void seleccionarListaLeavePeriod(String opcion){
        esClickeable(listaLeavePeriod);
        seleccionarOpcion(listaLeavePeriod, opcion);
    }

    /**
     * Selecciona una Location en la lista.
     * @param opcion Ubicación a seleccionar.
     */
    public void seleccionarListaLocation(String opcion){
        esClickeable(listaLocation);
        seleccionarOpcion(listaLocation, opcion);
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
     * Selecciona un Job Title en la lista.
     * @param opcion Puesto a seleccionar.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

// -------------------------
// CHECKBOX EXTRA
// -------------------------

    /**
     * Activa o desactiva la opción "Include Past Employees".
     */
    public void pulsarCheckIncludePastEmployees(){
        esClickeable(checkIncludePastEmployees);
        clickElemento(checkIncludePastEmployees, "Seleccionar/Deseleccionar Include Past Employees");
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Generate.
     * Genera el reporte según los filtros seleccionados.
     */
    public void pulsarBotonGenerate(){
        esClickeable(btnGenerate);
        clickElemento(btnGenerate, "Pulsar botón Generate");
    }

// </editor-fold>

}
