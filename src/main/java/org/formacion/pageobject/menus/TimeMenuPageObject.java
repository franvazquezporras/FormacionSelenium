package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnTimesheets = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("time.menu.timesheets") + "')]]");
    private By btnTimesheetsMyTimesheets = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.timesheets.myTimesheets") + "')]");
    private By btnTimesheetsEmployeeTimesheets = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.timesheets.employeeTimesheets") + "')]");

    private By btnAttendance = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("time.menu.attendance") + "')]]");
    private By btnAttendanceMyRecords = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.attendance.myRecords") + "')]");
    private By btnAttendancePunchInOut = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.attendance.punchInOut") + "')]");
    private By btnAttendanceEmployeeRecords = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.attendance.employeeRecords") + "')]");
    private By btnAttendanceConfiguration = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.attendance.configuration") + "')]");

    private By btnReports = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("time.menu.reports") + "')]]");
    private By btnReportsProjectReports = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.reports.projectReports") + "')]");
    private By btnReportsEmployeeReports = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.reports.employeeReports") + "')]");
    private By btnReportsAttendanceSummary = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.reports.attendanceSummary") + "')]");

    private By btnProjectInfo = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("time.menu.projectInfo") + "')]]");
    private By btnProjectInfoCustomers = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.projectInfo.customers") + "')]");
    private By btnProjectInfoProjects = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("time.menu.projectInfo.projects") + "')]");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú Time.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public TimeMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú Time esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnTimesheets,"Menu Time");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// TIMESHEETS
// -------------------------

    /**
     * Abre la sección Timesheets.
     */
    public void pulsarBotonTimesheets(){
        esClickeable(btnTimesheets);
        clickElemento(btnTimesheets, "Pulsar botón Timesheets");
    }

    /**
     * Accede a My Timesheets dentro de Timesheets.
     */
    public void pulsarBotonTimesheetsMyTimesheets(){
        esClickeable(btnTimesheetsMyTimesheets);
        clickElemento(btnTimesheetsMyTimesheets, "Pulsar botón Timesheets - My Timesheets");
    }

    /**
     * Accede a Employee Timesheets dentro de Timesheets.
     */
    public void pulsarBotonTimesheetsEmployeeTimesheets(){
        esClickeable(btnTimesheetsEmployeeTimesheets);
        clickElemento(btnTimesheetsEmployeeTimesheets, "Pulsar botón Timesheets - Employee Timesheets");
    }

// -------------------------
// ATTENDANCE
// -------------------------

    /**
     * Abre la sección Attendance.
     */
    public void pulsarBotonAttendance(){
        esClickeable(btnAttendance);
        clickElemento(btnAttendance, "Pulsar botón Attendance");
    }

    /**
     * Accede a My Records dentro de Attendance.
     */
    public void pulsarBotonAttendanceMyRecords(){
        esClickeable(btnAttendanceMyRecords);
        clickElemento(btnAttendanceMyRecords, "Pulsar botón Attendance - My Records");
    }

    /**
     * Accede a Punch In/Out dentro de Attendance.
     */
    public void pulsarBotonAttendancePunchInOut(){
        esClickeable(btnAttendancePunchInOut);
        clickElemento(btnAttendancePunchInOut, "Pulsar botón Attendance - Punch In/Out");
    }

    /**
     * Accede a Employee Records dentro de Attendance.
     */
    public void pulsarBotonAttendanceEmployeeRecords(){
        esClickeable(btnAttendanceEmployeeRecords);
        clickElemento(btnAttendanceEmployeeRecords, "Pulsar botón Attendance - Employee Records");
    }

    /**
     * Accede a Configuration dentro de Attendance.
     */
    public void pulsarBotonAttendanceConfiguration(){
        esClickeable(btnAttendanceConfiguration);
        clickElemento(btnAttendanceConfiguration, "Pulsar botón Attendance - Configuration");
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
     * Accede a Project Reports dentro de Reports.
     */
    public void pulsarBotonReportsProjectReports(){
        esClickeable(btnReportsProjectReports);
        clickElemento(btnReportsProjectReports, "Pulsar botón Reports - Project Reports");
    }

    /**
     * Accede a Employee Reports dentro de Reports.
     */
    public void pulsarBotonReportsEmployeeReports(){
        esClickeable(btnReportsEmployeeReports);
        clickElemento(btnReportsEmployeeReports, "Pulsar botón Reports - Employee Reports");
    }

    /**
     * Accede a Attendance Summary dentro de Reports.
     */
    public void pulsarBotonReportsAttendanceSummary(){
        esClickeable(btnReportsAttendanceSummary);
        clickElemento(btnReportsAttendanceSummary, "Pulsar botón Reports - Attendance Summary");
    }

// -------------------------
// PROJECT INFO
// -------------------------

    /**
     * Abre la sección Project Info.
     */
    public void pulsarBotonProjectInfo(){
        esClickeable(btnProjectInfo);
        clickElemento(btnProjectInfo, "Pulsar botón Project Info");
    }

    /**
     * Accede a Customers dentro de Project Info.
     */
    public void pulsarBotonProjectInfoCustomers(){
        esClickeable(btnProjectInfoCustomers);
        clickElemento(btnProjectInfoCustomers, "Pulsar botón Project Info - Customers");
    }

    /**
     * Accede a Projects dentro de Project Info.
     */
    public void pulsarBotonProjectInfoProjects(){
        esClickeable(btnProjectInfoProjects);
        clickElemento(btnProjectInfoProjects, "Pulsar botón Project Info - Projects");
    }
    //</editor-fold>
}
