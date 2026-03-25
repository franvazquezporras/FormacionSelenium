package org.formacion.pageobject.pantallas.Admin.Organization.Structure;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationAddStructurePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtUnitId = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de creación de una nueva Structure.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminOrganizationAddStructurePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de creación de Structure esté completamente cargado.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Popup Agregar Structure");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el Unit ID de la estructura.
     * @param texto Identificador de la unidad.
     */
    public void insertarUnitId(String texto){
        esClickeable(txtUnitId);
        setText(txtUnitId, texto);
    }

    /**
     * Inserta el nombre de la estructura.
     * @param texto Nombre de la unidad organizativa.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la descripción de la estructura.
     * @param texto Descripción de la unidad.
     */
    public void insertarDescription(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la nueva estructura organizativa.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y cierra el popup.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
