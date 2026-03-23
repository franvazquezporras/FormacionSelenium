package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzEditPostPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By btnPost = By.xpath("");
    private By btnShareFoto = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public BuzzEditPostPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtPost,"Popup Edit Post");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
