package org.formacion.pageobject.pantallas.Leave.LeaveList;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeaveType = By.xpath("");
    private By listaSubUnit = By.xpath("");
    private By listaShowLeaveStatus = By.xpath("");
    private By checkIncludePastEmployees = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public LeaveListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSearch,"Pantalla Leave List");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
