package org.formacion.pageobject.pantallas.Admin.Configuration.RegisterOAuthClient;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationAddRegisterClientPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");

    private By txtName = By.xpath("");
    private By txtRedirectURL = By.xpath("");

    private By checkEnableClient = By.xpath("");
    private By checkConfidentialClient = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationAddRegisterClientPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Client");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del cliente OAuth.
     * @param texto Nombre del cliente a registrar.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la URL de redirección del cliente OAuth.
     * @param texto URL de redirección válida.
     */
    public void insertarRedirectURL(String texto){
        esClickeable(txtRedirectURL);
        setText(txtRedirectURL, texto);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Activa o desactiva la opción "Enable Client".
     * Permite habilitar o deshabilitar el cliente OAuth.
     */
    public void pulsarCheckEnableClient(){
        esClickeable(checkEnableClient);
        clickElemento(checkEnableClient, "Seleccionar Enable Client");
    }

    /**
     * Activa o desactiva la opción "Confidential Client".
     * Indica si el cliente OAuth es confidencial.
     */
    public void pulsarCheckConfidentialClient(){
        esClickeable(checkConfidentialClient);
        clickElemento(checkConfidentialClient, "Seleccionar Confidential Client");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo cliente OAuth registrado.
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
