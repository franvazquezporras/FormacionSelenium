package org.formacion.pageobject.pantallas.Claim.Configuration.ExpenseTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimConfigurationExpenseTypesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtNameFilter = By.xpath("");
    private By listaStatusFilter = By.xpath("");
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
     * Constructor del Page Object para la pantalla de tipos de gasto
     * dentro de la configuración de reclamos.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimConfigurationExpenseTypesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de tipos de gasto esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Events Types");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Expense Type para filtrar.
     * @param texto Nombre del Expense Type.
     */
    public void insertarNameFilter(String texto){
        esClickeable(txtNameFilter);
        setText(txtNameFilter, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un estado en la lista Status.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaStatusFilter(String opcion){
        esClickeable(listaStatusFilter);
        seleccionarOpcion(listaStatusFilter, opcion);
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
     * Se utiliza para seleccionar o deseleccionar el Expense Type.
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
     * Abre la pantalla para crear un nuevo Expense Type.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina el Expense Type actualmente seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los Expense Types marcados en la lista.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición del Expense Type seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
