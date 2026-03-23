package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnTimesheets = By.xpath("");
    private By btnTimesheetsMyTimesheets = By.xpath("");
    private By btnTimesheetsEmployeeTimesheets = By.xpath("");

    private By btnAttendance = By.xpath("");
    private By btnAttendanceMyRecords = By.xpath("");
    private By btnAttendancePunchInOut = By.xpath("");
    private By btnAttendanceEmployeeRecords = By.xpath("");
    private By btnAttendanceConfiguration = By.xpath("");

    private By btnReports = By.xpath("");
    private By btnReportsProjectReports = By.xpath("");
    private By btnReportsEmployeeReports = By.xpath("");
    private By btnReportsAttendanceSummary = By.xpath("");

    private By btnProjectInfo = By.xpath("");
    private By btnProjectInfoCustomers = By.xpath("");
    private By btnProjectInfoProjects = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public TimeMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnTimesheets,"Menu Time");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
