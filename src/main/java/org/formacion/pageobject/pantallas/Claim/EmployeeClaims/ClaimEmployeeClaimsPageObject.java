package org.formacion.pageobject.pantallas.Claim.EmployeeClaims;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimEmployeeClaimsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By txtReferenceId = By.xpath("");
    private By listaEventName = By.xpath("");
    private By listaStatus = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By listaInclude = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAssignClaim = By.xpath("");
    private By btnViewDetailsPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimEmployeeClaimsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAssignClaim,"Pantalla Employee Claims");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
