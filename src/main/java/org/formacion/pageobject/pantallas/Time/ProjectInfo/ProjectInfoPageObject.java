package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAdd = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtCustomerName = By.xpath("");
    private By txtProject = By.xpath("");
    private By txtProjectAdmin = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEditar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla Project Info.
     *
     * Permite acceder a la gestión de clientes y proyectos dentro del módulo Time.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectInfoPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla Project Info esté cargada verificando el botón Add.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAdd,"Pantalla Project Info");
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
    public void insertarCustomerName(String texto){
        esClickeable(txtCustomerName);
        setText(txtCustomerName, texto);
    }

    /**
     * Inserta el nombre del Project.
     * @param texto Nombre del proyecto.
     */
    public void insertarProject(String texto){
        esClickeable(txtProject);
        setText(txtProject, texto);
    }

    /**
     * Inserta el nombre del Project Admin.
     * @param texto Nombre del administrador del proyecto.
     */
    public void insertarProjectAdmin(String texto){
        esClickeable(txtProjectAdmin);
        setText(txtProjectAdmin, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar un nuevo Project.
     */
    public void pulsarBotonAdd(){
        esClickeable(btnAdd);
        clickElemento(btnAdd, "Pulsar botón Add");
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

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del Project seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el Project seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

// </editor-fold>

}
