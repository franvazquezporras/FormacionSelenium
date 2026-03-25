package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoEditCustomerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By txtDescription = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de edición de un cliente
     * (Edit Customer) dentro del módulo de Time → Project Info.
     *
     * Esta vista permite modificar la información de un cliente existente,
     * incluyendo su nombre, descripción y cualquier otro dato asociado que
     * pueda afectar a los proyectos vinculados a dicho cliente.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectInfoEditCustomerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Edit Customer esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Save, que confirma que
     * la vista está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Pantalla Edit Customer");
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
     * Guarda los cambios del Customer.
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
