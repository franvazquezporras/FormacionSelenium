package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfigure = By.xpath("");
    private By btnConfigureKPIs = By.xpath("");
    private By btnConfigureTrackers = By.xpath("");

    private By btnManageReviews = By.xpath("");
    private By btnManageReviewsManageReviews = By.xpath("");
    private By btnManageReviewsMyReviews = By.xpath("");
    private By btnManageReviewsEmployeeReviews = By.xpath("");

    private By btnMyTrackers = By.xpath("");

    private By btnEmployeeTrackers = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }

    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnManageReviews,"Menu Performance");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
