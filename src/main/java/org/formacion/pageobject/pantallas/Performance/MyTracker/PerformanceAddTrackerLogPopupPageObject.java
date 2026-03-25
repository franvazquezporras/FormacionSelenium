package org.formacion.pageobject.pantallas.Performance.MyTracker;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceAddTrackerLogPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By btnPositive = By.xpath("");
    private By btnNegative = By.xpath("");
    private By txtLog = By.xpath("");
    private By txtComment = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de registro de actividad
     * de un Tracker (Add Tracker Log) dentro del módulo de Performance.
     *
     * Este popup permite añadir una nueva entrada de seguimiento para un tracker,
     * incluyendo comentarios, fechas y cualquier información relevante asociada
     * al registro de desempeño del empleado.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceAddTrackerLogPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de Add Tracker Log esté completamente cargado.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Popup Add Tracker Log");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el texto del log.
     * @param texto Contenido del log.
     */
    public void insertarLog(String texto){
        esClickeable(txtLog);
        setText(txtLog, texto);
    }

    /**
     * Inserta un comentario adicional para el log.
     * @param texto Comentario del usuario.
     */
    public void insertarComment(String texto){
        esClickeable(txtComment);
        setText(txtComment, texto);
    }

// -------------------------
// BOTONES DE SELECCIÓN
// -------------------------

    /**
     * Selecciona la opción Positive.
     */
    public void pulsarBotonPositive(){
        esClickeable(btnPositive);
        clickElemento(btnPositive, "Pulsar botón Positive");
    }

    /**
     * Selecciona la opción Negative.
     */
    public void pulsarBotonNegative(){
        esClickeable(btnNegative);
        clickElemento(btnNegative, "Pulsar botón Negative");
    }

// -------------------------
// BOTONES DE ACCIÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo log del tracker.
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
