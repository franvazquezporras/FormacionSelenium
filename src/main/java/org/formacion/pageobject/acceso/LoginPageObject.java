package org.formacion.pageobject.acceso;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object correspondiente a la pantalla de Login.
 * Gestiona la interacción con los campos de usuario, contraseña
 * y el botón de acceso a la aplicación.
 */
public class LoginPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.name("username");
    private By txtPassword = By.name("password");
    private By btnLogin = By.xpath("//button[@type='submit']");
    //</editor-fold>


    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object de Login.
     *
     * @param driver     Driver del navegador.
     * @param log        Gestor de logs.
     * @param mainClass  Nombre de la clase principal que ejecuta la prueba.
     */
    public LoginPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Login esté completamente cargada.
     * Sincroniza la ejecución verificando que el campo Username sea visible.
     */
    public void esperarSincronizacion(){
        esperarPagina(txtUsername,"Login");
    }
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">
    /**
     * Introduce el nombre de usuario en el campo correspondiente.
     *
     * @param texto Nombre de usuario.
     */
    public void IntroducirUsuario(String texto){
        esClickeable(txtUsername);
        setText(txtUsername, texto);
    }

    /**
     * Introduce la contraseña en el campo correspondiente.
     *
     * @param texto Contraseña del usuario.
     */
    public void IntroducirPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword, texto);
    }

    /**
     * Realiza clic en el botón Login para acceder a la aplicación.
     */
    public void PulsarLogin(){
        esClickeable(btnLogin);
        clickElemento(btnLogin, "Login");
    }
    //</editor-fold>
}
