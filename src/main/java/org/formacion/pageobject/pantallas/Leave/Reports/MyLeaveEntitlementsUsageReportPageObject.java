package org.formacion.pageobject.pantallas.Leave.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeaveEntitlementsUsageReportPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeavePeriod = By.xpath("");
    private By btnGenerate = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyLeaveEntitlementsUsageReportPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnGenerate,"Pantalla My Leaves Entitlements Usage Report");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
