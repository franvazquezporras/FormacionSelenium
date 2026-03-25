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
    public PerformanceMyTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnViewPrimerRegistro,"Pantalla My Tracker");}

    //</editor-fold>

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
