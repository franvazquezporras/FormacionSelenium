package org.formacion.pageobject.pantallas.Leave.Configure.LeaveTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditLeaveTypesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By checkIsEntitlementSituationalSi = By.xpath("");
    private By checkIsEntitlementSituationalNo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public EditLeaveTypesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Leave Type");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Leave Type.
     * @param texto Nombre del Leave Type.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Selecciona la opción "Is Entitlement Situational - Sí".
     */
    public void pulsarCheckIsEntitlementSituationalSi(){
        esClickeable(checkIsEntitlementSituationalSi);
        clickElemento(checkIsEntitlementSituationalSi, "Seleccionar Is Entitlement Situational Sí");
    }

    /**
     * Selecciona la opción "Is Entitlement Situational - No".
     */
    public void pulsarCheckIsEntitlementSituationalNo(){
        esClickeable(checkIsEntitlementSituationalNo);
        clickElemento(checkIsEntitlementSituationalNo, "Seleccionar Is Entitlement Situational No");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el Leave Type.
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
