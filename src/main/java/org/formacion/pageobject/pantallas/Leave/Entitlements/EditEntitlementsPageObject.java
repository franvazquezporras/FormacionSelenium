package org.formacion.pageobject.pantallas.Leave.Entitlements;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditEntitlementsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeavePeriod = By.xpath("");
    private By txtEntitlement = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de asignaciones de permisos (Entitlements).
     *
     * Esta vista permite modificar una asignación de días de permiso previamente creada,
     * ajustando el tipo de ausencia, la cantidad otorgada o cualquier otro parámetro
     * disponible dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EditEntitlementsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de edición de asignaciones de permisos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Edit Entitlements");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Leave Period en la lista.
     * @param opcion Periodo a seleccionar.
     */
    public void seleccionarListaLeavePeriod(String opcion){
        esClickeable(listaLeavePeriod);
        seleccionarOpcion(listaLeavePeriod, opcion);
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el valor del Entitlement.
     * @param texto Cantidad de días asignados.
     */
    public void insertarEntitlement(String texto){
        esClickeable(txtEntitlement);
        setText(txtEntitlement, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el Entitlement.
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
