package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzSharePostPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By btnShare = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de compartir un post en Buzz.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public BuzzSharePostPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de compartir post esté completamente cargado.
     * Se sincroniza verificando la presencia del campo de texto del post.
     */
    public void esperarSincronizacion(){
        esperarPagina(txtPost,"Popup Share Post");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el texto del Post a compartir.
     * @param texto Contenido del post.
     */
    public void insertarPost(String texto){
        esClickeable(txtPost);
        setText(txtPost, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Share.
     * Comparte el post con el contenido ingresado.
     */
    public void pulsarBotonShare(){
        esClickeable(btnShare);
        clickElemento(btnShare, "Pulsar botón Share");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cierra el popup sin compartir el contenido.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
