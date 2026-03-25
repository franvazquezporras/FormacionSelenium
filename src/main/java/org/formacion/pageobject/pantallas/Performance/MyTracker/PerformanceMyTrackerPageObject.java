package org.formacion.pageobject.pantallas.Performance.MyTracker;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMyTrackerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnViewPrimerRegistro = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de Trackers asignados al empleado
     * (My Tracker) dentro del módulo de Performance.
     *
     * Esta vista permite al usuario visualizar los trackers que tiene asignados,
     * consultar sus detalles, revisar los registros existentes y acceder a la
     * pantalla de detalle para añadir nuevas entradas de seguimiento.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceMyTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de My Tracker esté completamente cargada.
     * Se sincroniza verificando la presencia del primer registro disponible
     * en la tabla de trackers.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnViewPrimerRegistro,"Pantalla My Tracker");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón View del primer registro.
     * Abre el detalle del tracker seleccionado.
     */
    public void pulsarBotonViewPrimerRegistro(){
        esClickeable(btnViewPrimerRegistro);
        clickElemento(btnViewPrimerRegistro, "Pulsar botón View del primer registro");
    }

// </editor-fold>

}
