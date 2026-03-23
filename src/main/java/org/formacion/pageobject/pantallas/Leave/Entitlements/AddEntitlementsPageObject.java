package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEntitlementsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkAddToIndividualEmployee = By.xpath("");
    private By checkAddToMultipleEmployees = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaLeaveType = By.xpath("");
    private By listaLeavePeriod = By.xpath("");
    private By txtEntitlement = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AddEntitlementsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Entitlements");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
