package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzEditPostPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By btnPost = By.xpath("");
    private By btnShareFoto = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public BuzzEditPostPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtPost,"Popup Edit Post");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el texto del Post.
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
     * Realiza clic en el botón Post.
     * Publica la edición del post.
     */
    public void pulsarBotonPost(){
        esClickeable(btnPost);
        clickElemento(btnPost, "Pulsar botón Post");
    }

    /**
     * Realiza clic en el botón Share Foto.
     * Abre la opción para compartir una imagen.
     */
    public void pulsarBotonShareFoto(){
        esClickeable(btnShareFoto);
        clickElemento(btnShareFoto, "Pulsar botón Share Foto");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cierra el popup sin guardar cambios.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
