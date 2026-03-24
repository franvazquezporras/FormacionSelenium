package org.formacion.pageobject.pantallas.PIM.Configuration.DataImport;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationDataImportPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnDownload = By.xpath("");
    private By btnUpload = By.xpath("");
    private By btnAgregarFichero = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationDataImportPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnUpload,"Pantalla Data Import");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
