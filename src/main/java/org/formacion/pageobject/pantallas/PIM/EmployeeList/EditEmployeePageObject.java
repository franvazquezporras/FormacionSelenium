package org.formacion.pageobject.pantallas.PIM.EmployeeList;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditEmployeePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPersonalDetails = By.xpath("//a[contains(@href, '/web/index.php/pim/viewPersonalDetails/empNumber')]");
    private By btnContactDetails = By.xpath("");
    private By btnEmergencyContact = By.xpath("");
    private By btnDependents = By.xpath("");
    private By btnInmigration = By.xpath("");
    private By btnJob = By.xpath("");
    private By btnSalary = By.xpath("");
    private By btnReportTo = By.xpath("");
    private By btnQualifications = By.xpath("");
    private By btnMemberShips = By.xpath("");
    //añadir componentes de cada seccion
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de un empleado
     * (Edit Employee) dentro del módulo de PIM.
     *
     * Esta vista permite acceder y modificar la información completa del empleado,
     * incluyendo datos personales, información laboral, detalles de contacto,
     * dependientes, asignaciones y cualquier otro apartado disponible en el perfil.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EditEmployeePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Edit Employee esté completamente cargada.
     * Se sincroniza verificando la presencia del botón o pestaña de
     * Personal Details, que actúa como punto de entrada principal del perfil.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnPersonalDetails,"Pantalla Edit Employee");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES DE SECCIÓN
// -------------------------

    /**
     * Accede a la sección Personal Details.
     */
    public void pulsarBotonPersonalDetails(){
        esClickeable(btnPersonalDetails);
        clickElemento(btnPersonalDetails, "Pulsar botón Personal Details");
    }

    /**
     * Accede a la sección Contact Details.
     */
    public void pulsarBotonContactDetails(){
        esClickeable(btnContactDetails);
        clickElemento(btnContactDetails, "Pulsar botón Contact Details");
    }

    /**
     * Accede a la sección Emergency Contacts.
     */
    public void pulsarBotonEmergencyContact(){
        esClickeable(btnEmergencyContact);
        clickElemento(btnEmergencyContact, "Pulsar botón Emergency Contacts");
    }

    /**
     * Accede a la sección Dependents.
     */
    public void pulsarBotonDependents(){
        esClickeable(btnDependents);
        clickElemento(btnDependents, "Pulsar botón Dependents");
    }

    /**
     * Accede a la sección Immigration.
     */
    public void pulsarBotonInmigration(){
        esClickeable(btnInmigration);
        clickElemento(btnInmigration, "Pulsar botón Immigration");
    }

    /**
     * Accede a la sección Job.
     */
    public void pulsarBotonJob(){
        esClickeable(btnJob);
        clickElemento(btnJob, "Pulsar botón Job");
    }

    /**
     * Accede a la sección Salary.
     */
    public void pulsarBotonSalary(){
        esClickeable(btnSalary);
        clickElemento(btnSalary, "Pulsar botón Salary");
    }

    /**
     * Accede a la sección Report To.
     */
    public void pulsarBotonReportTo(){
        esClickeable(btnReportTo);
        clickElemento(btnReportTo, "Pulsar botón Report To");
    }

    /**
     * Accede a la sección Qualifications.
     */
    public void pulsarBotonQualifications(){
        esClickeable(btnQualifications);
        clickElemento(btnQualifications, "Pulsar botón Qualifications");
    }

    /**
     * Accede a la sección Memberships.
     */
    public void pulsarBotonMemberShips(){
        esClickeable(btnMemberShips);
        clickElemento(btnMemberShips, "Pulsar botón Memberships");
    }

// </editor-fold>

}
