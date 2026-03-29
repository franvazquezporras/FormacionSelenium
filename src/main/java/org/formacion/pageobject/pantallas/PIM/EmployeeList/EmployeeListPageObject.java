package org.formacion.pageobject.pantallas.PIM.EmployeeList;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.LanguageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary[type='button']");
    private By btnEliminar = By.xpath("//div[1][@class='oxd-table-card']//button[i[@class='oxd-icon bi-trash']]");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By btnSearch = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary[type='submit']");
    private By btnReset = By.xpath("");
    private By txtEmployeeName = By.xpath("//div[div/label[contains(normalize-space(.), '" + LanguageManager.get("employeelist.name.employee") + "')]]//div/input");
    private By txtEmployeeID = By.xpath("");
    private By listaEmplymentStatus = By.xpath("");
    private By listaInclude = By.xpath("");
    private By txtSupervisorName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By listaSubUnit = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de listado de empleados
     * (Employee List) dentro del módulo de PIM.
     *
     * Esta vista permite buscar, filtrar, visualizar y gestionar los registros
     * de empleados existentes en el sistema. Desde aquí también se puede acceder
     * a la creación de nuevos empleados mediante el botón Agregar.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public EmployeeListPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Employee List esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Employee List");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el nombre del empleado.
     * @param texto Nombre del empleado.
     */
    public void insertarEmployeeName(String texto){
        esClickeable(txtEmployeeName);
        setText(txtEmployeeName, texto);
    }

    /**
     * Inserta el Employee ID.
     * @param texto Identificador del empleado.
     */
    public void insertarEmployeeID(String texto){
        esClickeable(txtEmployeeID);
        setText(txtEmployeeID, texto);
    }

    /**
     * Inserta el nombre del supervisor.
     * @param texto Nombre del supervisor.
     */
    public void insertarSupervisorName(String texto){
        esClickeable(txtSupervisorName);
        setText(txtSupervisorName, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Employment Status.
     * @param opcion Estado a seleccionar.
     */
    public void seleccionarListaEmploymentStatus(String opcion){
        esClickeable(listaEmplymentStatus);
        seleccionarOpcion(listaEmplymentStatus, opcion);
    }

    /**
     * Selecciona una opción en Include.
     * @param opcion Opción a seleccionar.
     */
    public void seleccionarListaInclude(String opcion){
        esClickeable(listaInclude);
        seleccionarOpcion(listaInclude, opcion);
    }

    /**
     * Selecciona un Job Title.
     * @param opcion Título a seleccionar.
     */
    public void seleccionarListaJobTitle(String opcion){
        esClickeable(listaJobTitle);
        seleccionarOpcion(listaJobTitle, opcion);
    }

    /**
     * Selecciona un Sub Unit.
     * @param opcion Subunidad a seleccionar.
     */
    public void seleccionarListaSubUnit(String opcion){
        esClickeable(listaSubUnit);
        seleccionarOpcion(listaSubUnit, opcion);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Selecciona o deselecciona el checkbox del primer registro.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar checkbox del primer registro");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar un nuevo empleado.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del empleado seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el empleado seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Delete Selected.
     * Elimina todos los registros seleccionados.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar Seleccionados");
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
     * Limpia todos los filtros de búsqueda.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// </editor-fold>

}
