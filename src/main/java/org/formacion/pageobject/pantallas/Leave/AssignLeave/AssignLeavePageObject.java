package org.formacion.pageobject.pantallas.Leave.AssignLeave;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignLeavePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaLeaveType = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By txtComments = By.xpath("");
    private By btnAssign = By.xpath("");
    private By listaPartialDays = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AssignLeavePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAssign,"Pantalla Assign Leave");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
