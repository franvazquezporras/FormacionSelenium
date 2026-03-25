package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoAddProjectPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtCustomerName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By txtProjectaDMIN = By.xpath("");
    private By btnAddCustomer = By.xpath("");
    private By btnAddProjectAdmin = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public ProjectInfoAddProjectPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Project ");}

    //</editor-fold>

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
// BOTONES
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
     * Realiza clic en el botón Save.
     * Guarda el nuevo Project.
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
