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
    // -------------------------
// USER MANAGEMENT
// -------------------------

    public void pulsarBotonUserManagment(){
        esClickeable(btnUserManagment);
        clickElemento(btnUserManagment, "Pulsar botón User Management");
    }

    public void pulsarBotonUserManagmentUsers(){
        esClickeable(btnUserManagmentUsers);
        clickElemento(btnUserManagmentUsers, "Pulsar botón User Management - Users");
    }

// -------------------------
// JOB
// -------------------------

    public void pulsarBotonJob(){
        esClickeable(btnJob);
        clickElemento(btnJob, "Pulsar botón Job");
    }

    public void pulsarBotonJobJobTitles(){
        esClickeable(btnJobJobTitles);
        clickElemento(btnJobJobTitles, "Pulsar botón Job - Job Titles");
    }

    public void pulsarBotonJobPayGrades(){
        esClickeable(btnJobPayGrades);
        clickElemento(btnJobPayGrades, "Pulsar botón Job - Pay Grades");
    }

    public void pulsarBotonJobEmploymentStatus(){
        esClickeable(btnJobEmploymentStatus);
        clickElemento(btnJobEmploymentStatus, "Pulsar botón Job - Employment Status");
    }

    public void pulsarBotonJobJobCategories(){
        esClickeable(btnJobJobCategories);
        clickElemento(btnJobJobCategories, "Pulsar botón Job - Job Categories");
    }

    public void pulsarBotonJobWorkShifts(){
        esClickeable(btnJobWorkShifts);
        clickElemento(btnJobWorkShifts, "Pulsar botón Job - Work Shifts");
    }

// -------------------------
// ORGANIZATION
// -------------------------

    public void pulsarBotonOrganization(){
        esClickeable(btnOrganization);
        clickElemento(btnOrganization, "Pulsar botón Organization");
    }

    public void pulsarBotonOrganizationGeneralInformation(){
        esClickeable(btnOrganizationGeneralInformation);
        clickElemento(btnOrganizationGeneralInformation, "Pulsar botón Organization - General Information");
    }

    public void pulsarBotonOrganizationLocations(){
        esClickeable(btnOrganizationLocations);
        clickElemento(btnOrganizationLocations, "Pulsar botón Organization - Locations");
    }

    public void pulsarBotonOrganizationStructure(){
        esClickeable(btnOrganizationStructure);
        clickElemento(btnOrganizationStructure, "Pulsar botón Organization - Structure");
    }

// -------------------------
// QUALIFICATIONS
// -------------------------

    public void pulsarBotonQualifications(){
        esClickeable(btnQualifications);
        clickElemento(btnQualifications, "Pulsar botón Qualifications");
    }

    public void pulsarBotonQualificationsSkills(){
        esClickeable(btnQualificationsSkills);
        clickElemento(btnQualificationsSkills, "Pulsar botón Qualifications - Skills");
    }

    public void pulsarBotonQualificationsEducation(){
        esClickeable(btnQualificationsEducation);
        clickElemento(btnQualificationsEducation, "Pulsar botón Qualifications - Education");
    }

    public void pulsarBotonQualificationsLicenses(){
        esClickeable(btnQualificationsLicenses);
        clickElemento(btnQualificationsLicenses, "Pulsar botón Qualifications - Licenses");
    }

    public void pulsarBotonQualificationsLanguages(){
        esClickeable(btnQualificationsLanguages);
        clickElemento(btnQualificationsLanguages, "Pulsar botón Qualifications - Languages");
    }

    public void pulsarBotonQualificationsMemberships(){
        esClickeable(btnQualificationsMemberships);
        clickElemento(btnQualificationsMemberships, "Pulsar botón Qualifications - Memberships");
    }

// -------------------------
// NATIONALITIES
// -------------------------

    public void pulsarBotonNationalities(){
        esClickeable(btnNationalities);
        clickElemento(btnNationalities, "Pulsar botón Nationalities");
    }

// -------------------------
// CORPORATE BRANDING
// -------------------------

    public void pulsarBotonCorporateBranding(){
        esClickeable(btnCorporateBranding);
        clickElemento(btnCorporateBranding, "Pulsar botón Corporate Branding");
    }

// -------------------------
// CONFIGURATION
// -------------------------

    public void pulsarBotonConfiguration(){
        esClickeable(btnConfiguration);
        clickElemento(btnConfiguration, "Pulsar botón Configuration");
    }

    public void pulsarBotonConfigurationEmailConfiguration(){
        esClickeable(btnConfigurationEmailConfiguration);
        clickElemento(btnConfigurationEmailConfiguration, "Pulsar botón Configuration - Email Configuration");
    }

    public void pulsarBotonConfigurationEmailSubscriptions(){
        esClickeable(btnConfigurationEmailSubscriptions);
        clickElemento(btnConfigurationEmailSubscriptions, "Pulsar botón Configuration - Email Subscriptions");
    }

    public void pulsarBotonConfigurationLocalization(){
        esClickeable(btnConfigurationLocalization);
        clickElemento(btnConfigurationLocalization, "Pulsar botón Configuration - Localization");
    }

    public void pulsarBotonConfigurationLanguagePackages(){
        esClickeable(btnConfigurationLanguagePackages);
        clickElemento(btnConfigurationLanguagePackages, "Pulsar botón Configuration - Language Packages");
    }

    public void pulsarBotonConfigurationModules(){
        esClickeable(btnConfigurationModules);
        clickElemento(btnConfigurationModules, "Pulsar botón Configuration - Modules");
    }

    public void pulsarBotonConfigurationSocialMediaAuthentication(){
        esClickeable(btnConfigurationSocialMediaAuthentication);
        clickElemento(btnConfigurationSocialMediaAuthentication, "Pulsar botón Configuration - Social Media Authentication");
    }

    public void pulsarBotonConfigurationRegisterOAuthClient(){
        esClickeable(btnConfigurationRegisterOAuthClient);
        clickElemento(btnConfigurationRegisterOAuthClient, "Pulsar botón Configuration - Register OAuth Client");
    }

    public void pulsarBotonConfigurationLDAPConfiguration(){
        esClickeable(btnConfigurationLDAPConfiguration);
        clickElemento(btnConfigurationLDAPConfiguration, "Pulsar botón Configuration - LDAP Configuration");
    }
    //</editor-fold>
}
