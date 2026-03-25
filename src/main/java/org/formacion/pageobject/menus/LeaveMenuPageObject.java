package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnApply = By.xpath("");

    private By btnMyLeave = By.xpath("");

    private By btnEntitlements = By.xpath("");
    private By btnEntitlementsAddEntitlements = By.xpath("");
    private By btnEntitlementsEmployeeEntitlements = By.xpath("");
    private By btnEntitlementsMyEntitlements = By.xpath("");

    private By btnReports = By.xpath("");
    private By btnReportsLeaveEntitlementsUsageReport = By.xpath("");
    private By btnReportsMyLeaveEntitlementsUsageReport = By.xpath("");

    private By btnConfigure = By.xpath("");
    private By btnConfigureLeavePeriod = By.xpath("");
    private By btnConfigureLeaveTypes = By.xpath("");
    private By btnConfigureWorkWeek = By.xpath("");
    private By btnConfigureHolidays = By.xpath("");

    private By btnLeaveList = By.xpath("");

    private By btnAssignLeave = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public LeaveMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú Leave esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnLeaveList,"Menu Leave");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// APPLY
// -------------------------

    /**
     * Accede a la pantalla Apply para solicitar permisos.
     */
    public void pulsarBotonApply(){
        esClickeable(btnApply);
        clickElemento(btnApply, "Pulsar botón Apply");
    }

// -------------------------
// MY LEAVE
// -------------------------

    /**
     * Accede a la sección My Leave.
     */
    public void pulsarBotonMyLeave(){
        esClickeable(btnMyLeave);
        clickElemento(btnMyLeave, "Pulsar botón My Leave");
    }

// -------------------------
// ENTITLEMENTS
// -------------------------

    /**
     * Abre la sección Entitlements.
     */
    public void pulsarBotonEntitlements(){
        esClickeable(btnEntitlements);
        clickElemento(btnEntitlements, "Pulsar botón Entitlements");
    }

    /**
     * Accede a Add Entitlements.
     */
    public void pulsarBotonEntitlementsAddEntitlements(){
        esClickeable(btnEntitlementsAddEntitlements);
        clickElemento(btnEntitlementsAddEntitlements, "Pulsar botón Entitlements - Add Entitlements");
    }

    /**
     * Accede a Employee Entitlements.
     */
    public void pulsarBotonEntitlementsEmployeeEntitlements(){
        esClickeable(btnEntitlementsEmployeeEntitlements);
        clickElemento(btnEntitlementsEmployeeEntitlements, "Pulsar botón Entitlements - Employee Entitlements");
    }

    /**
     * Accede a My Entitlements.
     */
    public void pulsarBotonEntitlementsMyEntitlements(){
        esClickeable(btnEntitlementsMyEntitlements);
        clickElemento(btnEntitlementsMyEntitlements, "Pulsar botón Entitlements - My Entitlements");
    }

// -------------------------
// REPORTS
// -------------------------

    /**
     * Abre la sección Reports.
     */
    public void pulsarBotonReports(){
        esClickeable(btnReports);
        clickElemento(btnReports, "Pulsar botón Reports");
    }

    /**
     * Accede al reporte Leave Entitlements Usage Report.
     */
    public void pulsarBotonReportsLeaveEntitlementsUsageReport(){
        esClickeable(btnReportsLeaveEntitlementsUsageReport);
        clickElemento(btnReportsLeaveEntitlementsUsageReport, "Pulsar botón Reports - Leave Entitlements Usage Report");
    }

    /**
     * Accede al reporte My Leave Entitlements Usage Report.
     */
    public void pulsarBotonReportsMyLeaveEntitlementsUsageReport(){
        esClickeable(btnReportsMyLeaveEntitlementsUsageReport);
        clickElemento(btnReportsMyLeaveEntitlementsUsageReport, "Pulsar botón Reports - My Leave Entitlements Usage Report");
    }

// -------------------------
// CONFIGURE
// -------------------------

    /**
     * Abre la sección Configure.
     */
    public void pulsarBotonConfigure(){
        esClickeable(btnConfigure);
        clickElemento(btnConfigure, "Pulsar botón Configure");
    }

    /**
     * Accede a Leave Period.
     */
    public void pulsarBotonConfigureLeavePeriod(){
        esClickeable(btnConfigureLeavePeriod);
        clickElemento(btnConfigureLeavePeriod, "Pulsar botón Configure - Leave Period");
    }

    /**
     * Accede a Leave Types.
     */
    public void pulsarBotonConfigureLeaveTypes(){
        esClickeable(btnConfigureLeaveTypes);
        clickElemento(btnConfigureLeaveTypes, "Pulsar botón Configure - Leave Types");
    }

    /**
     * Accede a Work Week.
     */
    public void pulsarBotonConfigureWorkWeek(){
        esClickeable(btnConfigureWorkWeek);
        clickElemento(btnConfigureWorkWeek, "Pulsar botón Configure - Work Week");
    }

    /**
     * Accede a Holidays.
     */
    public void pulsarBotonConfigureHolidays(){
        esClickeable(btnConfigureHolidays);
        clickElemento(btnConfigureHolidays, "Pulsar botón Configure - Holidays");
    }

// -------------------------
// LEAVE LIST
// -------------------------

    /**
     * Accede a la pantalla Leave List.
     */
    public void pulsarBotonLeaveList(){
        esClickeable(btnLeaveList);
        clickElemento(btnLeaveList, "Pulsar botón Leave List");
    }

// -------------------------
// ASSIGN LEAVE
// -------------------------

    /**
     * Accede a la pantalla Assign Leave.
     */
    public void pulsarBotonAssignLeave(){
        esClickeable(btnAssignLeave);
        clickElemento(btnAssignLeave, "Pulsar botón Assign Leave");
    }
    //</editor-fold>
}
