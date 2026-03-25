package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzShareVideoPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By txtURLVideo = By.xpath("");
    private By btnShare = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public BuzzShareVideoPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtPost,"Popup Share Video");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el texto del Post.
     * @param texto Contenido del post.
     */
    public void insertarPost(String texto){
        esClickeable(txtPost);
        setText(txtPost, texto);
    }

    /**
     * Inserta la URL del video a compartir.
     * @param texto URL del video.
     */
    public void insertarURLVideo(String texto){
        esClickeable(txtURLVideo);
        setText(txtURLVideo, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Share.
     * Comparte el post con el video indicado.
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
