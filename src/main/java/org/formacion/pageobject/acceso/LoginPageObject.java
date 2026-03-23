package org.formacion.pageobject.acceso;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.name("username");
    private By txtPassword = By.name("password");
    private By btnLogin = By.xpath("//button[@type='submit']");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public LoginPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){
        esperarPagina(txtUsername,"Login");
    }
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">
    public void IntroducirUsuario(String texto){
        esClickeable(txtUsername);
        setText(txtUsername,texto);
    }

    public void IntroducirPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword,texto);
    }

    public void PulsarLogin(){
        esClickeable(btnLogin);
        clickElemento(btnLogin,"Login");
    }
    //</editor-fold>
}
