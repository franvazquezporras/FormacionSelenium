package org.formacion.pageobject.pantallas.Leave.Configure.LeavePeriod;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePeriodPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaStartMonth = By.xpath("");
    private By listaStartDate = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnReset = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de configuración del período de vacaciones (Leave Period).
     *
     * Esta vista permite definir el rango anual que se utilizará para el cálculo
     * y administración de permisos dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public LeavePeriodPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de configuración del período de vacaciones esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Leave Period");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona el mes de inicio del Leave Period.
     * @param opcion Mes a seleccionar.
     */
    public void seleccionarListaStartMonth(String opcion){
        esClickeable(listaStartMonth);
        seleccionarOpcion(listaStartMonth, opcion);
    }

    /**
     * Selecciona el día de inicio del Leave Period.
     * @param opcion Día a seleccionar.
     */
    public void seleccionarListaStartDate(String opcion){
        esClickeable(listaStartDate);
        seleccionarOpcion(listaStartDate, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración del Leave Period.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Reset.
     * Restablece los valores por defecto del formulario.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// </editor-fold>

}
