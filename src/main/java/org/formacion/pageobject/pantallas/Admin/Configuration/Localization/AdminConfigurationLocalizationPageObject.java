package org.formacion.pageobject.pantallas.Admin.Configuration.Localization;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationLocalizationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("button[type='submit']");
    private By listaLanguage = By.xpath("//div[div/label[contains(text(),'" + LanguageManager.get("language.selector") + "')]]//div[@class='oxd-select-text--after']");
    private By listaDateFormat = By.xpath("//div[div/label[contains(text(),'" + LanguageManager.get("date.format.selector") + "')]]//div[@class='oxd-select-text--after']");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de configuración de localización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationLocalizationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    // </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de configuración de localización esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla LDAP Configuracion");
    }
    // </editor-fold>

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
