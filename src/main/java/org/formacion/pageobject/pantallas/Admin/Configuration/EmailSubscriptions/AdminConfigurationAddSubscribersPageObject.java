package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationAddSubscribersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmail = By.xpath("");
    private By txtName = By.xpath("");
    private By btnCancelar = By.xpath("");
    private By btnAgregar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del popup para agregar suscriptores.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationAddSubscribersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de agregar suscriptor esté completamente cargado.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Popup Agregar Subscriptor");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el correo electrónico del suscriptor.
     * @param texto Dirección de correo a introducir.
     */
    public void insertarEmail(String texto){
        esClickeable(txtEmail);
        setText(txtEmail, texto);
    }

    /**
     * Inserta el nombre del suscriptor.
     * @param texto Nombre a introducir.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Cancelar.
     * Cierra el popup sin guardar los cambios.
     */
    public void pulsarBotonCancelar(){
        esClickeable(btnCancelar);
        clickElemento(btnCancelar, "Pulsar botón Cancelar");
    }

    /**
     * Realiza clic en el botón Agregar.
     * Confirma la creación del nuevo suscriptor.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }
    //</editor-fold>
}
