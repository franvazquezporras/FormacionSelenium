package org.formacion.pageobject.pantallas.PIM.AddEmployee;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFirstName = By.xpath("");
    private By txtMidleName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By txtEmployeeID = By.xpath("");
    private By checkLoginDetails = By.xpath("");
    private By txtUserName = By.xpath("");
    private By txtPassword = By.xpath("");
    private By txtRepeatPassword = By.xpath("");
    private By checkStatusEnable = By.xpath("");
    private By checkStatusDisabled = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AddEmployeePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Add Employee");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS PRINCIPALES
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre.
     */
    public void insertarFirstName(String texto){
        esClickeable(txtFirstName);
        setText(txtFirstName, texto);
    }

    /**
     * Inserta el segundo nombre del empleado.
     * @param texto Segundo nombre.
     */
    public void insertarMiddleName(String texto){
        esClickeable(txtMidleName);
        setText(txtMidleName, texto);
    }

    /**
     * Inserta el apellido del empleado.
     * @param texto Apellido.
     */
    public void insertarLastName(String texto){
        esClickeable(txtLastName);
        setText(txtLastName, texto);
    }

    /**
     * Inserta el Employee ID.
     * @param texto Identificador del empleado.
     */
    public void insertarEmployeeID(String texto){
        esClickeable(txtEmployeeID);
        setText(txtEmployeeID, texto);
    }

// -------------------------
// CHECKBOX LOGIN DETAILS
// -------------------------

    /**
     * Activa o desactiva la opción Login Details.
     */
    public void pulsarCheckLoginDetails(){
        esClickeable(checkLoginDetails);
        clickElemento(checkLoginDetails, "Seleccionar/Deseleccionar Login Details");
    }

// -------------------------
// INPUTS LOGIN DETAILS
// -------------------------

    /**
     * Inserta el nombre de usuario para el login.
     * @param texto Nombre de usuario.
     */
    public void insertarUserName(String texto){
        esClickeable(txtUserName);
        setText(txtUserName, texto);
    }

    /**
     * Inserta la contraseña del usuario.
     * @param texto Contraseña.
     */
    public void insertarPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword, texto);
    }

    /**
     * Inserta la repetición de la contraseña.
     * @param texto Repetición de contraseña.
     */
    public void insertarRepeatPassword(String texto){
        esClickeable(txtRepeatPassword);
        setText(txtRepeatPassword, texto);
    }

// -------------------------
// CHECKBOX STATUS
// -------------------------

    /**
     * Selecciona el estado Enable.
     */
    public void pulsarCheckStatusEnable(){
        esClickeable(checkStatusEnable);
        clickElemento(checkStatusEnable, "Seleccionar Status Enable");
    }

    /**
     * Selecciona el estado Disabled.
     */
    public void pulsarCheckStatusDisabled(){
        esClickeable(checkStatusDisabled);
        clickElemento(checkStatusDisabled, "Seleccionar Status Disabled");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda el nuevo empleado.
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
