package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeEntitlementsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaLeavePeriod = By.xpath("");
    private By listaLeaveType = By.xpath("");
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
     * Constructor del Page Object para la pantalla de asignaciones de permisos por empleado
     * (Employee Entitlements).
     *
     * Esta vista permite consultar y gestionar las asignaciones de días de permiso
     * correspondientes a un empleado específico dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EmployeeEntitlementsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de asignaciones de permisos por empleado esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Employee Entitlements");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado para filtrar.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Leave Period en la lista.
     * @param opcion Periodo a seleccionar.
     */
    public void seleccionarListaLeavePeriod(String opcion){
        esClickeable(listaLeavePeriod);
        seleccionarOpcion(listaLeavePeriod, opcion);
    }

    /**
     * Selecciona un Leave Type en la lista.
     * @param opcion Tipo de permiso a seleccionar.
     */
    public void seleccionarListaLeaveType(String opcion){
        esClickeable(listaLeaveType);
        seleccionarOpcion(listaLeaveType, opcion);
    }

// -------------------------
// BOTONES DE BÚSQUEDA
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda según los filtros ingresados.
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
     * Abre la pantalla para crear un nuevo Entitlement.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina el Entitlement seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los Entitlements marcados.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición del Entitlement seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
