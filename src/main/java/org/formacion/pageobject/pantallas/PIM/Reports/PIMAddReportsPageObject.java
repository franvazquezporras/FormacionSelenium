package org.formacion.pageobject.pantallas.PIM.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMAddReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel= By.xpath("");
    private By txtReportName = By.xpath("");
    private By listaSelectionCriteria = By.xpath("");
    private By btnAddSelectionCriteria = By.xpath("");
    private By listaInclude= By.xpath("");
    private By listaSelectDisplayFieldGroup = By.xpath("");
    private By listaSelectDisplayField = By.xpath("");
    private By btnAddSelectDisplayField = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMAddReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Reports");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre del Report.
     * @param texto Nombre del reporte.
     */
    public void insertarReportName(String texto){
        esClickeable(txtReportName);
        setText(txtReportName, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Selection Criteria.
     * @param opcion Criterio a seleccionar.
     */
    public void seleccionarListaSelectionCriteria(String opcion){
        esClickeable(listaSelectionCriteria);
        seleccionarOpcion(listaSelectionCriteria, opcion);
    }

    /**
     * Selecciona una opción en Include.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaInclude(String opcion){
        esClickeable(listaInclude);
        seleccionarOpcion(listaInclude, opcion);
    }

    /**
     * Selecciona un Display Field Group.
     * @param opcion Grupo a seleccionar.
     */
    public void seleccionarListaSelectDisplayFieldGroup(String opcion){
        esClickeable(listaSelectDisplayFieldGroup);
        seleccionarOpcion(listaSelectDisplayFieldGroup, opcion);
    }

    /**
     * Selecciona un Display Field.
     * @param opcion Campo a seleccionar.
     */
    public void seleccionarListaSelectDisplayField(String opcion){
        esClickeable(listaSelectDisplayField);
        seleccionarOpcion(listaSelectDisplayField, opcion);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add Selection Criteria.
     * Agrega el criterio seleccionado a la lista del reporte.
     */
    public void pulsarBotonAddSelectionCriteria(){
        esClickeable(btnAddSelectionCriteria);
        clickElemento(btnAddSelectionCriteria, "Pulsar botón Add Selection Criteria");
    }

    /**
     * Realiza clic en el botón Add Display Field.
     * Agrega el campo seleccionado al reporte.
     */
    public void pulsarBotonAddSelectDisplayField(){
        esClickeable(btnAddSelectDisplayField);
        clickElemento(btnAddSelectDisplayField, "Pulsar botón Add Display Field");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Report.
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
