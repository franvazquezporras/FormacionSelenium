package org.formacion.pageobject.pantallas.Leave.AssignLeave;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignLeavePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listaLeaveType = By.xpath("");
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By txtComments = By.xpath("");
    private By btnAssign = By.xpath("");
    private By listaPartialDays = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AssignLeavePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAssign,"Pantalla Assign Leave");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado al que se asignará el permiso.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
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

    /**
     * Inserta los comentarios del permiso.
     * @param texto Comentarios adicionales.
     */
    public void insertarComments(String texto){
        esClickeable(txtComments);
        setText(txtComments, texto);
    }

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
     * Selecciona una opción en la lista Partial Days.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaPartialDays(String opcion){
        esClickeable(listaPartialDays);
        seleccionarOpcion(listaPartialDays, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Assign.
     * Asigna el permiso al empleado.
     */
    public void pulsarBotonAssign(){
        esClickeable(btnAssign);
        clickElemento(btnAssign, "Pulsar botón Assign");
    }

// </editor-fold>

}
