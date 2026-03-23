package org.formacion.pageobject.pantallas.Admin.Configuration.Modules;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationModulesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By checkAdminModule = By.xpath("");
    private By checkPimModule = By.xpath("");
    private By checkLeaveModule = By.xpath("");
    private By checkTimeModule = By.xpath("");
    private By checkRecruitmentModule = By.xpath("");
    private By checkPerformanceModule = By.xpath("");
    private By checkDirectoryModule = By.xpath("");
    private By checkMaintenanceModule = By.xpath("");
    private By checkMobile = By.xpath("");
    private By checkClaimModule = By.xpath("");
    private By checkBuzz = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationModulesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla LDAP Configuracion");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
