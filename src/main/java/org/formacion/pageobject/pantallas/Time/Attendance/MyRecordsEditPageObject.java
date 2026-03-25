package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyRecordsEditPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtPunchInDate = By.xpath("");
    private By txtPunchInTime = By.xpath("");
    private By txtPunchInNote = By.xpath("");
    private By txtPunchOutDate = By.xpath("");
    private By txtPunchOutTime = By.xpath("");
    private By txtPunchOutNote = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de los registros
     * personales del usuario (Edit My Records).
     *
     * Esta vista permite que el propio empleado modifique su información personal,
     * incluyendo datos de contacto, dirección, información demográfica y cualquier
     * otro campo habilitado para autoedición dentro del sistema.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public MyRecordsEditPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Edit My Records esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save, que confirma que
     * la vista está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Edit My Records");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS - PUNCH IN
// -------------------------

    /**
     * Inserta la fecha de Punch In.
     * @param texto Fecha.
     */
    public void insertarPunchInDate(String texto){
        esClickeable(txtPunchInDate);
        setText(txtPunchInDate, texto);
    }

    /**
     * Inserta la hora de Punch In.
     * @param texto Hora.
     */
    public void insertarPunchInTime(String texto){
        esClickeable(txtPunchInTime);
        setText(txtPunchInTime, texto);
    }

    /**
     * Inserta la nota de Punch In.
     * @param texto Nota.
     */
    public void insertarPunchInNote(String texto){
        esClickeable(txtPunchInNote);
        setText(txtPunchInNote, texto);
    }

// -------------------------
// INPUTS - PUNCH OUT
// -------------------------

    /**
     * Inserta la fecha de Punch Out.
     * @param texto Fecha.
     */
    public void insertarPunchOutDate(String texto){
        esClickeable(txtPunchOutDate);
        setText(txtPunchOutDate, texto);
    }

    /**
     * Inserta la hora de Punch Out.
     * @param texto Hora.
     */
    public void insertarPunchOutTime(String texto){
        esClickeable(txtPunchOutTime);
        setText(txtPunchOutTime, texto);
    }

    /**
     * Inserta la nota de Punch Out.
     * @param texto Nota.
     */
    public void insertarPunchOutNote(String texto){
        esClickeable(txtPunchOutNote);
        setText(txtPunchOutNote, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios del registro.
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
