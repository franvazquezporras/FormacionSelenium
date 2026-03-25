package org.formacion.pageobject.pantallas.PIM.Configuration.CustomFields;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationCustomFieldsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEditar = By.xpath("");
    private By btnBorrar = By.xpath("");
    //</editor-fold>

// <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de gestión de campos personalizados
     * (Custom Fields) dentro del módulo de configuración de PIM.
     *
     * Esta vista permite visualizar, crear y administrar los campos personalizados
     * utilizados para ampliar la información registrada sobre los empleados,
     * ofreciendo flexibilidad para adaptar el sistema a necesidades específicas
     * de la organización.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMConfigurationCustomFieldsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Custom Field esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Agregar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnAgregar,"Pantalla Custom Field");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add.
     * Abre la pantalla para agregar un nuevo Custom Field.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Edit del primer registro.
     * Abre la pantalla de edición del Custom Field seleccionado.
     */
    public void pulsarBotonEditar(){
        esClickeable(btnEditar);
        clickElemento(btnEditar, "Pulsar botón Editar");
    }

    /**
     * Realiza clic en el botón Delete del primer registro.
     * Elimina el Custom Field seleccionado.
     */
    public void pulsarBotonBorrar(){
        esClickeable(btnBorrar);
        clickElemento(btnBorrar, "Pulsar botón Borrar");
    }

// </editor-fold>

}
