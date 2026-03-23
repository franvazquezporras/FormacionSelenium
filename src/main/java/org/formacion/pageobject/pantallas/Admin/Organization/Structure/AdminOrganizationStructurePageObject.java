package org.formacion.pageobject.pantallas.Admin.Organization.Structure;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationStructurePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkEditar = By.xpath("");
    private By btnAgregar = By.xpath("");
    private By btnEliminarStructure = By.xpath("");
    private By btnAgregarAStructure = By.xpath("");
    private By btnEditarStructure = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationStructurePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEditar,"Pantalla Structure");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
