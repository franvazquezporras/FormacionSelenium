package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfiguration = By.xpath("");
    private By btnConfigurationOptionalFields = By.xpath("");
    private By btnConfigurationCustomFields = By.xpath("");
    private By btnConfigurationDataImport = By.xpath("");
    private By btnConfigurationReportingMethods = By.xpath("");
    private By btnConfigurationTerminationReasons = By.xpath("");

    private By btnEmployeeList = By.xpath("");

    private By btnAddEmployee = By.xpath("");

    private By btnReports = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú PIM.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú PIM esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnEmployeeList,"Menu Performance");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CONFIGURATION
// -------------------------

    /**
     * Abre la sección Configuration del módulo PIM.
     */
    public void pulsarBotonConfiguration(){
        esClickeable(btnConfiguration);
        clickElemento(btnConfiguration, "Pulsar botón Configuration");
    }

    /**
     * Accede a Optional Fields dentro de Configuration.
     */
    public void pulsarBotonConfigurationOptionalFields(){
        esClickeable(btnConfigurationOptionalFields);
        clickElemento(btnConfigurationOptionalFields, "Pulsar botón Configuration - Optional Fields");
    }

    /**
     * Accede a Custom Fields dentro de Configuration.
     */
    public void pulsarBotonConfigurationCustomFields(){
        esClickeable(btnConfigurationCustomFields);
        clickElemento(btnConfigurationCustomFields, "Pulsar botón Configuration - Custom Fields");
    }

    /**
     * Accede a Data Import dentro de Configuration.
     */
    public void pulsarBotonConfigurationDataImport(){
        esClickeable(btnConfigurationDataImport);
        clickElemento(btnConfigurationDataImport, "Pulsar botón Configuration - Data Import");
    }

    /**
     * Accede a Reporting Methods dentro de Configuration.
     */
    public void pulsarBotonConfigurationReportingMethods(){
        esClickeable(btnConfigurationReportingMethods);
        clickElemento(btnConfigurationReportingMethods, "Pulsar botón Configuration - Reporting Methods");
    }

    /**
     * Accede a Termination Reasons dentro de Configuration.
     */
    public void pulsarBotonConfigurationTerminationReasons(){
        esClickeable(btnConfigurationTerminationReasons);
        clickElemento(btnConfigurationTerminationReasons, "Pulsar botón Configuration - Termination Reasons");
    }

// -------------------------
// EMPLOYEE LIST
// -------------------------

    /**
     * Accede a la pantalla Employee List.
     */
    public void pulsarBotonEmployeeList(){
        esClickeable(btnEmployeeList);
        clickElemento(btnEmployeeList, "Pulsar botón Employee List");
    }

// -------------------------
// ADD EMPLOYEE
// -------------------------

    /**
     * Accede a la pantalla Add Employee.
     */
    public void pulsarBotonAddEmployee(){
        esClickeable(btnAddEmployee);
        clickElemento(btnAddEmployee, "Pulsar botón Add Employee");
    }

// -------------------------
// REPORTS
// -------------------------

    /**
     * Accede a la sección Reports del módulo PIM.
     */
    public void pulsarBotonReports(){
        esClickeable(btnReports);
        clickElemento(btnReports, "Pulsar botón Reports");
    }
    //</editor-fold>
}
