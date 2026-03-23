package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimSubmitClaimPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaEvent = By.xpath("");
    private By listaCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnCreate = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimSubmitClaimPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnCreate,"Pantalla Submit Claim");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
