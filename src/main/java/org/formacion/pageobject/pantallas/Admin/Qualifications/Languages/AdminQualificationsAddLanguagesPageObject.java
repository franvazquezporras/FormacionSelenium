package org.formacion.pageobject.pantallas.Admin.Qualifications.Languages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminQualificationsAddLanguagesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminQualificationsAddLanguagesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
