package org.formacion.pageobject.pantallas.Claim.AssignClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimAssignClaimPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaEvent = By.xpath("");
    private By listaCurrency = By.xpath("");
    private By txtRemarks = By.xpath("");
    private By btnShare = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimAssignClaimPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtEmployeeName,"Pantalla Assign Claim");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
