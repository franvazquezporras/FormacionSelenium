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
    public LeaveMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnLeaveList,"Menu Leave");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">


// -------------------------
// APPLY
// -------------------------

    public void pulsarBotonApply(){
        esClickeable(btnApply);
        clickElemento(btnApply, "Pulsar botón Apply");
    }

// -------------------------
// MY LEAVE
// -------------------------

    public void pulsarBotonMyLeave(){
        esClickeable(btnMyLeave);
        clickElemento(btnMyLeave, "Pulsar botón My Leave");
    }

// -------------------------
// ENTITLEMENTS
// -------------------------

    public void pulsarBotonEntitlements(){
        esClickeable(btnEntitlements);
        clickElemento(btnEntitlements, "Pulsar botón Entitlements");
    }

    public void pulsarBotonEntitlementsAddEntitlements(){
        esClickeable(btnEntitlementsAddEntitlements);
        clickElemento(btnEntitlementsAddEntitlements, "Pulsar botón Entitlements - Add Entitlements");
    }

    public void pulsarBotonEntitlementsEmployeeEntitlements(){
        esClickeable(btnEntitlementsEmployeeEntitlements);
        clickElemento(btnEntitlementsEmployeeEntitlements, "Pulsar botón Entitlements - Employee Entitlements");
    }

    public void pulsarBotonEntitlementsMyEntitlements(){
        esClickeable(btnEntitlementsMyEntitlements);
        clickElemento(btnEntitlementsMyEntitlements, "Pulsar botón Entitlements - My Entitlements");
    }

// -------------------------
// REPORTS
// -------------------------

    public void pulsarBotonReports(){
        esClickeable(btnReports);
        clickElemento(btnReports, "Pulsar botón Reports");
    }

    public void pulsarBotonReportsLeaveEntitlementsUsageReport(){
        esClickeable(btnReportsLeaveEntitlementsUsageReport);
        clickElemento(btnReportsLeaveEntitlementsUsageReport, "Pulsar botón Reports - Leave Entitlements Usage Report");
    }

    public void pulsarBotonReportsMyLeaveEntitlementsUsageReport(){
        esClickeable(btnReportsMyLeaveEntitlementsUsageReport);
        clickElemento(btnReportsMyLeaveEntitlementsUsageReport, "Pulsar botón Reports - My Leave Entitlements Usage Report");
    }

// -------------------------
// CONFIGURE
// -------------------------

    public void pulsarBotonConfigure(){
        esClickeable(btnConfigure);
        clickElemento(btnConfigure, "Pulsar botón Configure");
    }

    public void pulsarBotonConfigureLeavePeriod(){
        esClickeable(btnConfigureLeavePeriod);
        clickElemento(btnConfigureLeavePeriod, "Pulsar botón Configure - Leave Period");
    }

    public void pulsarBotonConfigureLeaveTypes(){
        esClickeable(btnConfigureLeaveTypes);
        clickElemento(btnConfigureLeaveTypes, "Pulsar botón Configure - Leave Types");
    }

    public void pulsarBotonConfigureWorkWeek(){
        esClickeable(btnConfigureWorkWeek);
        clickElemento(btnConfigureWorkWeek, "Pulsar botón Configure - Work Week");
    }

    public void pulsarBotonConfigureHolidays(){
        esClickeable(btnConfigureHolidays);
        clickElemento(btnConfigureHolidays, "Pulsar botón Configure - Holidays");
    }

// -------------------------
// LEAVE LIST
// -------------------------

    public void pulsarBotonLeaveList(){
        esClickeable(btnLeaveList);
        clickElemento(btnLeaveList, "Pulsar botón Leave List");
    }

// -------------------------
// ASSIGN LEAVE
// -------------------------

    public void pulsarBotonAssignLeave(){
        esClickeable(btnAssignLeave);
        clickElemento(btnAssignLeave, "Pulsar botón Assign Leave");
    }
    //</editor-fold>
}
