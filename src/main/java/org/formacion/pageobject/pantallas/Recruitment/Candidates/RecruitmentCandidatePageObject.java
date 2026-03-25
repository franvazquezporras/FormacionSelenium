package org.formacion.pageobject.pantallas.Recruitment.Candidates;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentCandidatePageObject extends BasePageObject {

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
    private By txtCandidateName = By.xpath("");
    private By txtKeywords = By.xpath("");
    private By txtDateFrom = By.xpath("");
    private By txtDateTo = By.xpath("");
    private By listaMethodApplication = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentCandidatePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Pantalla Candidates");}

    //</editor-fold>

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

    /**
     * Inserta el nombre del candidato.
     * @param texto Nombre del candidato.
     */
    public void insertarCandidateName(String texto){
        esClickeable(txtCandidateName);
        setText(txtCandidateName, texto);
    }

    /**
     * Inserta las Keywords.
     * @param texto Palabras clave.
     */
    public void insertarKeywords(String texto){
        esClickeable(txtKeywords);
        setText(txtKeywords, texto);
    }

    /**
     * Inserta la fecha inicial del rango.
     * @param texto Fecha desde.
     */
    public void insertarDateFrom(String texto){
        esClickeable(txtDateFrom);
        setText(txtDateFrom, texto);
    }

    /**
     * Inserta la fecha final del rango.
     * @param texto Fecha hasta.
     */
    public void insertarDateTo(String texto){
        esClickeable(txtDateTo);
        setText(txtDateTo, texto);
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

    /**
     * Selecciona un Method of Application.
     * @param opcion Método a seleccionar.
     */
    public void seleccionarListaMethodApplication(String opcion){
        esClickeable(listaMethodApplication);
        seleccionarOpcion(listaMethodApplication, opcion);
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
     * Abre la pantalla para agregar un nuevo candidato.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del candidato seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el candidato seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Delete Selected.
     * Elimina todos los candidatos seleccionados.
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
