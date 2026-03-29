package org.formacion.pageobject.pantallas.Admin.Configuration.SocialMediaAuthentication;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationAddProviderListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.cssSelector("button[type='submit']");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtClientID = By.xpath("");
    private By txtProviderURL = By.xpath("");
    private By txtClientSecret = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de registro de un nuevo proveedor.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationAddProviderListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de registro de proveedor esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Agregar Provider");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del proveedor de autenticación social.
     * @param texto Nombre del proveedor.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta el Client ID del proveedor.
     * @param texto Identificador del cliente OAuth.
     */
    public void insertarClientID(String texto){
        esClickeable(txtClientID);
        setText(txtClientID, texto);
    }

    /**
     * Inserta la URL del proveedor.
     * @param texto URL del servicio de autenticación.
     */
    public void insertarProviderURL(String texto){
        esClickeable(txtProviderURL);
        setText(txtProviderURL, texto);
    }

    /**
     * Inserta el Client Secret del proveedor.
     * @param texto Secreto del cliente OAuth.
     */
    public void insertarClientSecret(String texto){
        esClickeable(txtClientSecret);
        setText(txtClientSecret, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo proveedor de autenticación social.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
