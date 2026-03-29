package org.formacion.pageobject.pantallas.Admin.Configuration.Modules;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationModulesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.cssSelector("button[type='submit']");
    private By checkAdminModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.admin.module") + "')]]//input");
    private By checkPimModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.pim.module") + "')]]//input");
    private By checkLeaveModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.leave.module") + "')]]//input");
    private By checkTimeModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.time.module") + "')]]//input");
    private By checkRecruitmentModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.recruitment.module") + "')]]//input");
    private By checkPerformanceModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.performance.module") + "')]]//input");
    private By checkDirectoryModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.directory.module") + "')]]//input");
    private By checkMaintenanceModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.maintenance.module") + "')]]//input");
    private By checkMobile = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.mobile") + "')]]//input");
    private By checkClaimModule = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.claim.module") + "')]]//input");
    private By checkBuzz = By.xpath("//div[p[contains(normalize-space(.), '" + LanguageManager.get("check.buzz.module") + "')]]//input");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de configuración de módulos.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationModulesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de configuración de módulos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla LDAP Configuracion");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES DE MÓDULOS
// -------------------------

    /**
     * Activa o desactiva el módulo Admin.
     * Controla la disponibilidad del módulo de administración.
     */
    public void pulsarCheckAdminModule(){
        esClickeable(checkAdminModule);
        clickElemento(checkAdminModule, "Seleccionar Admin Module");
    }

    /**
     * Activa o desactiva el módulo PIM.
     * Controla la disponibilidad del módulo de gestión de empleados.
     */
    public void pulsarCheckPimModule(){
        esClickeable(checkPimModule);
        clickElemento(checkPimModule, "Seleccionar PIM Module");
    }

    /**
     * Activa o desactiva el módulo Leave.
     * Controla la disponibilidad del módulo de ausencias.
     */
    public void pulsarCheckLeaveModule(){
        esClickeable(checkLeaveModule);
        clickElemento(checkLeaveModule, "Seleccionar Leave Module");
    }

    /**
     * Activa o desactiva el módulo Time.
     * Controla la disponibilidad del módulo de tiempos.
     */
    public void pulsarCheckTimeModule(){
        esClickeable(checkTimeModule);
        clickElemento(checkTimeModule, "Seleccionar Time Module");
    }

    /**
     * Activa o desactiva el módulo Recruitment.
     * Controla la disponibilidad del módulo de reclutamiento.
     */
    public void pulsarCheckRecruitmentModule(){
        esClickeable(checkRecruitmentModule);
        clickElemento(checkRecruitmentModule, "Seleccionar Recruitment Module");
    }

    /**
     * Activa o desactiva el módulo Performance.
     * Controla la disponibilidad del módulo de desempeño.
     */
    public void pulsarCheckPerformanceModule(){
        esClickeable(checkPerformanceModule);
        clickElemento(checkPerformanceModule, "Seleccionar Performance Module");
    }

    /**
     * Activa o desactiva el módulo Directory.
     * Controla la disponibilidad del directorio de empleados.
     */
    public void pulsarCheckDirectoryModule(){
        esClickeable(checkDirectoryModule);
        clickElemento(checkDirectoryModule, "Seleccionar Directory Module");
    }

    /**
     * Activa o desactiva el módulo Maintenance.
     * Controla la disponibilidad del módulo de mantenimiento.
     */
    public void pulsarCheckMaintenanceModule(){
        esClickeable(checkMaintenanceModule);
        clickElemento(checkMaintenanceModule, "Seleccionar Maintenance Module");
    }

    /**
     * Activa o desactiva el módulo Mobile.
     * Controla la disponibilidad de funcionalidades móviles.
     */
    public void pulsarCheckMobile(){
        esClickeable(checkMobile);
        clickElemento(checkMobile, "Seleccionar Mobile Module");
    }

    /**
     * Activa o desactiva el módulo Claim.
     * Controla la disponibilidad del módulo de reclamaciones.
     */
    public void pulsarCheckClaimModule(){
        esClickeable(checkClaimModule);
        clickElemento(checkClaimModule, "Seleccionar Claim Module");
    }

    /**
     * Activa o desactiva el módulo Buzz.
     * Controla la disponibilidad del módulo social Buzz.
     */
    public void pulsarCheckBuzz(){
        esClickeable(checkBuzz);
        clickElemento(checkBuzz, "Seleccionar Buzz Module");
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración de módulos habilitados o deshabilitados.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    // </editor-fold>

}
