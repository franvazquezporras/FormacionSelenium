package org.formacion.pageobject.pantallas.Leave.Configure.WorkWeek;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkWeekPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By listaMonday = By.xpath("");
    private By listaTuesday = By.xpath("");
    private By listaWednesday = By.xpath("");
    private By listaThursday = By.xpath("");
    private By listaFriday = By.xpath("");
    private By listaSaturday = By.xpath("");
    private By listaSunday = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public WorkWeekPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Work week");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS POR DÍA
// -------------------------

    /**
     * Selecciona la configuración del día Monday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaMonday(String opcion){
        esClickeable(listaMonday);
        seleccionarOpcion(listaMonday, opcion);
    }

    /**
     * Selecciona la configuración del día Tuesday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaTuesday(String opcion){
        esClickeable(listaTuesday);
        seleccionarOpcion(listaTuesday, opcion);
    }

    /**
     * Selecciona la configuración del día Wednesday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaWednesday(String opcion){
        esClickeable(listaWednesday);
        seleccionarOpcion(listaWednesday, opcion);
    }

    /**
     * Selecciona la configuración del día Thursday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaThursday(String opcion){
        esClickeable(listaThursday);
        seleccionarOpcion(listaThursday, opcion);
    }

    /**
     * Selecciona la configuración del día Friday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaFriday(String opcion){
        esClickeable(listaFriday);
        seleccionarOpcion(listaFriday, opcion);
    }

    /**
     * Selecciona la configuración del día Saturday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaSaturday(String opcion){
        esClickeable(listaSaturday);
        seleccionarOpcion(listaSaturday, opcion);
    }

    /**
     * Selecciona la configuración del día Sunday.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaSunday(String opcion){
        esClickeable(listaSunday);
        seleccionarOpcion(listaSunday, opcion);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la configuración del Work Week.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

// </editor-fold>

}
