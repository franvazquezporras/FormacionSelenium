package org.formacion.pageobject.pantallas.Admin.Job.JobTitles;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminAddJobTitlesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtJobTitle = By.xpath("");
    private By txtJobDescription = By.xpath("");
    private By txtJobNotes = By.xpath("");
    private By txtJobSpecifications = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminAddJobTitlesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Agregar Job Title");}
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
     * Inserta la descripción del Job Title.
     * @param texto Descripción del puesto.
     */
    public void insertarJobDescription(String texto){
        esClickeable(txtJobDescription);
        setText(txtJobDescription, texto);
    }

    /**
     * Inserta las notas del Job Title.
     * @param texto Notas adicionales del puesto.
     */
    public void insertarJobNotes(String texto){
        esClickeable(txtJobNotes);
        setText(txtJobNotes, texto);
    }

    /**
     * Inserta la ruta del archivo de Job Specifications.
     * @param texto Ruta completa del archivo.
     */
    public void insertarJobSpecifications(String texto){
        esClickeable(txtJobSpecifications);
        setText(txtJobSpecifications, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Job Title.
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
