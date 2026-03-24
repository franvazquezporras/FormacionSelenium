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
    public EmployeeReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnView,"Pantalla Employee Report");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
