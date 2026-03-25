package org.formacion.pageobject.pantallas.Performance.ManageReviews.ManageReviews;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceManageReviewsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By listaSubUnit = By.xpath("");
    private By listaInclude = By.xpath("");
    private By listaReviewStatus = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAgregar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de revisiones de desempeño
     * (Manage Reviews) dentro del módulo de Performance.
     *
     * Esta vista permite visualizar, buscar y administrar las revisiones de desempeño
     * existentes, incluyendo la creación de nuevas evaluaciones, la edición de revisiones
     * activas y la gestión del estado de cada proceso de evaluación.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceManageReviewsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Manage Reviews esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Manage Reviews");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado en el filtro de búsqueda.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta la fecha From para filtrar.
     * @param texto Fecha inicial.
     */
    public void insertarFromDate(String texto){
        esClickeable(txtFromDate);
        setText(txtFromDate, texto);
    }

    /**
     * Inserta la fecha To para filtrar.
     * @param texto Fecha final.
     */
    public void insertarToDate(String texto){
        esClickeable(txtToDate);
        setText(txtToDate, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Job Title en la lista.
     * @param opcion Puesto a seleccionar.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

    /**
     * Selecciona un Sub Unit en la lista.
     * @param opcion Subunidad a seleccionar.
     */
    public void seleccionarListaSubUnit(String opcion){
        esClickeable(listaSubUnit);
        seleccionarOpcion(listaSubUnit, opcion);
    }

    /**
     * Selecciona una opción en la lista Include.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaInclude(String opcion){
        esClickeable(listaInclude);
        seleccionarOpcion(listaInclude, opcion);
    }

    /**
     * Selecciona un Review Status en la lista.
     * @param opcion Estado de revisión.
     */
    public void seleccionarListaReviewStatus(String opcion){
        esClickeable(listaReviewStatus);
        seleccionarOpcion(listaReviewStatus, opcion);
    }

// -------------------------
// BOTONES
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
     * Limpia todos los filtros del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar una nueva revisión.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

// </editor-fold>

}
