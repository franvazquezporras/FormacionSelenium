package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzShareVideoPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By txtURLVideo = By.xpath("");
    private By btnShare = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public BuzzShareVideoPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtPost,"Popup Share Video");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
