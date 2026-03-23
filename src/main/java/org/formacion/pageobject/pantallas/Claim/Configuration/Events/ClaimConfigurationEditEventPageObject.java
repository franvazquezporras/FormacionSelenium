package org.formacion.pageobject.pantallas.Claim.Configuration.Events;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimConfigurationEditEventPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtEventName = By.xpath("");
    private By txtEventDescription = By.xpath("");
    private By checkActive = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimConfigurationEditEventPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Evento");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
