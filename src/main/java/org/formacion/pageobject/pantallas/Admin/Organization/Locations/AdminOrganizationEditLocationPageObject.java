package org.formacion.pageobject.pantallas.Admin.Organization.Locations;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationEditLocationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtCity = By.xpath("");
    private By txtProvince = By.xpath("");
    private By txtPostalCode = By.xpath("");
    private By listaCountry = By.xpath("");
    private By txtPhone = By.xpath("");
    private By txtFax = By.xpath("");
    private By txtAddress = By.xpath("");
    private By txtNotes = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationEditLocationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Location");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre de la Location.
     * @param texto Nombre de la ubicación.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

    /**
     * Inserta la ciudad de la Location.
     * @param texto Ciudad.
     */
    public void insertarCity(String texto){
        esClickeable(txtCity);
        setText(txtCity, texto);
    }

    /**
     * Inserta la provincia o estado.
     * @param texto Provincia o estado.
     */
    public void insertarProvince(String texto){
        esClickeable(txtProvince);
        setText(txtProvince, texto);
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
     * Inserta la dirección completa.
     * @param texto Dirección.
     */
    public void insertarAddress(String texto){
        esClickeable(txtAddress);
        setText(txtAddress, texto);
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
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda los cambios realizados en la Location.
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

// </editor-fold>

}
