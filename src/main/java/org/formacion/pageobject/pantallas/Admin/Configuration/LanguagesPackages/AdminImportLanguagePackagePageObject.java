package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminImportLanguagePackagePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtCargarFichero = By.xpath("");
    private By btnUpload = By.xpath("");
    private By btnDownload = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminImportLanguagePackagePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnUpload,"Pantalla Importar Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
