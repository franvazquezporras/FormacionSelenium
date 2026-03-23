package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAddLanguagePackagePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaName = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminAddLanguagePackagePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Tranducir Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
