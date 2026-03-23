package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimViewDetailsAddExpensePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaExpenseType = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtAmount = By.xpath("");
    private By txtNote = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimViewDetailsAddExpensePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Popup Add Expense");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
