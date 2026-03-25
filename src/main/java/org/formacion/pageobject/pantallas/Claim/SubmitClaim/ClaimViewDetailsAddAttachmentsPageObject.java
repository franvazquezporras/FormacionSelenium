package org.formacion.pageobject.pantallas.Claim.SubmitClaim;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimViewDetailsAddAttachmentsPageObject  extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtSelectFile = By.xpath("");
    private By txtComment = By.xpath("");
    private By txtNote = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de agregado de adjuntos
     * dentro de la vista de detalles de un reclamo.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ClaimViewDetailsAddAttachmentsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de agregado de adjuntos esté completamente cargado.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Popup Add Attachment");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la ruta o nombre del archivo a adjuntar.
     * @param texto Archivo a seleccionar.
     */
    public void insertarSelectFile(String texto){
        esClickeable(txtSelectFile);
        setText(txtSelectFile, texto);
    }

    /**
     * Inserta el comentario del adjunto.
     * @param texto Comentario del adjunto.
     */
    public void insertarComment(String texto){
        esClickeable(txtComment);
        setText(txtComment, texto);
    }

    /**
     * Inserta la nota del adjunto.
     * @param texto Nota adicional.
     */
    public void insertarNote(String texto){
        esClickeable(txtNote);
        setText(txtNote, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el adjunto agregado.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y cierra el popup.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
