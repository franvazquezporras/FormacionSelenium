package org.formacion.pageobject.pantallas.Admin.Organization.Structure;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminOrganizationStructurePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By checkEditar = By.xpath("");
    private By btnAgregar = By.xpath("");
    private By btnEliminarStructure = By.xpath("");
    private By btnAgregarAStructure = By.xpath("");
    private By btnEditarStructure = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminOrganizationStructurePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEditar,"Pantalla Structure");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox Editar.
     * Permite habilitar o deshabilitar la edición de la estructura organizativa.
     */
    public void pulsarCheckEditar(){
        esClickeable(checkEditar);
        clickElemento(checkEditar, "Seleccionar/Deseleccionar Editar");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Agregar.
     * Abre el popup para crear una nueva estructura organizativa.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar Structure.
     * Elimina la estructura seleccionada.
     */
    public void pulsarBotonEliminarStructure(){
        esClickeable(btnEliminarStructure);
        clickElemento(btnEliminarStructure, "Pulsar botón Eliminar Structure");
    }

    /**
     * Realiza clic en el botón Agregar a Structure.
     * Permite añadir una subestructura dentro de la estructura seleccionada.
     */
    public void pulsarBotonAgregarAStructure(){
        esClickeable(btnAgregarAStructure);
        clickElemento(btnAgregarAStructure, "Pulsar botón Agregar a Structure");
    }

    /**
     * Realiza clic en el botón Editar Structure.
     * Abre el popup de edición de la estructura seleccionada.
     */
    public void pulsarBotonEditarStructure(){
        esClickeable(btnEditarStructure);
        clickElemento(btnEditarStructure, "Pulsar botón Editar Structure");
    }

// </editor-fold>

}
