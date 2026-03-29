package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfiguration = By.xpath("//li[span[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration") + "')]]");
    private By btnConfigurationOptionalFields = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration.optionalFields") + "')]");
    private By btnConfigurationCustomFields = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration.customFields") + "')]");
    private By btnConfigurationDataImport = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration.dataImport") + "')]");
    private By btnConfigurationReportingMethods = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration.reportingMethods") + "')]");
    private By btnConfigurationTerminationReasons = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.configuration.terminationReasons") + "')]");

    private By btnEmployeeList = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.employeeList") + "')]");

    private By btnAddEmployee = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.addEmployee") + "')]");

    private By btnReports = By.xpath("//a[contains(normalize-space(),'" + LanguageManager.get("pim.menu.reports") + "')]");
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
