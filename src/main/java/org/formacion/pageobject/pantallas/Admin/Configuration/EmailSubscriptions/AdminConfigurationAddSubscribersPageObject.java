package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationAddSubscribersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmail = By.xpath("");
    private By txtName = By.xpath("");
    private By btnCancelar = By.xpath("");
    private By btnAgregar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationAddSubscribersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Popup Agregar Subscriptor");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
