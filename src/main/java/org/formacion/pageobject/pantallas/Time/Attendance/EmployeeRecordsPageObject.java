package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeRecordsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnView = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtEmployeeName = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de registros de empleados
     * (Employee Records).
     *
     * Esta vista permite visualizar y consultar los registros almacenados
     * relacionados con empleados, incluyendo información histórica, acciones
     * realizadas y cualquier dato relevante asociado a los mismos.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EmployeeRecordsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Employee Records esté completamente cargada.
     * Se sincroniza verificando la presencia del botón View, que indica que
     * la vista está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnView,"Pantalla Employee Records");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la fecha para consultar los registros.
     * @param texto Fecha.
     */
    public void insertarDate(String texto){
        esClickeable(txtDate);
        setText(txtDate, texto);
    }

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón View.
     * Muestra los registros del empleado según los filtros aplicados.
     */
    public void pulsarBotonView(){
        esClickeable(btnView);
        clickElemento(btnView, "Pulsar botón View");
    }

// </editor-fold>

}
