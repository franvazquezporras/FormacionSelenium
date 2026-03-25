package org.formacion.pageobject.pantallas.Performance.Configure.Trackers;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceConfigureTrackerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregarTracker = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By txtFiltroEmployeeName = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de Trackers
     * dentro del módulo de Performance.
     *
     * Esta vista permite visualizar, crear y administrar los trackers de desempeño,
     * incluyendo la asignación de supervisores, empleados y parámetros utilizados
     * para el seguimiento de actividades o métricas de rendimiento.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceConfigureTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de gestión de Trackers esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar Tracker.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregarTracker,"Pantalla Trackers");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre del empleado en el filtro de búsqueda.
     * @param texto Nombre del empleado.
     */
    public void insertarFiltroEmployeeName(String texto){
        esClickeable(txtFiltroEmployeeName);
        setText(txtFiltroEmployeeName, texto);
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
     * Limpia los filtros de búsqueda.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// -------------------------
// BOTONES CRUD
// -------------------------

    /**
     * Realiza clic en el botón Agregar Tracker.
     * Abre la pantalla para crear un nuevo Tracker.
     */
    public void pulsarBotonAgregarTracker(){
        esClickeable(btnAgregarTracker);
        clickElemento(btnAgregarTracker, "Pulsar botón Agregar Tracker");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina el Tracker seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los Trackers marcados.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición del Tracker seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
