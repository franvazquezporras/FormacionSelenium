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


// -------------------------
// CONFIGURATION
// -------------------------

    public void pulsarBotonConfiguration(){
        esClickeable(btnConfiguration);
        clickElemento(btnConfiguration, "Pulsar botón Configuration");
    }

    public void pulsarBotonConfigurationEvents(){
        esClickeable(btnConfigurationEvents);
        clickElemento(btnConfigurationEvents, "Pulsar botón Configuration - Events");
    }

    public void pulsarBotonConfigurationExpensesTypes(){
        esClickeable(btnConfigurationExpensesTypes);
        clickElemento(btnConfigurationExpensesTypes, "Pulsar botón Configuration - Expenses Types");
    }

// -------------------------
// SUBMIT CLAIM
// -------------------------

    public void pulsarBotonSubmitClaim(){
        esClickeable(btnSubmitClaim);
        clickElemento(btnSubmitClaim, "Pulsar botón Submit Claim");
    }

// -------------------------
// MY CLAIMS
// -------------------------

    public void pulsarBotonMyClaims(){
        esClickeable(btnMyClaims);
        clickElemento(btnMyClaims, "Pulsar botón My Claims");
    }

// -------------------------
// EMPLOYEE CLAIMS
// -------------------------

    public void pulsarBotonEmployeeClaims(){
        esClickeable(btnEmployeeClaims);
        clickElemento(btnEmployeeClaims, "Pulsar botón Employee Claims");
    }

// -------------------------
// ASSIGN CLAIM
// -------------------------

    public void pulsarBotonAssignClaim(){
        esClickeable(btnAssignClaim);
        clickElemento(btnAssignClaim, "Pulsar botón Assign Claim");
    }
    //</editor-fold>
}
