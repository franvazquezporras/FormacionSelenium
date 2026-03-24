package org.formacion.pageobject.pantallas.Performance.MyTracker;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceAddTrackerLogPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By btnPositive = By.xpath("");
    private By btnNegative = By.xpath("");
    private By txtLog = By.xpath("");
    private By txtComment = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceAddTrackerLogPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Popup Add Tracker Log");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
