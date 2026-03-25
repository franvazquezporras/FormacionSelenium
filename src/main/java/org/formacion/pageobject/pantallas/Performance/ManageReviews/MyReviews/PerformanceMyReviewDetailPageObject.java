package org.formacion.pageobject.pantallas.Performance.ManageReviews.MyReviews;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMyReviewDetailPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnComplete = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de detalles de una revisión
     * de desempeño del empleado (My Review Details) dentro del módulo de Performance.
     *
     * Esta vista permite al usuario consultar y actualizar la información asociada
     * a su propia revisión de desempeño, incluyendo comentarios, calificaciones,
     * competencias evaluadas y cualquier otro dato relevante del proceso.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceMyReviewDetailPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de My Review Details esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla My Review Details");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Complete.
     * Marca la revisión como completada.
     */
    public void pulsarBotonComplete(){
        esClickeable(btnComplete);
        clickElemento(btnComplete, "Pulsar botón Complete");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en la revisión.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
