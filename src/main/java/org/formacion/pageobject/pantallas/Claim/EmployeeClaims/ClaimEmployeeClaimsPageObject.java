package org.formacion.pageobject.pantallas.Claim.EmployeeClaims;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimEmployeeClaimsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By txtReferenceId = By.xpath("");
    private By listaEventName = By.xpath("");
    private By listaStatus = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By listaInclude = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAssignClaim = By.xpath("");
    private By btnViewDetailsPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimEmployeeClaimsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAssignClaim,"Pantalla Employee Claims");}

    //</editor-fold>

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

    /**
     * Inserta el Reference ID para filtrar.
     * @param texto Reference ID.
     */
    public void insertarReferenceId(String texto){
        esClickeable(txtReferenceId);
        setText(txtReferenceId, texto);
    }

    /**
     * Inserta la fecha From.
     * @param texto Fecha inicial.
     */
    public void insertarFromDate(String texto){
        esClickeable(txtFromDate);
        setText(txtFromDate, texto);
    }

    /**
     * Inserta la fecha To.
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
     * Selecciona un Event Name en la lista.
     * @param opcion Evento a seleccionar.
     */
    public void seleccionarListaEventName(String opcion){
        esClickeable(listaEventName);
        seleccionarOpcion(listaEventName, opcion);
    }

    /**
     * Selecciona un estado en la lista Status.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaStatus(String opcion){
        esClickeable(listaStatus);
        seleccionarOpcion(listaStatus, opcion);
    }

    /**
     * Selecciona una opción en la lista Include.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaInclude(String opcion){
        esClickeable(listaInclude);
        seleccionarOpcion(listaInclude, opcion);
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
// ACCIONES
// -------------------------

    /**
     * Realiza clic en el botón Assign Claim.
     * Abre la pantalla para asignar un reclamo.
     */
    public void pulsarBotonAssignClaim(){
        esClickeable(btnAssignClaim);
        clickElemento(btnAssignClaim, "Pulsar botón Assign Claim");
    }

    /**
     * Realiza clic en el botón View Details del primer registro.
     */
    public void pulsarBotonViewDetailsPrimerRegistro(){
        esClickeable(btnViewDetailsPrimerRegistro);
        clickElemento(btnViewDetailsPrimerRegistro, "Pulsar botón View Details del primer registro");
    }

// </editor-fold>

}
