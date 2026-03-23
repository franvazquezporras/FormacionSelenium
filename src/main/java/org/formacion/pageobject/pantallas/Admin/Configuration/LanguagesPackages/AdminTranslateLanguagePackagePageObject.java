package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminTranslateLanguagePackagePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaModulo = By.xpath("");
    private By txtSourceText = By.xpath("");
    private By txtTraslatedText = By.xpath("");
    private By listaShow = By.xpath("");
    private By listaOrder = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");


    private By btnCancel = By.xpath("");
    private By btnSave = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminTranslateLanguagePackagePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Tranducir Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
