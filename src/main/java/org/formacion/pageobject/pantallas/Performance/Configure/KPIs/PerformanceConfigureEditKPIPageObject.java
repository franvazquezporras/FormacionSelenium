package org.formacion.pageobject.pantallas.Performance.Configure.KPIs;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceConfigureEditKPIPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtKeyPerformanceIndicator = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By txtMinimumRating = By.xpath("");
    private By txtMaximumRating = By.xpath("");
    private By checkMakeDefaultScale = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceConfigureEditKPIPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar KPI");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del KPI.
     * @param texto Nombre del indicador de desempeño.
     */
    public void insertarKeyPerformanceIndicator(String texto){
        esClickeable(txtKeyPerformanceIndicator);
        setText(txtKeyPerformanceIndicator, texto);
    }

    /**
     * Inserta el valor mínimo permitido para la escala del KPI.
     * @param texto Valor mínimo.
     */
    public void insertarMinimumRating(String texto){
        esClickeable(txtMinimumRating);
        setText(txtMinimumRating, texto);
    }

    /**
     * Inserta el valor máximo permitido para la escala del KPI.
     * @param texto Valor máximo.
     */
    public void insertarMaximumRating(String texto){
        esClickeable(txtMaximumRating);
        setText(txtMaximumRating, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Job Title en la lista.
     * @param opcion Puesto a seleccionar.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva la opción Make Default Scale.
     */
    public void pulsarCheckMakeDefaultScale(){
        esClickeable(checkMakeDefaultScale);
        clickElemento(checkMakeDefaultScale, "Seleccionar/Deseleccionar Make Default Scale");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en el KPI.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la edición y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
