package org.formacion.pageobject.pantallas.Leave.Configure.LeaveTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditLeaveTypesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By checkIsEntitlementSituationalSi = By.xpath("");
    private By checkIsEntitlementSituationalNo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public EditLeaveTypesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Leave Type");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
