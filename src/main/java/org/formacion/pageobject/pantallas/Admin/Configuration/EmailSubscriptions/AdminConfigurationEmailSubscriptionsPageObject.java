package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationEmailSubscriptionsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSelectSubscriberFirstRegister = By.xpath("");
    private By checkActiveSubscriberFirstRegister = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationEmailSubscriptionsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSelectSubscriberFirstRegister,"Pantalla Configuracion Email");}
    //</editor-fold>


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
