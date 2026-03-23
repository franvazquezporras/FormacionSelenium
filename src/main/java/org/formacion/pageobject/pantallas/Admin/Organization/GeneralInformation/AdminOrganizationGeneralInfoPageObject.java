package org.formacion.pageobject.pantallas.Admin.Organization.GeneralInformation;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationGeneralInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By checkEdit = By.xpath("");
    private By txtOrganizationName = By.xpath("");
    private By txtNumberEmployees = By.xpath("");
    private By txtRegistrationNumber = By.xpath("");
    private By txtTaxID = By.xpath("");
    private By txtPhone = By.xpath("");
    private By txtFax = By.xpath("");
    private By txtEmail = By.xpath("");
    private By txtAddressStreet1 = By.xpath("");
    private By txtAddressStreet2 = By.xpath("");
    private By txtCity = By.xpath("");
    private By txtStateProvince = By.xpath("");
    private By txtPostalCode = By.xpath("");
    private By txtNotes = By.xpath("");
    private By listaCountry = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationGeneralInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEdit,"Pantalla General Info");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
