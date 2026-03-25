package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoAddCustomerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de creación de un nuevo cliente
     * (Add Customer) dentro del módulo de Time → Project Info.
     *
     * Esta vista permite registrar un cliente en el sistema, ingresando su nombre,
     * descripción y cualquier otro dato requerido para asociarlo posteriormente
     * a proyectos y actividades dentro del módulo de gestión de tiempo.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectInfoAddCustomerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Add Customer esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save, que confirma que
     * la vista está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Add Customer");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Customer.
     * @param texto Nombre del cliente.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la descripción del Customer.
     * @param texto Descripción.
     */
    public void insertarDescription(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo Customer.
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
