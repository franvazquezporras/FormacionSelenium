package org.formacion.pageobject.pantallas.Admin.Organization.Locations;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationLocationPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregarLocation = By.xpath("");
    private By btnSearch = By.cssSelector("button[type='submit']");
    private By btnReset = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By txtFiltroCity = By.xpath("");
    private By txtFiltroName = By.xpath("");
    private By listaFiltroCountry = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de listado de Locations.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminOrganizationLocationPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Locations esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar Location.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregarLocation,"Pantalla Locations");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS (FILTROS)
// -------------------------

    /**
     * Inserta un valor en el filtro City.
     * @param texto Ciudad a filtrar.
     */
    public void insertarFiltroCity(String texto){
        esClickeable(txtFiltroCity);
        setText(txtFiltroCity, texto);
    }

    /**
     * Inserta un valor en el filtro Name.
     * @param texto Nombre a filtrar.
     */
    public void insertarFiltroName(String texto){
        esClickeable(txtFiltroName);
        setText(txtFiltroName, texto);
    }

// -------------------------
// LISTA (FILTRO)
// -------------------------

    /**
     * Selecciona un país en el filtro Country.
     * @param texto Nombre del país.
     */
    public void seleccionarFiltroCountry(String texto){
        esClickeable(listaFiltroCountry);
        seleccionarOpcion(listaFiltroCountry, texto);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro.
     * Se utiliza para seleccionar o deseleccionar la Location.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar primer registro");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Agregar Location.
     * Abre la pantalla para crear una nueva Location.
     */
    public void pulsarBotonAgregarLocation(){
        esClickeable(btnAgregarLocation);
        clickElemento(btnAgregarLocation, "Pulsar botón Agregar Location");
    }

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda con los filtros aplicados.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia todos los filtros aplicados.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina la Location actualmente seleccionada.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todas las Locations marcadas en la lista.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición de la Location seleccionada.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
