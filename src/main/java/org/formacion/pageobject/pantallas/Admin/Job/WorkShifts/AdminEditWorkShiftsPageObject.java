package org.formacion.pageobject.pantallas.Admin.Job.WorkShifts;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminEditWorkShiftsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtShiftName = By.xpath("");
    private By txtFromHour = By.xpath("");
    private By txtToHour = By.xpath("");
    private By txtDurationPerDay = By.xpath("");
    private By txtAssignedEmployees = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminEditWorkShiftsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Work shift");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Work Shift.
     * @param texto Nombre del turno.
     */
    public void insertarShiftName(String texto){
        esClickeable(txtShiftName);
        setText(txtShiftName, texto);
    }

    /**
     * Inserta la hora de inicio del Work Shift.
     * @param texto Hora de inicio (formato HH:mm).
     */
    public void insertarFromHour(String texto){
        esClickeable(txtFromHour);
        setText(txtFromHour, texto);
    }

    /**
     * Inserta la hora de fin del Work Shift.
     * @param texto Hora de fin (formato HH:mm).
     */
    public void insertarToHour(String texto){
        esClickeable(txtToHour);
        setText(txtToHour, texto);
    }

    /**
     * Inserta la duración por día del Work Shift.
     * @param texto Duración total en horas.
     */
    public void insertarDurationPerDay(String texto){
        esClickeable(txtDurationPerDay);
        setText(txtDurationPerDay, texto);
    }

    /**
     * Inserta los empleados asignados al Work Shift.
     * @param texto Lista de empleados asignados.
     */
    public void insertarAssignedEmployees(String texto){
        esClickeable(txtAssignedEmployees);
        setText(txtAssignedEmployees, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el Work Shift.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la edición y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
