package org.formacion.pageobject.pantallas.Admin.UserManagement;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.xpath("");
    private By listaRol = By.xpath("");
    private By txtEmployeename = By.xpath("");
    private By listaStatus = By.xpath("");

    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");

    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminUsersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Pantalla Users");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
