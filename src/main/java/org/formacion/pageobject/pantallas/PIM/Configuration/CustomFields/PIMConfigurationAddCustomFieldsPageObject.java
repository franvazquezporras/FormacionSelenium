package org.formacion.pageobject.pantallas.PIM.Configuration.CustomFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationAddCustomFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFieldName = By.xpath("");
    private By listaScreen = By.xpath("");
    private By listaType = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationAddCustomFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Custom Field");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
