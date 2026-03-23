package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfiguration = By.xpath("");
    private By btnConfigurationEvents = By.xpath("");
    private By btnConfigurationExpensesTypes = By.xpath("");

    private By btnSubmitClaim = By.xpath("");

    private By btnMyClaims = By.xpath("");

    private By btnEmployeeClaims = By.xpath("");

    private By btnAssignClaim = By.xpath("");


    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnEmployeeClaims,"Menu Claim");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
