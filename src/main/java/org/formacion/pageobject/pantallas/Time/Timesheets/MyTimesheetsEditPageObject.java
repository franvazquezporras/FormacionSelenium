package org.formacion.pageobject.pantallas.Time.Timesheets;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTimesheetsEditPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnReset = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtProject = By.xpath("");
    private By listaActivity = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyTimesheetsEditPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit My Timesheet");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
