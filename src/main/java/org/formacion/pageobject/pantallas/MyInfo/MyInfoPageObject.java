package org.formacion.pageobject.pantallas.MyInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPersonalDetails = By.xpath("");
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
     * Constructor del Page Object para la pantalla de información personal del empleado
     * (My Info).
     *
     * Esta vista permite acceder y gestionar los datos personales del usuario,
     * incluyendo información básica, contacto, emergencia, dependientes, documentos
     * y cualquier otro detalle disponible dentro del módulo de información personal.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public MyInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de información personal esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Personal Details.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnPersonalDetails,"Pantalla My Info");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES DE NAVEGACIÓN
// -------------------------

    /**
     * Navega a la sección Personal Details.
     */
    public void pulsarBotonPersonalDetails(){
        esClickeable(btnPersonalDetails);
        clickElemento(btnPersonalDetails, "Pulsar botón Personal Details");
    }

    /**
     * Navega a la sección Contact Details.
     */
    public void pulsarBotonContactDetails(){
        esClickeable(btnContactDetails);
        clickElemento(btnContactDetails, "Pulsar botón Contact Details");
    }

    /**
     * Navega a la sección Emergency Contacts.
     */
    public void pulsarBotonEmergencyContact(){
        esClickeable(btnEmergencyContact);
        clickElemento(btnEmergencyContact, "Pulsar botón Emergency Contact");
    }

    /**
     * Navega a la sección Dependents.
     */
    public void pulsarBotonDependents(){
        esClickeable(btnDependents);
        clickElemento(btnDependents, "Pulsar botón Dependents");
    }

    /**
     * Navega a la sección Immigration.
     */
    public void pulsarBotonInmigration(){
        esClickeable(btnInmigration);
        clickElemento(btnInmigration, "Pulsar botón Immigration");
    }

    /**
     * Navega a la sección Job.
     */
    public void pulsarBotonJob(){
        esClickeable(btnJob);
        clickElemento(btnJob, "Pulsar botón Job");
    }

    /**
     * Navega a la sección Salary.
     */
    public void pulsarBotonSalary(){
        esClickeable(btnSalary);
        clickElemento(btnSalary, "Pulsar botón Salary");
    }

    /**
     * Navega a la sección Report To.
     */
    public void pulsarBotonReportTo(){
        esClickeable(btnReportTo);
        clickElemento(btnReportTo, "Pulsar botón Report To");
    }

    /**
     * Navega a la sección Qualifications.
     */
    public void pulsarBotonQualifications(){
        esClickeable(btnQualifications);
        clickElemento(btnQualifications, "Pulsar botón Qualifications");
    }

    /**
     * Navega a la sección Memberships.
     */
    public void pulsarBotonMemberShips(){
        esClickeable(btnMemberShips);
        clickElemento(btnMemberShips, "Pulsar botón Memberships");
    }

// </editor-fold>

}
