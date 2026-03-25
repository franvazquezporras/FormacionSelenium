package org.formacion.pageobject.pantallas.Leave.Apply;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeaveType = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By txtComments = By.xpath("");
    private By btnApply = By.xpath("");
    private By listaDuration = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de solicitud de permisos (Apply Leave).
     *
     * Esta vista permite al empleado registrar una nueva solicitud de ausencia,
     * seleccionando el tipo de permiso, fechas y detalles correspondientes.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ApplyPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de solicitud de permisos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Apply.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnApply,"Pantalla Apply Leave");
    }
    // </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Leave Type en la lista.
     * @param opcion Tipo de permiso a seleccionar.
     */
    public void seleccionarListaLeaveType(String opcion){
        esClickeable(listaLeaveType);
        seleccionarOpcion(listaLeaveType, opcion);
    }

    /**
     * Selecciona una Duration en la lista.
     * @param opcion Duración a seleccionar.
     */
    public void seleccionarListaDuration(String opcion){
        esClickeable(listaDuration);
        seleccionarOpcion(listaDuration, opcion);
    }

// -------------------------
// INPUTS
// -------------------------

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

    /**
     * Inserta los comentarios del permiso.
     * @param texto Comentarios adicionales.
     */
    public void insertarComments(String texto){
        esClickeable(txtComments);
        setText(txtComments, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Apply.
     * Envía la solicitud de permiso.
     */
    public void pulsarBotonApply(){
        esClickeable(btnApply);
        clickElemento(btnApply, "Pulsar botón Apply");
    }

// </editor-fold>

}
