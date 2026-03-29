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

    private By btnSave = By.cssSelector("button[type='submit']");
    private By btnReset = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--ghost");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object de la pantalla de Configuración de Email.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationEmailConfigurationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Configuración de Email esté completamente cargada.
     * Se sincroniza verificando la presencia del campo "Mail Sent As".
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Configuracion Email");
    }
    // </editor-fold>

    // <editor-fold desc="Funciones de locators">


// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el valor del remitente en el campo "Mail Sent As".
     * @param texto Valor a introducir en el campo.
     */
    public void insertarMailSentAs(String texto){
        esClickeable(txtMailSentAs);
        setText(txtMailSentAs, texto);
    }

    /**
     * Inserta el valor del host SMTP.
     * @param texto Dirección del servidor SMTP.
     */
    public void insertarSMTPHost(String texto){
        esClickeable(txtSMTPHost);
        setText(txtSMTPHost, texto);
    }

    /**
     * Inserta el valor del puerto SMTP.
     * @param texto Número de puerto SMTP.
     */
    public void insertarSMTPPort(String texto){
        esClickeable(txtSMTPPort);
        setText(txtSMTPPort, texto);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona la opción Secure SMTP.
     */
    public void pulsarCheckSecureSMTP(){
        esClickeable(checkSecureSMTP);
        clickElemento(checkSecureSMTP, "Seleccionar Secure SMTP");
    }

    /**
     * Selecciona la opción SMTP.
     */
    public void pulsarCheckSMTP(){
        esClickeable(checkSMTP);
        clickElemento(checkSMTP, "Seleccionar SMTP");
    }

    /**
     * Selecciona la opción Sendmail.
     */
    public void pulsarCheckSendmail(){
        esClickeable(checkSendmail);
        clickElemento(checkSendmail, "Seleccionar Sendmail");
    }

    /**
     * Selecciona la opción de autenticación SMTP: Sí.
     */
    public void pulsarCheckUseSMTPAuthenticationYes(){
        esClickeable(checkUseSMTPAuthenticationYes);
        clickElemento(checkUseSMTPAuthenticationYes, "Seleccionar autenticación SMTP: Sí");
    }

    /**
     * Selecciona la opción de autenticación SMTP: No.
     */
    public void pulsarCheckUseSMTPAuthenticationNo(){
        esClickeable(checkUseSMTPAuthenticationNo);
        clickElemento(checkUseSMTPAuthenticationNo, "Seleccionar autenticación SMTP: No");
    }

    /**
     * Selecciona la opción TLS.
     */
    public void pulsarCheckTLS(){
        esClickeable(checkTLS);
        clickElemento(checkTLS, "Seleccionar TLS");
    }

    /**
     * Selecciona la opción Send Test Mail.
     */
    public void pulsarCheckSendTestMail(){
        esClickeable(checkSendTestMail);
        clickElemento(checkSendTestMail, "Seleccionar Send Test Mail");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración de correo.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Reset.
     * Restablece los valores del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }
    //</editor-fold>
}
