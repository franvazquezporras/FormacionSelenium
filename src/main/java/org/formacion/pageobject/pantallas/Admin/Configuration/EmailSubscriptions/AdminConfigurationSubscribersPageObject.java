package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationSubscribersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkPrimerRegistro = By.xpath("");
    private By btnEliminarRegistrosSeleccionados = By.xpath("");
    private By btnEliminarRegistro = By.xpath("");
    private By btnEditarRegistro = By.xpath("");
    private By btnAgregarSubscriber = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationSubscribersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregarSubscriber,"Pantalla Listado Subscriptores");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
