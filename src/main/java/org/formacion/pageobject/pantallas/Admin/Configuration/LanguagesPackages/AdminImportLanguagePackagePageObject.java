package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminImportLanguagePackagePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtCargarFichero = By.xpath("");
    private By btnUpload = By.xpath("");
    private By btnDownload = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminImportLanguagePackagePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnUpload,"Pantalla Importar Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">
// -------------------------
// INPUT FILE
// -------------------------

    /**
     * Inserta la ruta del fichero a cargar en el campo de importación.
     * @param texto Ruta completa del archivo a subir.
     */
    public void insertarCargarFichero(String texto){
        esClickeable(txtCargarFichero);
        setText(txtCargarFichero, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Upload.
     * Inicia el proceso de carga del paquete de idioma.
     */
    public void pulsarBotonUpload(){
        esClickeable(btnUpload);
        clickElemento(btnUpload, "Pulsar botón Upload");
    }

    /**
     * Realiza clic en el botón Download.
     * Descarga la plantilla o paquete de idioma disponible.
     */
    public void pulsarBotonDownload(){
        esClickeable(btnDownload);
        clickElemento(btnDownload, "Pulsar botón Download");
    }
    //</editor-fold>
}
