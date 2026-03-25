package org.formacion.pageobject.pantallas.Claim.Configuration.Events;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimConfigurationAddEventPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtEventName = By.xpath("");
    private By txtEventDescription = By.xpath("");
    private By checkActive = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de un nuevo evento de reclamo.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimConfigurationAddEventPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de creación de evento esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Agregar Evento");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del evento.
     * @param texto Nombre del evento.
     */
    public void insertarEventName(String texto){
        esClickeable(txtEventName);
        setText(txtEventName, texto);
    }

    /**
     * Inserta la descripción del evento.
     * @param texto Descripción del evento.
     */
    public void insertarEventDescription(String texto){
        esClickeable(txtEventDescription);
        setText(txtEventDescription, texto);
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
     * Guarda el nuevo evento configurado.
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
