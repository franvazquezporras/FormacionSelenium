package org.formacion.pageobject.pantallas.Claim.Configuration.ExpenseTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimConfigurationAddExpenseTypePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By checkActive = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de un nuevo tipo de gasto.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimConfigurationAddExpenseTypePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de tipo de gasto esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Agregar Event Type");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del tipo de gasto.
     * @param texto Nombre del Expense Type.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la descripción del tipo de gasto.
     * @param texto Descripción del Expense Type.
     */
    public void insertarDescription(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva la opción Active.
     */
    public void pulsarCheckActive(){
        esClickeable(checkActive);
        clickElemento(checkActive, "Seleccionar/Deseleccionar Active");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Expense Type.
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
