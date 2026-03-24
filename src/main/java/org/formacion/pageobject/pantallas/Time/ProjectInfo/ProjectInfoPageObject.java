package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAdd = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtCustomerName = By.xpath("");
    private By txtProject = By.xpath("");
    private By txtProjectAdmin = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEditar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ProjectInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAdd,"Pantalla Project Info");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
