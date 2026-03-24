package org.formacion.pageobject.pantallas.PIM.AddEmployee;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFirstName = By.xpath("");
    private By txtMidleName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By txtEmployeeID = By.xpath("");
    private By checkLoginDetails = By.xpath("");
    private By txtUserName = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtRepeatPassword = By.xpath("");
    private By checkStatusEnable = By.xpath("");
    private By checkStatusDisabled = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AddEmployeePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Employee");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
