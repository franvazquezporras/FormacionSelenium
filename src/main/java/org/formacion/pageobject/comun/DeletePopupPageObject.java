package org.formacion.pageobject.comun;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnYes = By.xpath("");
    private By btnNo = By.xpath("");
    private By txtDescription = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del popup de eliminación.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public DeletePopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de eliminación esté completamente cargado.
     * Se sincroniza verificando la presencia del texto descriptivo.
     */
    public void esperarSincronizacion(){esperarPagina(txtDescription,"Popup Eliminar");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Pulsa el botón YES para confirmar la eliminación.
     */
    public void pulsarBotonYes(){
        esClickeable(btnYes);
        clickElemento(btnYes, "Pulsar botón YES");
    }

    /**
     * Pulsa el botón NO para cancelar la eliminación.
     */
    public void pulsarBotonNo(){
        esClickeable(btnNo);
        clickElemento(btnNo, "Pulsar botón NO");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta una descripción en el campo del popup.
     *
     * @param texto Descripción a introducir.
     */
    public void insertarDescripcion(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }
    //</editor-fold>
}
