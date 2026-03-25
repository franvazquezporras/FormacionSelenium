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


// -------------------------
// TIMESHEETS
// -------------------------

    public void pulsarBotonTimesheets(){
        esClickeable(btnTimesheets);
        clickElemento(btnTimesheets, "Pulsar botón Timesheets");
    }

    public void pulsarBotonTimesheetsMyTimesheets(){
        esClickeable(btnTimesheetsMyTimesheets);
        clickElemento(btnTimesheetsMyTimesheets, "Pulsar botón Timesheets - My Timesheets");
    }

    public void pulsarBotonTimesheetsEmployeeTimesheets(){
        esClickeable(btnTimesheetsEmployeeTimesheets);
        clickElemento(btnTimesheetsEmployeeTimesheets, "Pulsar botón Timesheets - Employee Timesheets");
    }

// -------------------------
// ATTENDANCE
// -------------------------

    public void pulsarBotonAttendance(){
        esClickeable(btnAttendance);
        clickElemento(btnAttendance, "Pulsar botón Attendance");
    }

    public void pulsarBotonAttendanceMyRecords(){
        esClickeable(btnAttendanceMyRecords);
        clickElemento(btnAttendanceMyRecords, "Pulsar botón Attendance - My Records");
    }

    public void pulsarBotonAttendancePunchInOut(){
        esClickeable(btnAttendancePunchInOut);
        clickElemento(btnAttendancePunchInOut, "Pulsar botón Attendance - Punch In/Out");
    }

    public void pulsarBotonAttendanceEmployeeRecords(){
        esClickeable(btnAttendanceEmployeeRecords);
        clickElemento(btnAttendanceEmployeeRecords, "Pulsar botón Attendance - Employee Records");
    }

    public void pulsarBotonAttendanceConfiguration(){
        esClickeable(btnAttendanceConfiguration);
        clickElemento(btnAttendanceConfiguration, "Pulsar botón Attendance - Configuration");
    }

// -------------------------
// REPORTS
// -------------------------

    public void pulsarBotonReports(){
        esClickeable(btnReports);
        clickElemento(btnReports, "Pulsar botón Reports");
    }

    public void pulsarBotonReportsProjectReports(){
        esClickeable(btnReportsProjectReports);
        clickElemento(btnReportsProjectReports, "Pulsar botón Reports - Project Reports");
    }

    public void pulsarBotonReportsEmployeeReports(){
        esClickeable(btnReportsEmployeeReports);
        clickElemento(btnReportsEmployeeReports, "Pulsar botón Reports - Employee Reports");
    }

    public void pulsarBotonReportsAttendanceSummary(){
        esClickeable(btnReportsAttendanceSummary);
        clickElemento(btnReportsAttendanceSummary, "Pulsar botón Reports - Attendance Summary");
    }

// -------------------------
// PROJECT INFO
// -------------------------

    public void pulsarBotonProjectInfo(){
        esClickeable(btnProjectInfo);
        clickElemento(btnProjectInfo, "Pulsar botón Project Info");
    }

    public void pulsarBotonProjectInfoCustomers(){
        esClickeable(btnProjectInfoCustomers);
        clickElemento(btnProjectInfoCustomers, "Pulsar botón Project Info - Customers");
    }

    public void pulsarBotonProjectInfoProjects(){
        esClickeable(btnProjectInfoProjects);
        clickElemento(btnProjectInfoProjects, "Pulsar botón Project Info - Projects");
    }
    //</editor-fold>
}
