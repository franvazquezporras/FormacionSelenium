package org.formacion.pageobject.comun;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComunPageObject extends BasePageObject {


    // <editor-fold desc="Locators">
    private By txtMenuLateralSearch = By.name("username");
    private By btnMenuLateralAdmin = By.name("password");
    private By btnMenuLateralPIM = By.xpath("");
    private By btnMenuLateralLeave = By.xpath("");
    private By btnMenuLateralTime = By.xpath("");
    private By btnMenuLateralRecruitment = By.xpath("");
    private By btnMenuLateralMyInfo = By.xpath("");
    private By btnMenuLateralPerformance = By.xpath("");
    private By btnMenuLateralDashboard = By.xpath("");
    private By btnMenuLateralDirectory = By.xpath("");
    private By btnMenuLateralMaintenance = By.xpath("");
    private By btnMenuLateralClaim = By.xpath("");
    private By btnMenuLateralBuzz = By.xpath("");
    private By btnMenuLateralShowHide = By.xpath("");

    private By txtBarraSuperiorNameScreen = By.xpath("");
    private By btnBarraSuperiorUpgrade = By.xpath("");
    private By btnBarraSuperiorMenuUsuario = By.xpath("");
    private By btnBarraSuperiorMenuUsuarioAbout = By.xpath("");
    private By btnBarraSuperiorMenuUsuarioSupport = By.xpath("");
    private By btnBarraSuperiorMenuUsuarioChangePassword = By.xpath("");
    private By btnBarraSuperiorMenuUsuarioLogout = By.xpath("");
    private By btnBarraSuperiorHelp = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ComunPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnMenuLateralShowHide,"Menu lateral");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>

}
