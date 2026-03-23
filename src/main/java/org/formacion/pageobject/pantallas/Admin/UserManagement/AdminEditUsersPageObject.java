package org.formacion.pageobject.pantallas.Admin.UserManagement;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminEditUsersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.xpath("");
    private By listaRol = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaStatus = By.xpath("");
    private By checkChangePassword = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtRepeatPassword = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminEditUsersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Usuario");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
