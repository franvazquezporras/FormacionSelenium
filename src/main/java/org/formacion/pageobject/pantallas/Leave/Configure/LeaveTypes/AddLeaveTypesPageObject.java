package org.formacion.pageobject.pantallas.Leave.Configure.LeaveTypes;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddLeaveTypesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtName = By.xpath("");
    private By checkIsEntitlementSituationalSi = By.xpath("");
    private By checkIsEntitlementSituationalNo = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de tipos de permiso (Leave Type).
     *
     * Esta vista permite registrar un nuevo tipo de ausencia dentro del módulo de Leave,
     * definiendo su nombre, comportamiento y parámetros asociados.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AddLeaveTypesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de tipos de permiso esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Leave Type");
    }
// </editor-fold>


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
     * Guarda el nuevo Leave Type.
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
