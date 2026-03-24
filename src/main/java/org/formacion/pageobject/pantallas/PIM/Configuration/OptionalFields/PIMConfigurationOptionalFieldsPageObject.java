package org.formacion.pageobject.pantallas.PIM.Configuration.OptionalFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationOptionalFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By checkShowNickName = By.xpath("");
    private By checkShowSSNfield = By.xpath("");
    private By checkShowSINfield = By.xpath("");
    private By checkShowUSTax = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationOptionalFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Optional Fields");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
