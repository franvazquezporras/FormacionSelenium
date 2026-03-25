package org.formacion.pageobject.pantallas.Performance.EmployeeTrackers;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceEmployeeTrackerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtEmployeeName = By.xpath("");
    private By listInclude = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnViewPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceEmployeeTrackerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSearch,"Pantalla Employee Tracker");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre del empleado en el filtro de búsqueda.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// LISTA
// -------------------------

    /**
     * Selecciona una opción en la lista Include.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaInclude(String opcion){
        esClickeable(listInclude);
        seleccionarOpcion(listInclude, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda según los filtros ingresados.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia los filtros de búsqueda.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

    /**
     * Realiza clic en el botón View del primer registro.
     * Abre el detalle del tracker del empleado.
     */
    public void pulsarBotonViewPrimerRegistro(){
        esClickeable(btnViewPrimerRegistro);
        clickElemento(btnViewPrimerRegistro, "Pulsar botón View del primer registro");
    }

// </editor-fold>

}
