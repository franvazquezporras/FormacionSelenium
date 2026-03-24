package org.formacion.pageobject.pantallas.MyInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPersonalDetails = By.xpath("");
    private By btnContactDetails = By.xpath("");
    private By btnEmergencyContact = By.xpath("");
    private By btnDependents = By.xpath("");
    private By btnInmigration = By.xpath("");
    private By btnJob = By.xpath("");
    private By btnSalary = By.xpath("");
    private By btnReportTo = By.xpath("");
    private By btnQualifications = By.xpath("");
    private By btnMemberShips = By.xpath("");
    //añadir componentes de cada seccion
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnPersonalDetails,"Pantalla My Info");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
