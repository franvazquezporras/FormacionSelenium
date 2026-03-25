package org.formacion.pageobject.pantallas.Admin.Configuration.EmailSubscriptions;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminConfigurationSubscribersPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkPrimerRegistro = By.xpath("");
    private By btnEliminarRegistrosSeleccionados = By.xpath("");
    private By btnEliminarRegistro = By.xpath("");
    private By btnEditarRegistro = By.xpath("");
    private By btnAgregarSubscriber = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object de la pantalla de listado de suscriptores.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public AdminConfigurationSubscribersPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de listado de suscriptores esté completamente cargada.
     * Se sincroniza verificando la presencia del botón para agregar un nuevo suscriptor.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregarSubscriber,"Pantalla Listado Subscriptores");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro de la lista.
     * Se utiliza para seleccionar o deseleccionar el suscriptor.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar primer registro");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón "Eliminar registros seleccionados".
     * Elimina todos los suscriptores marcados en la lista.
     */
    public void pulsarBotonEliminarRegistrosSeleccionados(){
        esClickeable(btnEliminarRegistrosSeleccionados);
        clickElemento(btnEliminarRegistrosSeleccionados, "Pulsar botón Eliminar registros seleccionados");
    }

    /**
     * Realiza clic en el botón "Eliminar registro".
     * Elimina el registro actualmente seleccionado.
     */
    public void pulsarBotonEliminarRegistro(){
        esClickeable(btnEliminarRegistro);
        clickElemento(btnEliminarRegistro, "Pulsar botón Eliminar registro");
    }

    /**
     * Realiza clic en el botón "Editar registro".
     * Abre el popup para editar el suscriptor seleccionado.
     */
    public void pulsarBotonEditarRegistro(){
        esClickeable(btnEditarRegistro);
        clickElemento(btnEditarRegistro, "Pulsar botón Editar registro");
    }

    /**
     * Realiza clic en el botón "Agregar Subscriber".
     * Abre el popup para añadir un nuevo suscriptor.
     */
    public void pulsarBotonAgregarSubscriber(){
        esClickeable(btnAgregarSubscriber);
        clickElemento(btnAgregarSubscriber, "Pulsar botón Agregar Subscriber");
    }
    //</editor-fold>
}
