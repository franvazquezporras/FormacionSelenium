package org.formacion.pageobject.pantallas.Leave.Configure.Holidays;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HolidaysPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtFromDate = By.xpath("");
    private By txtToDate = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de administración de días festivos.
     *
     * Esta vista permite visualizar, crear y gestionar los feriados configurados
     * dentro del módulo de Leave.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public HolidaysPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de días festivos esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Holidays");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la fecha From para filtrar Holidays.
     * @param texto Fecha inicial.
     */
    public void insertarFromDate(String texto){
        esClickeable(txtFromDate);
        setText(txtFromDate, texto);
    }

    /**
     * Inserta la fecha To para filtrar Holidays.
     * @param texto Fecha final.
     */
    public void insertarToDate(String texto){
        esClickeable(txtToDate);
        setText(txtToDate, texto);
    }

// -------------------------
// BOTONES DE BÚSQUEDA
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda según los filtros ingresados.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia todos los filtros de búsqueda.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar primer registro");
    }

// -------------------------
// BOTONES CRUD
// -------------------------

    /**
     * Realiza clic en el botón Agregar.
     * Abre la pantalla para crear un nuevo Holiday.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar.
     * Elimina el Holiday seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los Holidays marcados.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Editar.
     * Abre la pantalla de edición del Holiday seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

// </editor-fold>

}
