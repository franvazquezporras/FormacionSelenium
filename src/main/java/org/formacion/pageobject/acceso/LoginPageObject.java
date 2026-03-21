package org.formacion.pageobject.acceso;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePageObject {

    private By txtUsername = By.name("username");
    private By txtPassword = By.name("password");
    private By btnLogin = By.xpath("//button[@type='submit']");
    public LoginPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }

    public void esperarSincronizacion(){esperarPagina(txtUsername,"Login");}

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
}
