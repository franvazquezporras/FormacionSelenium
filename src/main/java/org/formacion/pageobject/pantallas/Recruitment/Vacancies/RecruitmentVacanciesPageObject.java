package org.formacion.pageobject.pantallas.Recruitment.Vacancies;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentVacanciesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtJobTitle = By.xpath("");
    private By listaVacancy = By.xpath("");
    private By listaHiringManager = By.xpath("");
    private By listaStatus = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de vacantes
     * (Vacancies) dentro del módulo de Recruitment.
     *
     * Esta vista permite visualizar, buscar y administrar las vacantes
     * registradas en el sistema. Desde aquí también es posible acceder a la
     * creación de una nueva vacante mediante el botón Agregar.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public RecruitmentVacanciesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Vacancies esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Vacancies");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el Job Title.
     * @param texto Título del puesto.
     */
    public void insertarJobTitle(String texto){
        esClickeable(txtJobTitle);
        setText(txtJobTitle, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona una Vacancy.
     * @param opcion Vacante a seleccionar.
     */
    public void seleccionarListaVacancy(String opcion){
        esClickeable(listaVacancy);
        seleccionarOpcion(listaVacancy, opcion);
    }

    /**
     * Selecciona un Hiring Manager.
     * @param opcion Manager a seleccionar.
     */
    public void seleccionarListaHiringManager(String opcion){
        esClickeable(listaHiringManager);
        seleccionarOpcion(listaHiringManager, opcion);
    }

    /**
     * Selecciona un Status.
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
     * Selecciona o deselecciona el checkbox del primer registro.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar checkbox del primer registro");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar una nueva Vacancy.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición de la Vacancy seleccionada.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina la Vacancy seleccionada.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Delete Selected.
     * Elimina todas las Vacancies seleccionadas.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar Seleccionados");
    }

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda con los filtros aplicados.
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

// </editor-fold>

}
