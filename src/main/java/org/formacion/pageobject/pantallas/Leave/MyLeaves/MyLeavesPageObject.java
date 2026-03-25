package org.formacion.pageobject.pantallas.Leave.MyLeaves;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeavesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">

    private By listaShowLeaveStatus = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAccionesPrimerRegistro = By.xpath("");
    private By btnAddComment = By.xpath("");
    private By btnViewLeavesDetails = By.xpath("");
    private By btnViewPIMInfo = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de solicitudes de permiso del empleado
     * (My Leaves).
     *
     * Esta vista permite al usuario consultar sus propias solicitudes de permiso,
     * filtrarlas por fecha, tipo de ausencia o estado, y acceder al detalle de cada registro.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public MyLeavesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de solicitudes de permiso del empleado esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Search.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSearch,"Pantalla My Leaves");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un estado de Leave en la lista.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaShowLeaveStatus(String opcion){
        esClickeable(listaShowLeaveStatus);
        seleccionarOpcion(listaShowLeaveStatus, opcion);
    }

// -------------------------
// INPUTS
// -------------------------

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
     * Limpia todos los filtros del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// -------------------------
// BOTONES DE ACCIONES
// -------------------------

    /**
     * Realiza clic en el botón de acciones del primer registro.
     * Despliega el menú de acciones disponibles.
     */
    public void pulsarBotonAccionesPrimerRegistro(){
        esClickeable(btnAccionesPrimerRegistro);
        clickElemento(btnAccionesPrimerRegistro, "Pulsar botón Acciones del primer registro");
    }

    /**
     * Realiza clic en el botón Add Comment.
     * Abre el popup para agregar un comentario.
     */
    public void pulsarBotonAddComment(){
        esClickeable(btnAddComment);
        clickElemento(btnAddComment, "Pulsar botón Add Comment");
    }

    /**
     * Realiza clic en el botón View Leave Details.
     * Abre la pantalla con los detalles de la solicitud.
     */
    public void pulsarBotonViewLeavesDetails(){
        esClickeable(btnViewLeavesDetails);
        clickElemento(btnViewLeavesDetails, "Pulsar botón View Leave Details");
    }

    /**
     * Realiza clic en el botón View PIM Info.
     * Abre la información PIM del empleado.
     */
    public void pulsarBotonViewPIMInfo(){
        esClickeable(btnViewPIMInfo);
        clickElemento(btnViewPIMInfo, "Pulsar botón View PIM Info");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la acción y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
