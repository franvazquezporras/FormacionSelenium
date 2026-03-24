package org.formacion.pageobject.pantallas.Time.Timesheets;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTimesheetsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnEdit = By.xpath("");
    private By btnSubmit = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyTimesheetsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnEdit,"Pantalla My Timesheet");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
