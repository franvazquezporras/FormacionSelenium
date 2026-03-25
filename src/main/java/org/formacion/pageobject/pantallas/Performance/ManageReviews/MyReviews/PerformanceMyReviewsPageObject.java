package org.formacion.pageobject.pantallas.Performance.ManageReviews.MyReviews;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMyReviewsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPerformanceReviewPrimerRegistro = By.xpath("");
    private By btnConsultarPrimerRegistro = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de revisiones de desempeño
     * del empleado (My Reviews) dentro del módulo de Performance.
     *
     * Esta vista permite al usuario consultar las revisiones de desempeño que
     * tiene asignadas, incluyendo información sobre evaluadores, fechas,
     * estados y acceso al detalle de cada revisión.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceMyReviewsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de My Reviews esté completamente cargada.
     * Se sincroniza verificando la presencia del primer registro disponible
     * en la tabla de revisiones.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnPerformanceReviewPrimerRegistro,"Pantalla My Reviews");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Performance Review del primer registro.
     * Abre el detalle de la revisión de desempeño.
     */
    public void pulsarBotonPerformanceReviewPrimerRegistro(){
        esClickeable(btnPerformanceReviewPrimerRegistro);
        clickElemento(btnPerformanceReviewPrimerRegistro, "Pulsar botón Performance Review del primer registro");
    }

    /**
     * Realiza clic en el botón Consultar del primer registro.
     * Abre la vista de consulta de la revisión.
     */
    public void pulsarBotonConsultarPrimerRegistro(){
        esClickeable(btnConsultarPrimerRegistro);
        clickElemento(btnConsultarPrimerRegistro, "Pulsar botón Consultar del primer registro");
    }

// </editor-fold>

}
