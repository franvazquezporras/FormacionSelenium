package org.formacion.pageobject.pantallas.PIM.Configuration.ReportingMethods;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationReportingMethodsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de métodos de reporte
     * (Reporting Methods) dentro del módulo de configuración de PIM.
     *
     * Esta vista permite visualizar, crear y administrar los métodos de reporte
     * utilizados en distintos procesos del sistema, proporcionando flexibilidad
     * para adaptar la gestión de información a las necesidades de la organización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMConfigurationReportingMethodsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Reporting Methods esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Reporting Methods");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

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
     * Abre la pantalla para agregar un nuevo Reporting Method.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del Reporting Method seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el Reporting Method seleccionado.
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

// </editor-fold>

}
