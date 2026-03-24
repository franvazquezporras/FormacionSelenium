package org.formacion.pageobject.pantallas.PIM.Configuration.CustomFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationCustomFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEditar = By.xpath("");
    private By btnBorrar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationCustomFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Pantalla Custom Field");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
