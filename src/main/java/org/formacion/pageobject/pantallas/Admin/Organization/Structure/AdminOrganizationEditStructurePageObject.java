package org.formacion.pageobject.pantallas.Admin.Organization.Structure;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationEditStructurePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtUnitId = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationEditStructurePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Popup Edit Structure");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
