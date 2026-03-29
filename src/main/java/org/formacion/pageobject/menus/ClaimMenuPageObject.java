package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfiguration = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("claim.menu.configuration") + "')]]");
    private By btnConfigurationEvents = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.configuration.events") + "')]");
    private By btnConfigurationExpensesTypes = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.configuration.expenseTypes") + "')]");

    private By btnSubmitClaim = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.submitClaim") + "')]");

    private By btnMyClaims = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.myClaim") + "')]");

    private By btnEmployeeClaims = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.employeeClaim") + "')]");

    private By btnAssignClaim = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("claim.menu.assignClaim") + "')]");


    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú Claim.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú Claim esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnEmployeeClaims,"Menu Claim");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CONFIGURATION
// -------------------------

    /**
     * Abre la sección Configuration del módulo Claim.
     */
    public void pulsarBotonConfiguration(){
        esClickeable(btnConfiguration);
        clickElemento(btnConfiguration, "Pulsar botón Configuration");
    }

    /**
     * Accede a la opción Events dentro de Configuration.
     */
    public void pulsarBotonConfigurationEvents(){
        esClickeable(btnConfigurationEvents);
        clickElemento(btnConfigurationEvents, "Pulsar botón Configuration - Events");
    }

    /**
     * Accede a la opción Expenses Types dentro de Configuration.
     */
    public void pulsarBotonConfigurationExpensesTypes(){
        esClickeable(btnConfigurationExpensesTypes);
        clickElemento(btnConfigurationExpensesTypes, "Pulsar botón Configuration - Expenses Types");
    }

// -------------------------
// SUBMIT CLAIM
// -------------------------

    /**
     * Accede a la pantalla para enviar un nuevo Claim.
     */
    public void pulsarBotonSubmitClaim(){
        esClickeable(btnSubmitClaim);
        clickElemento(btnSubmitClaim, "Pulsar botón Submit Claim");
    }

// -------------------------
// MY CLAIMS
// -------------------------

    /**
     * Accede a la sección My Claims.
     */
    public void pulsarBotonMyClaims(){
        esClickeable(btnMyClaims);
        clickElemento(btnMyClaims, "Pulsar botón My Claims");
    }

// -------------------------
// EMPLOYEE CLAIMS
// -------------------------

    /**
     * Accede a la sección Employee Claims.
     */
    public void pulsarBotonEmployeeClaims(){
        esClickeable(btnEmployeeClaims);
        clickElemento(btnEmployeeClaims, "Pulsar botón Employee Claims");
    }

// -------------------------
// ASSIGN CLAIM
// -------------------------

    /**
     * Accede a la sección Assign Claim.
     */
    public void pulsarBotonAssignClaim(){
        esClickeable(btnAssignClaim);
        clickElemento(btnAssignClaim, "Pulsar botón Assign Claim");
    }
    //</editor-fold>
}
