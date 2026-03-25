package org.formacion.pageobject.pantallas.PIM.Configuration.DataImport;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMConfigurationDataImportPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnDownload = By.xpath("");
    private By btnUpload = By.xpath("");
    private By btnAgregarFichero = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMConfigurationDataImportPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnUpload,"Pantalla Data Import");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Download.
     * Descarga la plantilla de importación de datos.
     */
    public void pulsarBotonDownload(){
        esClickeable(btnDownload);
        clickElemento(btnDownload, "Pulsar botón Download");
    }

    /**
     * Realiza clic en el botón Agregar Fichero.
     * Abre el selector de archivos para subir un fichero CSV.
     */
    public void pulsarBotonAgregarFichero(){
        esClickeable(btnAgregarFichero);
        clickElemento(btnAgregarFichero, "Pulsar botón Agregar Fichero");
    }

    /**
     * Realiza clic en el botón Upload.
     * Sube el archivo seleccionado para importación.
     */
    public void pulsarBotonUpload(){
        esClickeable(btnUpload);
        clickElemento(btnUpload, "Pulsar botón Upload");
    }

// </editor-fold>

}
