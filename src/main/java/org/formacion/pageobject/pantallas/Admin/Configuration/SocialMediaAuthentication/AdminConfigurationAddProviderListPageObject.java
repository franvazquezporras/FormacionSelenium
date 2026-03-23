package org.formacion.pageobject.pantallas.Admin.Configuration.SocialMediaAuthentication;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationAddProviderListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtClientID = By.xpath("");
    private By txtProviderURL = By.xpath("");
    private By txtClientSecret = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationAddProviderListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Provider");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
