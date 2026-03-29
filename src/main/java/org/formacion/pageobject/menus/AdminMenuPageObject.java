package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnUserManagment =  By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("admin.menu.userManagement") + "')]]");
    private By btnUserManagmentUsers = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.userManagement.user") + "')]");

    private By btnJob = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job") + "')]]");
    private By btnJobJobTitles = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job.jobTitle") + "')]");
    private By btnJobPayGrades = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job.payGrades") + "')]");
    private By btnJobEmploymentStatus = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job.employeeStatus") + "')]");
    private By btnJobJobCategories = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job.jobCategories") + "')]");
    private By btnJobWorkShifts = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.job.workShifts") + "')]");

    private By btnOrganization = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("admin.menu.organization") + "')]]");
    private By btnOrganizationGeneralInformation = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.organization.generalInformation") + "')]");
    private By btnOrganizationLocations = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.organization.locations") + "')]");
    private By btnOrganizationStructure = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.organization.structure") + "')]");

    private By btnQualifications = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications") + "')]]");
    private By btnQualificationsSkills = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications.skills") + "')]");
    private By btnQualificationsEducation = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications.education") + "')]");
    private By btnQualificationsLicenses = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications.licenses") + "')]");
    private By btnQualificationsLanguages = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications.languages") + "')]");
    private By btnQualificationsMemberships = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.qualifications.membership") + "')]");

    private By btnNationalities = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.nationalities") + "')]");

    private By btnCorporateBranding = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.corporateBranding") + "')]");

    private By btnConfiguration = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration") + "')]]");
    private By btnConfigurationEmailConfiguration = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.emailConfiguration") + "')]");
    private By btnConfigurationEmailSubscriptions = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.emailSubscription") + "')]");
    private By btnConfigurationLocalization = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.localization") + "')]");
    private By btnConfigurationLanguagePackages = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.languagePackage") + "')]");
    private By btnConfigurationModules = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.modules") + "')]");
    private By btnConfigurationSocialMediaAuthentication = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.socialMediaAuthentication") + "')]");
    private By btnConfigurationRegisterOAuthClient = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.registerOauthClient") + "')]");
    private By btnConfigurationLDAPConfiguration = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("admin.menu.configuration.LDAPConfiguration") + "')]");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú Admin.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú Admin esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnUserManagment,"Menu lateral");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// USER MANAGEMENT
// -------------------------

    /**
     * Abre la sección User Management.
     */
    public void pulsarBotonUserManagment(){
        esClickeable(btnUserManagment);
        clickElemento(btnUserManagment, "Pulsar botón User Management");
    }

    /**
     * Accede a la opción Users dentro de User Management.
     */
    public void pulsarBotonUserManagmentUsers(){
        esClickeable(btnUserManagmentUsers);
        clickElemento(btnUserManagmentUsers, "Pulsar botón User Management - Users");
    }

// -------------------------
// JOB
// -------------------------

    /**
     * Abre la sección Job.
     */
    public void pulsarBotonJob(){
        esClickeable(btnJob);
        clickElemento(btnJob, "Pulsar botón Job");
    }

    /**
     * Accede a Job Titles.
     */
    public void pulsarBotonJobJobTitles(){
        esClickeable(btnJobJobTitles);
        clickElemento(btnJobJobTitles, "Pulsar botón Job - Job Titles");
    }

    /**
     * Accede a Pay Grades.
     */
    public void pulsarBotonJobPayGrades(){
        esClickeable(btnJobPayGrades);
        clickElemento(btnJobPayGrades, "Pulsar botón Job - Pay Grades");
    }

    /**
     * Accede a Employment Status.
     */
    public void pulsarBotonJobEmploymentStatus(){
        esClickeable(btnJobEmploymentStatus);
        clickElemento(btnJobEmploymentStatus, "Pulsar botón Job - Employment Status");
    }

    /**
     * Accede a Job Categories.
     */
    public void pulsarBotonJobJobCategories(){
        esClickeable(btnJobJobCategories);
        clickElemento(btnJobJobCategories, "Pulsar botón Job - Job Categories");
    }

    /**
     * Accede a Work Shifts.
     */
    public void pulsarBotonJobWorkShifts(){
        esClickeable(btnJobWorkShifts);
        clickElemento(btnJobWorkShifts, "Pulsar botón Job - Work Shifts");
    }

// -------------------------
// ORGANIZATION
// -------------------------

    /**
     * Abre la sección Organization.
     */
    public void pulsarBotonOrganization(){
        esClickeable(btnOrganization);
        clickElemento(btnOrganization, "Pulsar botón Organization");
    }

    /**
     * Accede a General Information.
     */
    public void pulsarBotonOrganizationGeneralInformation(){
        esClickeable(btnOrganizationGeneralInformation);
        clickElemento(btnOrganizationGeneralInformation, "Pulsar botón Organization - General Information");
    }

    /**
     * Accede a Locations.
     */
    public void pulsarBotonOrganizationLocations(){
        esClickeable(btnOrganizationLocations);
        clickElemento(btnOrganizationLocations, "Pulsar botón Organization - Locations");
    }

    /**
     * Accede a Structure.
     */
    public void pulsarBotonOrganizationStructure(){
        esClickeable(btnOrganizationStructure);
        clickElemento(btnOrganizationStructure, "Pulsar botón Organization - Structure");
    }

