package org.formacion.pageobject.comun;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnYes = By.xpath("");
    private By btnNo = By.xpath("");
    private By txtDescription = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public DeletePopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtDescription,"Popup Eliminar");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
