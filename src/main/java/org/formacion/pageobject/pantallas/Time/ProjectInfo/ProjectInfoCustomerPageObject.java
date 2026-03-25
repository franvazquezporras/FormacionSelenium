package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfoCustomerPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAdd = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEditar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de clientes
     * (Project Info → Customers) dentro del módulo de Time.
     *
     * Esta vista permite visualizar, buscar y administrar los clientes
     * registrados en el sistema. Desde aquí también es posible acceder a la
     * creación de un nuevo cliente mediante el botón Add.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectInfoCustomerPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Project Info Customers esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Add, que confirma que la vista
     * está lista para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAdd,"Pantalla Project Info Customers");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar un nuevo Customer.
     */
    public void pulsarBotonAdd(){
        esClickeable(btnAdd);
        clickElemento(btnAdd, "Pulsar botón Add");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del Customer seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el Customer seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

// </editor-fold>

}
