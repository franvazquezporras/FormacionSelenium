package org.formacion.pageobject.pantallas.Admin.Job.EmploymentStatus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAddEmploymentStatusPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminAddEmploymentStatusPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Employment status");}
    //</editor-fold>
}
