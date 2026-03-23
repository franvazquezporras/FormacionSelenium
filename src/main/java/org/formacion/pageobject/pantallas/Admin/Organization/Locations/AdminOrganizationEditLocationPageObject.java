package org.formacion.pageobject.pantallas.Admin.Organization.Locations;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationEditLocationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtCity = By.xpath("");
    private By txtProvince = By.xpath("");
    private By txtPostalCode = By.xpath("");
    private By listaCountry = By.xpath("");
    private By txtPhone = By.xpath("");
    private By txtFax = By.xpath("");
    private By txtAddress = By.xpath("");
    private By txtNotes = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationEditLocationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Location");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
