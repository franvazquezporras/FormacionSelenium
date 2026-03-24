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

    //</editor-fold>
}
