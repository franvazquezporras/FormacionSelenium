package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimViewDetailsAddExpensePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaExpenseType = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtAmount = By.xpath("");
    private By txtNote = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ClaimViewDetailsAddExpensePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Popup Add Expense");}

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Expense Type en la lista.
     * @param opcion Tipo de gasto a seleccionar.
     */
    public void seleccionarListaExpenseType(String opcion){
        esClickeable(listaExpenseType);
        seleccionarOpcion(listaExpenseType, opcion);
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la fecha del gasto.
     * @param texto Fecha del gasto.
     */
    public void insertarDate(String texto){
        esClickeable(txtDate);
        setText(txtDate, texto);
    }

    /**
     * Inserta el monto del gasto.
     * @param texto Monto del gasto.
     */
    public void insertarAmount(String texto){
        esClickeable(txtAmount);
        setText(txtAmount, texto);
    }

    /**
     * Inserta una nota adicional del gasto.
     * @param texto Nota del gasto.
     */
    public void insertarNote(String texto){
        esClickeable(txtNote);
        setText(txtNote, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el gasto agregado.
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


    //</editor-fold>
}
