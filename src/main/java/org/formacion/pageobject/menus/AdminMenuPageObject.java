package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnUserManagment = By.xpath("");
    private By btnUserManagmentUsers = By.xpath("");

    private By btnJob = By.xpath("");
    private By btnJobJobTitles = By.xpath("");
    private By btnJobPayGrades = By.xpath("");
    private By btnJobEmploymentStatus = By.xpath("");
    private By btnJobJobCategories = By.xpath("");
    private By btnJobWorkShifts = By.xpath("");

    private By btnOrganization = By.xpath("");
    private By btnOrganizationGeneralInformation = By.xpath("");
    private By btnOrganizationLocations = By.xpath("");
    private By btnOrganizationStructure = By.xpath("");

    private By btnQualifications = By.xpath("");
    private By btnQualificationsSkills = By.xpath("");
    private By btnQualificationsEducation = By.xpath("");
    private By btnQualificationsLicenses = By.xpath("");
    private By btnQualificationsLanguages = By.xpath("");
    private By btnQualificationsMemberships = By.xpath("");

    private By btnNationalities = By.xpath("");

    private By btnCorporateBranding = By.xpath("");

    private By btnConfiguration = By.xpath("");
    private By btnConfigurationEmailConfiguration = By.xpath("");
    private By btnConfigurationEmailSubscriptions = By.xpath("");
    private By btnConfigurationLocalization = By.xpath("");
    private By btnConfigurationLanguagePackages = By.xpath("");
    private By btnConfigurationModules = By.xpath("");
    private By btnConfigurationSocialMediaAuthentication = By.xpath("");
    private By btnConfigurationRegisterOAuthClient = By.xpath("");
    private By btnConfigurationLDAPConfiguration = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnUserManagment,"Menu lateral");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
