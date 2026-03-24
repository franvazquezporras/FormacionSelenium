package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PunchInOutPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnIn = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtTime = By.xpath("");
    private By listaTimezone = By.xpath("");
    private By txtNote = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PunchInOutPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnIn,"Pantalla Punch In Out");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
