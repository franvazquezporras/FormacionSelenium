package org.formacion.pageobject.pantallas.Admin.Configuration.EmailConfiguration;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationEmailConfigurationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtMailSentAs = By.xpath("");
    private By checkSecureSMTP = By.xpath("");
    private By checkSMTP = By.xpath("");
    private By checkSendmail = By.xpath("");
    private By txtSMTPHost = By.xpath("");
    private By txtSMTPPort = By.xpath("");
    private By checkUseSMTPAuthenticationYes = By.xpath("");
    private By checkUseSMTPAuthenticationNo = By.xpath("");
    private By checkTLS = By.xpath("");
    private By checkSendTestMail = By.xpath("");

    private By btnSave = By.xpath("");
    private By btnReset = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationEmailConfigurationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtMailSentAs,"Pantalla Configuracion Email");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
