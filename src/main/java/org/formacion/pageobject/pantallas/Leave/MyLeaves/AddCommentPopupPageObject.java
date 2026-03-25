package org.formacion.pageobject.pantallas.Leave.MyLeaves;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCommentPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtComment = By.xpath("");
    private By btnConfirm = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de agregado de comentarios
     * (Add Comment).
     *
     * Este popup permite ingresar y confirmar un comentario asociado a una acción
     * dentro del módulo de Leave, generalmente durante la aprobación, rechazo
     * o actualización de un registro.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AddCommentPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de agregado de comentarios esté completamente visible.
     * Se sincroniza verificando la presencia del botón Confirm.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnConfirm,"Popup Add Comment");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el comentario en el popup.
     * @param texto Comentario a agregar.
     */
    public void insertarComment(String texto){
        esClickeable(txtComment);
        setText(txtComment, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Confirm.
     * Confirma la acción y guarda el comentario.
     */
    public void pulsarBotonConfirm(){
        esClickeable(btnConfirm);
        clickElemento(btnConfirm, "Pulsar botón Confirm");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la acción y cierra el popup.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