// -------------------------
// QUALIFICATIONS
// -------------------------

    /**
     * Abre la sección Qualifications.
     */
    public void pulsarBotonQualifications(){
        esClickeable(btnQualifications);
        clickElemento(btnQualifications, "Pulsar botón Qualifications");
    }

    /**
     * Accede a Skills.
     */
    public void pulsarBotonQualificationsSkills(){
        esClickeable(btnQualificationsSkills);
        clickElemento(btnQualificationsSkills, "Pulsar botón Qualifications - Skills");
    }

    /**
     * Accede a Education.
     */
    public void pulsarBotonQualificationsEducation(){
        esClickeable(btnQualificationsEducation);
        clickElemento(btnQualificationsEducation, "Pulsar botón Qualifications - Education");
    }

    /**
     * Accede a Licenses.
     */
    public void pulsarBotonQualificationsLicenses(){
        esClickeable(btnQualificationsLicenses);
        clickElemento(btnQualificationsLicenses, "Pulsar botón Qualifications - Licenses");
    }

    /**
     * Accede a Languages.
     */
    public void pulsarBotonQualificationsLanguages(){
        esClickeable(btnQualificationsLanguages);
        clickElemento(btnQualificationsLanguages, "Pulsar botón Qualifications - Languages");
    }

    /**
     * Accede a Memberships.
     */
    public void pulsarBotonQualificationsMemberships(){
        esClickeable(btnQualificationsMemberships);
        clickElemento(btnQualificationsMemberships, "Pulsar botón Qualifications - Memberships");
    }

// -------------------------
// NATIONALITIES
// -------------------------

    /**
     * Accede a Nationalities.
     */
    public void pulsarBotonNationalities(){
        esClickeable(btnNationalities);
        clickElemento(btnNationalities, "Pulsar botón Nationalities");
    }

// -------------------------
// CORPORATE BRANDING
// -------------------------

    /**
     * Accede a Corporate Branding.
     */
    public void pulsarBotonCorporateBranding(){
        esClickeable(btnCorporateBranding);
        clickElemento(btnCorporateBranding, "Pulsar botón Corporate Branding");
    }

// -------------------------
// CONFIGURATION
// -------------------------

    /**
     * Abre la sección Configuration.
     */
    public void pulsarBotonConfiguration(){
        esClickeable(btnConfiguration);
        clickElemento(btnConfiguration, "Pulsar botón Configuration");
    }

    /**
     * Accede a Email Configuration.
     */
    public void pulsarBotonConfigurationEmailConfiguration(){
        esClickeable(btnConfigurationEmailConfiguration);
        clickElemento(btnConfigurationEmailConfiguration, "Pulsar botón Configuration - Email Configuration");
    }

    /**
     * Accede a Email Subscriptions.
     */
    public void pulsarBotonConfigurationEmailSubscriptions(){
        esClickeable(btnConfigurationEmailSubscriptions);
        clickElemento(btnConfigurationEmailSubscriptions, "Pulsar botón Configuration - Email Subscriptions");
    }

    /**
     * Accede a Localization.
     */
    public void pulsarBotonConfigurationLocalization(){
        esClickeable(btnConfigurationLocalization);
        clickElemento(btnConfigurationLocalization, "Pulsar botón Configuration - Localization");
    }

    /**
     * Accede a Language Packages.
     */
    public void pulsarBotonConfigurationLanguagePackages(){
        esClickeable(btnConfigurationLanguagePackages);
        clickElemento(btnConfigurationLanguagePackages, "Pulsar botón Configuration - Language Packages");
    }

    /**
     * Accede a Modules.
     */
    public void pulsarBotonConfigurationModules(){
        esClickeable(btnConfigurationModules);
        clickElemento(btnConfigurationModules, "Pulsar botón Configuration - Modules");
    }

    /**
     * Accede a Social Media Authentication.
     */
    public void pulsarBotonConfigurationSocialMediaAuthentication(){
        esClickeable(btnConfigurationSocialMediaAuthentication);
        clickElemento(btnConfigurationSocialMediaAuthentication, "Pulsar botón Configuration - Social Media Authentication");
    }

    /**
     * Accede a Register OAuth Client.
     */
    public void pulsarBotonConfigurationRegisterOAuthClient(){
        esClickeable(btnConfigurationRegisterOAuthClient);
        clickElemento(btnConfigurationRegisterOAuthClient, "Pulsar botón Configuration - Register OAuth Client");
    }

    /**
     * Accede a LDAP Configuration.
     */
    public void pulsarBotonConfigurationLDAPConfiguration(){
        esClickeable(btnConfigurationLDAPConfiguration);
        clickElemento(btnConfigurationLDAPConfiguration, "Pulsar botón Configuration - LDAP Configuration");
    }
    //</editor-fold>
}
