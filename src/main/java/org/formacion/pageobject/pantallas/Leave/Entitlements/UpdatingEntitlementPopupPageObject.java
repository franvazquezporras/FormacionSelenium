package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdatingEntitlementPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfirm = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public UpdatingEntitlementPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnConfirm,"Popup Updating Entitlement");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
