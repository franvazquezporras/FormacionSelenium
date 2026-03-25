package org.formacion.pageobject.pantallas.Time.Timesheets;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeTimesheetsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnView = By.xpath("");
    private By txtEmployeeName = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla Employee Timesheet.
     *
     * Permite consultar las hojas de tiempo de los empleados.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EmployeeTimesheetsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla Employee Timesheet cargue verificando el botón View.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnView,"Pantalla Employee Timesheet");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón View.
     * Muestra el timesheet del empleado indicado.
     */
    public void pulsarBotonView(){
        esClickeable(btnView);
        clickElemento(btnView, "Pulsar botón View");
    }

// </editor-fold>

}
