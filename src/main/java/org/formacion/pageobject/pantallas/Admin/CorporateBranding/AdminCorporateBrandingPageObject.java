package org.formacion.pageobject.pantallas.Admin.CorporateBranding;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCorporateBrandingPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPublish = By.xpath("");
    private By btnPreview = By.xpath("");
    private By btnResetToDefault = By.xpath("");
    private By txtClientLogo = By.xpath("");
    private By txtClientBanner = By.xpath("");
    private By txtLoginBanner = By.xpath("");

    private By btnPrimaryColor = By.xpath("");
    private By btnPrimaryFontColor = By.xpath("");
    private By btnPrimaryGradientColor1 = By.xpath("");
    private By btnSecondaryColor = By.xpath("");
    private By btnSecondaryFontColor = By.xpath("");
    private By btnPrimaryGradientColor2 = By.xpath("");
    private By checkSocialMediaImages = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminCorporateBrandingPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnPublish,"Pantalla Corporate Branding");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
