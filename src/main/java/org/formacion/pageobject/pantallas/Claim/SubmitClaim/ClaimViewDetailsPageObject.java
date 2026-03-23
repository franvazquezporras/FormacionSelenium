package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimViewDetailsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtReferenceID = By.xpath("");
    private By txtEvent = By.xpath("");
    private By txtStatus = By.xpath("");
    private By txtCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnAddExpense = By.xpath("");
    private By btnEditarExpense = By.xpath("");
    private By btnBorrarExpense = By.xpath("");
    private By checkPrimerRegistroExpenses = By.xpath("");
    private By btnAddAttachments = By.xpath("");
    private By btnEditarAttachments = By.xpath("");
    private By btnBorrarAttachments = By.xpath("");
    private By btnDescargarAttachments = By.xpath("");
    private By checkPrimerRegistroAttachments = By.xpath("");

    private By btnBack = By.xpath("");
    private By btnCancel = By.xpath("");
    private By btnSubmit = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimViewDetailsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtReferenceID,"Pantalla View Details Claim");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
