package org.formacion.pageobject.pantallas.Leave.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeaveEntitlementsUsageReportPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaLeavePeriod = By.xpath("");
    private By btnGenerate = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla del reporte de uso de asignaciones
     * de permisos del empleado (My Leave Entitlements Usage Report).
     *
     * Esta vista permite al usuario generar un informe detallado sobre el uso de sus
     * propios días de permiso asignados, filtrando por período, tipo de ausencia
     * y otros criterios disponibles dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public MyLeaveEntitlementsUsageReportPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla del reporte de uso de asignaciones de permisos del empleado
     * esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Generate.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnGenerate,"Pantalla My Leaves Entitlements Usage Report");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Leave Period en la lista.
     * @param opcion Periodo a seleccionar.
     */
    public void seleccionarListaLeavePeriod(String opcion){
        esClickeable(listaLeavePeriod);
        seleccionarOpcion(listaLeavePeriod, opcion);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Generate.
     * Genera el reporte según el periodo seleccionado.
     */
    public void pulsarBotonGenerate(){
        esClickeable(btnGenerate);
        clickElemento(btnGenerate, "Pulsar botón Generate");
    }

// </editor-fold>

}
