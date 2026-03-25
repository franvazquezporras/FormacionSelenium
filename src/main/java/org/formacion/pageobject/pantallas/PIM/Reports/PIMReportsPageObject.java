package org.formacion.pageobject.pantallas.PIM.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By btnViewReport = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtReportName = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de reportes
     * (Reports) dentro del módulo de PIM.
     *
     * Esta vista permite visualizar, buscar y administrar los reportes
     * configurados en el sistema. Desde esta pantalla también es posible
     * acceder a la creación de nuevos reportes mediante el botón Agregar.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Reports esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Reports");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre del Report.
     * @param texto Nombre del reporte.
     */
    public void insertarReportName(String texto){
        esClickeable(txtReportName);
        setText(txtReportName, texto);
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
     * Abre la pantalla para agregar un nuevo Report.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del Report seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el Report seleccionado.
     */
    public void pulsarBotonEliminar(){
        esClickeable(btnEliminar);
        clickElemento(btnEliminar, "Pulsar botón Eliminar");
    }

    /**
     * Realiza clic en el botón Delete Selected.
     * Elimina todos los Reports seleccionados.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar Seleccionados");
    }

    /**
     * Realiza clic en el botón View Report.
     * Abre la vista previa del Report seleccionado.
     */
    public void pulsarBotonViewReport(){
        esClickeable(btnViewReport);
        clickElemento(btnViewReport, "Pulsar botón View Report");
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
