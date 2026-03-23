package org.formacion.pageobject.pantallas.Leave.Configure.Holidays;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddHolidaysPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDate = By.xpath("");
    private By listaFullDay = By.xpath("");
    private By checkRepeatsAnnuallySi = By.xpath("");
    private By checkRepeatsAnnuallyNo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AddHolidaysPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Holidays");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
