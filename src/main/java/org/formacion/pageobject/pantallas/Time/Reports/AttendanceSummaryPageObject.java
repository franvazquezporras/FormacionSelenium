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
    public AttendanceSummaryPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnView,"Pantalla Attendance Summary ");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
