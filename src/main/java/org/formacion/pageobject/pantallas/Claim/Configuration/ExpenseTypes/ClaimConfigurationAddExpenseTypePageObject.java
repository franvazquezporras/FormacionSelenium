package org.formacion.pageobject.pantallas.Claim.Configuration.ExpenseTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimConfigurationAddExpenseTypePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By checkActive = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimConfigurationAddExpenseTypePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Event Type");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
