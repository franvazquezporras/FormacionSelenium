package org.formacion.pageobject.pantallas.Directory;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirectoryPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtEmployeeName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By listaLocation = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla del Directorio.
     *
     * Esta vista permite buscar y consultar información de empleados
     * dentro de la organización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public DirectoryPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla del Directorio esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Search.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSearch,"Pantalla Directory");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado para filtrar.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Job Title en la lista.
     * @param opcion Job Title a seleccionar.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

    /**
     * Selecciona una Location en la lista.
     * @param opcion Ubicación a seleccionar.
     */
    public void seleccionarListaLocation(String opcion){
        esClickeable(listaLocation);
        seleccionarOpcion(listaLocation, opcion);
    }

// -------------------------
// BOTONES
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

// </editor-fold>

}
