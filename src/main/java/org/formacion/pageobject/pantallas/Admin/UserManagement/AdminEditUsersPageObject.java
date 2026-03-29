package org.formacion.pageobject.pantallas.Admin.UserManagement;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminEditUsersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.xpath("");
    private By listaRol = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaStatus = By.xpath("");
    private By checkChangePassword = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtRepeatPassword = By.xpath("");
    private By btnSave = By.cssSelector("button[type='submit']");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de un usuario.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminEditUsersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de edición de usuario esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Editar Usuario");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre de usuario.
     * @param texto Nombre de usuario.
     */
    public void insertarUsername(String texto){
        esClickeable(txtUsername);
        setText(txtUsername, texto);
    }

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta la contraseña del usuario.
     * @param texto Contraseña.
     */
    public void insertarPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword, texto);
    }

    /**
     * Inserta la repetición de la contraseña.
     * @param texto Repetición de la contraseña.
     */
    public void insertarRepeatPassword(String texto){
        esClickeable(txtRepeatPassword);
        setText(txtRepeatPassword, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un rol en la lista de Roles.
     * @param opcion Rol a seleccionar.
     */
    public void seleccionarListaRol(String opcion){
        esClickeable(listaRol);
        seleccionarOpcion(listaRol, opcion);
    }

    /**
     * Selecciona un estado en la lista de Status.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaStatus(String opcion){
        esClickeable(listaStatus);
        seleccionarOpcion(listaStatus, opcion);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva la opción Change Password.
     */
    public void pulsarCheckChangePassword(){
        esClickeable(checkChangePassword);
        clickElemento(checkChangePassword, "Seleccionar/Deseleccionar Change Password");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el usuario.
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
