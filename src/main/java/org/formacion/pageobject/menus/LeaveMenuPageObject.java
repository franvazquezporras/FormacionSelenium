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

    //</editor-fold>
}
