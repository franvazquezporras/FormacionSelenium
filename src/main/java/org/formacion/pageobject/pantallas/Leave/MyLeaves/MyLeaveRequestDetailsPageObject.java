package org.formacion.pageobject.pantallas.Leave.MyLeaves;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeaveRequestDetailsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAddComment = By.xpath("");
    private By btnAccionesPrimerRegistro = By.xpath("");
    private By btnComment = By.xpath("");
    private By btnBack = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de detalles de una solicitud de permiso
     * (My Leave Request Details).
     *
     * Esta vista permite al empleado visualizar la información completa de una solicitud
     * de permiso previamente registrada, incluyendo fechas, tipo de ausencia, estado,
     * historial y comentarios asociados.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public MyLeaveRequestDetailsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de detalles de la solicitud de permiso esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Comment.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnComment,"Pantalla My Leaves Request Details");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add Comment.
     * Abre el popup para agregar un comentario a la solicitud.
     */
    public void pulsarBotonAddComment(){
        esClickeable(btnAddComment);
        clickElemento(btnAddComment, "Pulsar botón Add Comment");
    }

    /**
     * Realiza clic en el botón de acciones del primer registro.
     * Despliega el menú de acciones disponibles.
     */
    public void pulsarBotonAccionesPrimerRegistro(){
        esClickeable(btnAccionesPrimerRegistro);
        clickElemento(btnAccionesPrimerRegistro, "Pulsar botón Acciones del primer registro");
    }

    /**
     * Realiza clic en el botón Comment.
     * Abre el popup para agregar o ver comentarios.
     */
    public void pulsarBotonComment(){
        esClickeable(btnComment);
        clickElemento(btnComment, "Pulsar botón Comment");
    }

    /**
     * Realiza clic en el botón Back.
     * Regresa a la pantalla anterior.
     */
    public void pulsarBotonBack(){
        esClickeable(btnBack);
        clickElemento(btnBack, "Pulsar botón Back");
    }

// </editor-fold>

}
