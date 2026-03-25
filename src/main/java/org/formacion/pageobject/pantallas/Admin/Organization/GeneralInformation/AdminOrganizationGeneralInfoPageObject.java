package org.formacion.pageobject.pantallas.Admin.Organization.GeneralInformation;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationGeneralInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By checkEdit = By.xpath("");
    private By txtOrganizationName = By.xpath("");
    private By txtNumberEmployees = By.xpath("");
    private By txtRegistrationNumber = By.xpath("");
    private By txtTaxID = By.xpath("");
    private By txtPhone = By.xpath("");
    private By txtFax = By.xpath("");
    private By txtEmail = By.xpath("");
    private By txtAddressStreet1 = By.xpath("");
    private By txtAddressStreet2 = By.xpath("");
    private By txtCity = By.xpath("");
    private By txtStateProvince = By.xpath("");
    private By txtPostalCode = By.xpath("");
    private By txtNotes = By.xpath("");
    private By listaCountry = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationGeneralInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEdit,"Pantalla General Info");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox Edit.
     * Permite habilitar o deshabilitar la edición de los campos.
     */
    public void pulsarCheckEdit(){
        esClickeable(checkEdit);
        clickElemento(checkEdit, "Seleccionar/Deseleccionar Edit");
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre de la organización.
     * @param texto Nombre de la organización.
     */
    public void insertarOrganizationName(String texto){
        esClickeable(txtOrganizationName);
        setText(txtOrganizationName, texto);
    }

    /**
     * Inserta el número de empleados.
     * @param texto Cantidad de empleados.
     */
    public void insertarNumberEmployees(String texto){
        esClickeable(txtNumberEmployees);
        setText(txtNumberEmployees, texto);
    }

    /**
     * Inserta el número de registro.
     * @param texto Número de registro.
     */
    public void insertarRegistrationNumber(String texto){
        esClickeable(txtRegistrationNumber);
        setText(txtRegistrationNumber, texto);
    }

    /**
     * Inserta el Tax ID.
     * @param texto Identificación fiscal.
     */
    public void insertarTaxID(String texto){
        esClickeable(txtTaxID);
        setText(txtTaxID, texto);
    }

    /**
     * Inserta el número de teléfono.
     * @param texto Teléfono de contacto.
     */
    public void insertarPhone(String texto){
        esClickeable(txtPhone);
        setText(txtPhone, texto);
    }

    /**
     * Inserta el número de fax.
     * @param texto Número de fax.
     */
    public void insertarFax(String texto){
        esClickeable(txtFax);
        setText(txtFax, texto);
    }

    /**
     * Inserta el correo electrónico.
     * @param texto Dirección de correo.
     */
    public void insertarEmail(String texto){
        esClickeable(txtEmail);
        setText(txtEmail, texto);
    }

    /**
     * Inserta la dirección (calle 1).
     * @param texto Dirección línea 1.
     */
    public void insertarAddressStreet1(String texto){
        esClickeable(txtAddressStreet1);
        setText(txtAddressStreet1, texto);
    }

    /**
     * Inserta la dirección (calle 2).
     * @param texto Dirección línea 2.
     */
    public void insertarAddressStreet2(String texto){
        esClickeable(txtAddressStreet2);
        setText(txtAddressStreet2, texto);
    }

    /**
     * Inserta la ciudad.
     * @param texto Ciudad.
     */
    public void insertarCity(String texto){
        esClickeable(txtCity);
        setText(txtCity, texto);
    }

    /**
     * Inserta el estado o provincia.
     * @param texto Estado o provincia.
     */
    public void insertarStateProvince(String texto){
        esClickeable(txtStateProvince);
        setText(txtStateProvince, texto);
    }

    /**
     * Inserta el código postal.
     * @param texto Código postal.
     */
    public void insertarPostalCode(String texto){
        esClickeable(txtPostalCode);
        setText(txtPostalCode, texto);
    }

    /**
     * Inserta notas adicionales.
     * @param texto Notas.
     */
    public void insertarNotes(String texto){
        esClickeable(txtNotes);
        setText(txtNotes, texto);
    }

// -------------------------
// LISTA
// -------------------------

    /**
     * Selecciona un país de la lista Country.
     * @param texto Nombre del país.
     */
    public void seleccionarCountry(String texto){
        esClickeable(listaCountry);
        seleccionarOpcion(listaCountry, texto);
    }

// -------------------------
// BOTÓN
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la información general de la organización.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

// </editor-fold>

}
