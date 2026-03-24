package org.formacion.pageobject.pantallas.Performance.Configure.KPIs;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceConfigureEditKPIPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtKeyPerformanceIndicator = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By txtMinimumRating = By.xpath("");
    private By txtMaximumRating = By.xpath("");
    private By checkMakeDefaultScale = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceConfigureEditKPIPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar KPI");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
