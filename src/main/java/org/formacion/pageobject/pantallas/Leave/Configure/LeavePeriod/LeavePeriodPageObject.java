package org.formacion.pageobject.pantallas.Leave.Configure.LeavePeriod;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePeriodPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaStartMonth = By.xpath("");
    private By listaStartDate = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnReset = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public LeavePeriodPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Leave Period");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
