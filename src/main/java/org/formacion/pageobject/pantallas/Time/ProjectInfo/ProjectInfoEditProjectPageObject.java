package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoEditProjectPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtCustomerName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By txtProjectaDMIN = By.xpath("");
    private By btnAddCustomer = By.xpath("");
    private By btnAddProjectAdmin = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By btnCopyFrom = By.xpath("");
    private By btnAddActivity = By.xpath("");
    private By btnEditActivity = By.xpath("");
    private By btnDeleteActivity = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de un proyecto
     * (Edit Project) dentro del módulo de Time → Project Info.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectInfoEditProjectPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Edit Project Info esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save, que confirma que
     * la vista está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Edit Project Info");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del Project.
     * @param texto Nombre del proyecto.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta el nombre del Customer asociado.
     * @param texto Nombre del cliente.
     */
    public void insertarCustomerName(String texto){
        esClickeable(txtCustomerName);
        setText(txtCustomerName, texto);
    }

    /**
     * Inserta la descripción del Project.
     * @param texto Descripción.
     */
    public void insertarDescription(String texto){
        esClickeable(txtDescription);
        setText(txtDescription, texto);
    }

    /**
     * Inserta el Project Admin.
     * @param texto Nombre del administrador del proyecto.
     */
    public void insertarProjectAdmin(String texto){
        esClickeable(txtProjectaDMIN);
        setText(txtProjectaDMIN, texto);
    }

// -------------------------
// BOTONES PRINCIPALES
// -------------------------

    /**
     * Realiza clic en el botón Add Customer.
     * Abre el popup para agregar un nuevo Customer.
     */
    public void pulsarBotonAddCustomer(){
        esClickeable(btnAddCustomer);
        clickElemento(btnAddCustomer, "Pulsar botón Add Customer");
    }

    /**
     * Realiza clic en el botón Add Project Admin.
     * Abre el popup para agregar un nuevo Project Admin.
     */
    public void pulsarBotonAddProjectAdmin(){
        esClickeable(btnAddProjectAdmin);
        clickElemento(btnAddProjectAdmin, "Pulsar botón Add Project Admin");
    }

    /**
     * Realiza clic en el botón Copy From.
     * Permite copiar actividades desde otro proyecto.
     */
    public void pulsarBotonCopyFrom(){
        esClickeable(btnCopyFrom);
        clickElemento(btnCopyFrom, "Pulsar botón Copy From");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios del Project.
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

// -------------------------
// BOTONES DE ACTIVIDADES
// -------------------------

    /**
     * Realiza clic en el botón Add Activity.
     * Abre el popup para agregar una nueva actividad al proyecto.
     */
    public void pulsarBotonAddActivity(){
        esClickeable(btnAddActivity);
        clickElemento(btnAddActivity, "Pulsar botón Add Activity");
    }

    /**
     * Realiza clic en el botón Edit Activity.
     * Abre el popup para editar la actividad seleccionada.
     */
    public void pulsarBotonEditActivity(){
        esClickeable(btnEditActivity);
        clickElemento(btnEditActivity, "Pulsar botón Edit Activity");
    }

    /**
     * Realiza clic en el botón Delete Activity.
     * Elimina la actividad seleccionada del proyecto.
     */
    public void pulsarBotonDeleteActivity(){
        esClickeable(btnDeleteActivity);
        clickElemento(btnDeleteActivity, "Pulsar botón Delete Activity");
    }

// </editor-fold>

}
