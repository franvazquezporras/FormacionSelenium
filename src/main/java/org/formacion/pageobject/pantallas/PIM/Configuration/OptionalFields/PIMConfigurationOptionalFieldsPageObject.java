package org.formacion.pageobject.pantallas.PIM.Configuration.OptionalFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationOptionalFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By checkShowNickName = By.xpath("");
    private By checkShowSSNfield = By.xpath("");
    private By checkShowSINfield = By.xpath("");
    private By checkShowUSTax = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de configuración de campos opcionales
     * (Optional Fields) dentro del módulo de PIM.
     *
     * Esta vista permite habilitar o deshabilitar campos opcionales relacionados con
     * la información del empleado, ofreciendo flexibilidad para adaptar el sistema
     * a los requisitos específicos de la organización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMConfigurationOptionalFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Optional Fields esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Optional Fields");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOXES
// -------------------------

    /**
     * Activa o desactiva la opción Show Nickname.
     */
    public void pulsarCheckShowNickName(){
        esClickeable(checkShowNickName);
        clickElemento(checkShowNickName, "Seleccionar/Deseleccionar Show Nickname");
    }

    /**
     * Activa o desactiva la opción Show SSN field.
     */
    public void pulsarCheckShowSSNfield(){
        esClickeable(checkShowSSNfield);
        clickElemento(checkShowSSNfield, "Seleccionar/Deseleccionar Show SSN field");
    }

    /**
     * Activa o desactiva la opción Show SIN field.
     */
    public void pulsarCheckShowSINfield(){
        esClickeable(checkShowSINfield);
        clickElemento(checkShowSINfield, "Seleccionar/Deseleccionar Show SIN field");
    }

    /**
     * Activa o desactiva la opción Show US Tax Exemptions.
     */
    public void pulsarCheckShowUSTax(){
        esClickeable(checkShowUSTax);
        clickElemento(checkShowUSTax, "Seleccionar/Deseleccionar Show US Tax Exemptions");
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios de los Optional Fields.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

// </editor-fold>

}
