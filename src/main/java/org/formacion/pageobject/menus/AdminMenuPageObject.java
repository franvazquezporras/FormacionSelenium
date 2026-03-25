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
