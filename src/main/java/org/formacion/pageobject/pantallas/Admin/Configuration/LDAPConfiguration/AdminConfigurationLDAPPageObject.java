package org.formacion.pageobject.pantallas.Admin.Configuration.LDAPConfiguration;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationLDAPPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkEnableLDAP = By.xpath("");
    private By txtHost = By.xpath("");
    private By txtPort = By.xpath("");
    private By listaEncriptado = By.xpath("");
    private By listaLDAPImplementacion = By.xpath("");
    private By checkBindAnonymously = By.xpath("");
    private By txtDistinguishedName = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtBaseDistinguishedName = By.xpath("");
    private By listaSearchScope = By.xpath("");
    private By txtUserNameAttribute = By.xpath("");
    private By txtUserSearchFilter = By.xpath("");
    private By txtUserUniqueIDAttribute = By.xpath("");
    private By txtFirstName = By.xpath("");
    private By txtMiddleName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By txtUserStatus = By.xpath("");
    private By txtWorkEmail= By.xpath("");
    private By txtEmployeeId= By.xpath("");
    private By checkWorkEmail= By.xpath("");
    private By checkEmployeeId = By.xpath("");
    private By checkMergeLDAPUsers = By.xpath("");
    private By txtSyncInterval = By.xpath("");

    private By btnSave = By.xpath("");
    private By btnTestConnection = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationLDAPPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla LDAP Configuracion");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
