package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdatingEntitlementPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfirm = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de actualización de asignaciones de permisos
     * (Updating Entitlement).
     *
     * Este popup aparece cuando se realiza una modificación que afecta los días de permiso
     * asignados, solicitando confirmación antes de aplicar los cambios.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public UpdatingEntitlementPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de actualización de asignaciones de permisos esté completamente visible.
     * Se sincroniza verificando la presencia del botón Confirm.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnConfirm,"Popup Updating Entitlement");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Confirm.
     * Confirma la actualización del Entitlement.
     */
    public void pulsarBotonConfirm(){
        esClickeable(btnConfirm);
        clickElemento(btnConfirm, "Pulsar botón Confirm");
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
