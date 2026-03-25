package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEntitlementsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkAddToIndividualEmployee = By.xpath("");
    private By checkAddToMultipleEmployees = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaLeaveType = By.xpath("");
    private By listaLeavePeriod = By.xpath("");
    private By txtEntitlement = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de asignaciones de permisos (Entitlements).
     *
     * Esta vista permite registrar nuevas asignaciones de días de permiso para uno
     * o varios empleados, definiendo el tipo de ausencia y la cantidad otorgada.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AddEntitlementsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de asignaciones de permisos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Entitlements");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona la opción "Add to Individual Employee".
     */
    public void pulsarCheckAddToIndividualEmployee(){
        esClickeable(checkAddToIndividualEmployee);
        clickElemento(checkAddToIndividualEmployee, "Seleccionar Add to Individual Employee");
    }

    /**
     * Selecciona la opción "Add to Multiple Employees".
     */
    public void pulsarCheckAddToMultipleEmployees(){
        esClickeable(checkAddToMultipleEmployees);
        clickElemento(checkAddToMultipleEmployees, "Seleccionar Add to Multiple Employees");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta el valor del Entitlement.
     * @param texto Cantidad de días asignados.
     */
    public void insertarEntitlement(String texto){
        esClickeable(txtEntitlement);
        setText(txtEntitlement, texto);
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
     * Selecciona un Leave Period en la lista.
     * @param opcion Periodo a seleccionar.
     */
    public void seleccionarListaLeavePeriod(String opcion){
        esClickeable(listaLeavePeriod);
        seleccionarOpcion(listaLeavePeriod, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Entitlement.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
