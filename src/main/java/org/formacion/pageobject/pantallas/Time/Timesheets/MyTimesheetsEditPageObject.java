package org.formacion.pageobject.pantallas.Time.Timesheets;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTimesheetsEditPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnReset = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtProject = By.xpath("");
    private By listaActivity = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyTimesheetsEditPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit My Timesheet");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del proyecto.
     * @param texto Nombre del proyecto.
     */
    public void insertarProject(String texto){
        esClickeable(txtProject);
        setText(txtProject, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona una actividad.
     * @param opcion Nombre de la actividad.
     */
    public void seleccionarListaActivity(String opcion){
        esClickeable(listaActivity);
        seleccionarOpcion(listaActivity, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Reset.
     * Restablece los valores del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el timesheet.
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
