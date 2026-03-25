package org.formacion.pageobject.pantallas.Admin.Configuration.SocialMediaAuthentication;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationEditProviderListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtClientID = By.xpath("");
    private By txtProviderURL = By.xpath("");
    private By txtClientSecret = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationEditProviderListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Provider");}
    //</editor-fold>

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
     * Guarda los cambios realizados en el proveedor de autenticación social.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la edición y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

    // </editor-fold>

}
