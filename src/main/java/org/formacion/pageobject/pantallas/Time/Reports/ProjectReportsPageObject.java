package org.formacion.pageobject.pantallas.Time.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnView = By.xpath("");
    private By txtProjectName = By.xpath("");
    private By txtProjectDateRangeFrom = By.xpath("");
    private By txtProjectDateRangeTo = By.xpath("");
    private By checkOnlyIncludeApprovedTimesheets = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ProjectReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnView,"Pantalla Project Report");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del proyecto.
     * @param texto Nombre del proyecto.
     */
    public void insertarProjectName(String texto){
        esClickeable(txtProjectName);
        setText(txtProjectName, texto);
    }

    /**
     * Inserta la fecha inicial del rango del proyecto.
     * @param texto Fecha desde.
     */
    public void insertarProjectDateRangeFrom(String texto){
        esClickeable(txtProjectDateRangeFrom);
        setText(txtProjectDateRangeFrom, texto);
    }

    /**
     * Inserta la fecha final del rango del proyecto.
     * @param texto Fecha hasta.
     */
    public void insertarProjectDateRangeTo(String texto){
        esClickeable(txtProjectDateRangeTo);
        setText(txtProjectDateRangeTo, texto);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox Only Include Approved Timesheets.
     */
    public void pulsarCheckOnlyIncludeApprovedTimesheets(){
        esClickeable(checkOnlyIncludeApprovedTimesheets);
        clickElemento(checkOnlyIncludeApprovedTimesheets, "Seleccionar/Deseleccionar Only Include Approved Timesheets");
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón View.
     * Genera el reporte con los filtros aplicados.
     */
    public void pulsarBotonView(){
        esClickeable(btnView);
        clickElemento(btnView, "Pulsar botón View");
    }

// </editor-fold>

}
