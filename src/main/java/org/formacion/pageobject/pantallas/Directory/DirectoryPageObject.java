package org.formacion.pageobject.pantallas.Directory;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirectoryPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By listaLocation = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public DirectoryPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSearch,"Pantalla Directory");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
