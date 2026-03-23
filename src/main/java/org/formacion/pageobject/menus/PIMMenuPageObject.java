package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfiguration = By.xpath("");
    private By btnConfigurationOptionalFields = By.xpath("");
    private By btnConfigurationCustomFields = By.xpath("");
    private By btnConfigurationDataImport = By.xpath("");
    private By btnConfigurationReportingMethods = By.xpath("");
    private By btnConfigurationTerminationReasons = By.xpath("");

    private By btnEmployeeList = By.xpath("");

    private By btnAddEmployee = By.xpath("");

    private By btnReports = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnEmployeeList,"Menu Performance");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
