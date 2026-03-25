package org.formacion.pageobject.pantallas.Admin.Configuration.Localization;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationLocalizationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By listaLanguage = By.xpath("");
    private By listaDateFormat = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminConfigurationLocalizationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla LDAP Configuracion");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS DESPLEGABLES
// -------------------------

    /**
     * Selecciona un idioma en la lista desplegable "Language".
     * @param texto Valor visible que se desea seleccionar.
     */
    public void seleccionarLanguage(String texto){
        esClickeable(listaLanguage);
        seleccionarOpcion(listaLanguage, texto);
    }

    /**
     * Selecciona un formato de fecha en la lista desplegable "Date Format".
     * @param texto Valor visible que se desea seleccionar.
     */
    public void seleccionarDateFormat(String texto){
        esClickeable(listaDateFormat);
        seleccionarOpcion(listaDateFormat, texto);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración de localización seleccionada.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    // </editor-fold>

}
