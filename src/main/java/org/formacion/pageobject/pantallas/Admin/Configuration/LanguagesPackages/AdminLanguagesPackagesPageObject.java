package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLanguagesPackagesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");

    private By checkPrimerRegistro = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnTraducirPackage = By.xpath("");
    private By btnEliminarPackage = By.xpath("");
    private By btnDescargarPackage = By.xpath("");
    private By btnImportarPackage = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminLanguagesPackagesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Pantalla Languages Packages");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro de la lista.
     * Se utiliza para seleccionar o deseleccionar el paquete de idioma.
     */
    public void pulsarCheckPrimerRegistro(){
        esClickeable(checkPrimerRegistro);
        clickElemento(checkPrimerRegistro, "Seleccionar/Deseleccionar primer registro");
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Agregar.
     * Abre la pantalla para añadir un nuevo paquete de idioma.
     */
    public void pulsarBotonAgregar(){
        esClickeable(btnAgregar);
        clickElemento(btnAgregar, "Pulsar botón Agregar");
    }

    /**
     * Realiza clic en el botón Eliminar seleccionados.
     * Elimina todos los paquetes de idioma marcados en la lista.
     */
    public void pulsarBotonEliminarSeleccionados(){
        esClickeable(btnEliminarSeleccionados);
        clickElemento(btnEliminarSeleccionados, "Pulsar botón Eliminar seleccionados");
    }

    /**
     * Realiza clic en el botón Traducir Package.
     * Abre la pantalla de traducción del paquete seleccionado.
     */
    public void pulsarBotonTraducirPackage(){
        esClickeable(btnTraducirPackage);
        clickElemento(btnTraducirPackage, "Pulsar botón Traducir Package");
    }

    /**
     * Realiza clic en el botón Eliminar Package.
     * Elimina el paquete de idioma actualmente seleccionado.
     */
    public void pulsarBotonEliminarPackage(){
        esClickeable(btnEliminarPackage);
        clickElemento(btnEliminarPackage, "Pulsar botón Eliminar Package");
    }

    /**
     * Realiza clic en el botón Descargar Package.
     * Descarga el paquete de idioma seleccionado.
     */
    public void pulsarBotonDescargarPackage(){
        esClickeable(btnDescargarPackage);
        clickElemento(btnDescargarPackage, "Pulsar botón Descargar Package");
    }

    /**
     * Realiza clic en el botón Importar Package.
     * Abre la pantalla para importar un paquete de idioma.
     */
    public void pulsarBotonImportarPackage(){
        esClickeable(btnImportarPackage);
        clickElemento(btnImportarPackage, "Pulsar botón Importar Package");
    }
    //</editor-fold>
}
