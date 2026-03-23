package org.formacion.pageobject.pantallas.Dashboard;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnTimeAtWork = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public DashboardPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnTimeAtWork,"Pantalla Dashboard");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
