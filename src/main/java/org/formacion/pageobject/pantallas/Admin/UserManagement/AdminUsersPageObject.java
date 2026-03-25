package org.formacion.pageobject.pantallas.Admin.UserManagement;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtUsername = By.xpath("");
    private By listaRol = By.xpath("");
    private By txtEmployeename = By.xpath("");
    private By listaStatus = By.xpath("");

    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");

    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de listado de usuarios.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminUsersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de usuarios esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Users");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre de usuario para la búsqueda.
     * @param texto Nombre de usuario.
     */
    public void insertarUsername(String texto){
        esClickeable(txtUsername);
        setText(txtUsername, texto);
    }

    /**
     * Inserta el nombre del empleado para la búsqueda.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeename);
        setText(txtEmployeename, texto);
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
// BOTONES DE BÚSQUEDA
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda de usuarios según los filtros ingresados.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia todos los filtros de búsqueda.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro.
     * Se utiliza para seleccionar o deseleccionar el usuario.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar primer registro");
    }

// -------------------------
// BOTONES CRUD
// -------------------------

    /**
     * Realiza clic en el botón Agregar.
     * Abre la pantalla para crear un nuevo usuario.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina el usuario actualmente seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los usuarios marcados en la lista.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición del usuario seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
