package org.formacion.pageobject.pantallas.Admin.Job.WorkShifts;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAddWorkShiftsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtShiftName = By.xpath("");
    private By txtFromHour = By.xpath("");
    private By txtToHour = By.xpath("");
    private By txtDurationPerDay = By.xpath("");
    private By txtAssignedEmployees = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminAddWorkShiftsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Work Shift");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
