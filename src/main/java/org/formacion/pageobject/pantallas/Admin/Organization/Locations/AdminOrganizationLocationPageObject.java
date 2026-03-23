package org.formacion.pageobject.pantallas.Admin.Organization.Locations;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationLocationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregarLocation = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By txtFiltroCity = By.xpath("");
    private By txtFiltroName = By.xpath("");
    private By listaFiltroCountry = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationLocationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregarLocation,"Pantalla Locations");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
