package org.formacion.pageobject.pantallas.Leave.MyLeaves;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeavesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">

    private By listaShowLeaveStatus = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAccionesPrimerRegistro = By.xpath("");
    private By btnAddComment = By.xpath("");
    private By btnViewLeavesDetails = By.xpath("");
    private By btnViewPIMInfo = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyLeavesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSearch,"Pantalla My Leaves");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
