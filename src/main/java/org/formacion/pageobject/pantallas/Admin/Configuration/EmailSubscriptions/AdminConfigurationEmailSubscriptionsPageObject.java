package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationEmailSubscriptionsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSelectSubscriberFirstRegister = By.xpath("//div[@class='oxd-table-card'][1]//button");
    private By checkActiveSubscriberFirstRegister = By.xpath("//div[@class='oxd-table-card'][1]//input");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object de la pantalla de Configuración de Suscripciones de Email.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationEmailSubscriptionsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Configuración de Suscripciones de Email esté completamente cargada.
     * Se sincroniza verificando la presencia del primer registro seleccionable.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSelectSubscriberFirstRegister,"Pantalla Configuracion Email");
    }
    // </editor-fold>



    // <editor-fold desc="Funciones de locators">

// -------------------------
// SELECTOR DE REGISTRO
// -------------------------

    /**
     * Realiza clic en el botón de selección del primer suscriptor listado.
     * Permite abrir las acciones disponibles para dicho registro.
     */
    public void pulsarBotonSelectSubscriberFirstRegister(){
        esClickeable(btnSelectSubscriberFirstRegister);
        clickElemento(btnSelectSubscriberFirstRegister, "Seleccionar primer registro de suscriptor");
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox de estado del primer suscriptor.
     * Se utiliza para marcar o desmarcar la suscripción como activa.
     */
    public void pulsarCheckActiveSubscriberFirstRegister(){
        esClickeable(checkActiveSubscriberFirstRegister);
        clickElemento(checkActiveSubscriberFirstRegister, "Activar/Desactivar suscriptor activo");
    }
    //</editor-fold>
}
