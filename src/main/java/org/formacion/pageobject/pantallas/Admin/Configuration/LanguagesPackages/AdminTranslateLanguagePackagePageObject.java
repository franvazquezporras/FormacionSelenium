package org.formacion.pageobject.pantallas.Admin.Configuration.LanguagesPackages;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminTranslateLanguagePackagePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By listaModulo = By.xpath("");
    private By txtSourceText = By.xpath("");
    private By txtTraslatedText = By.xpath("");
    private By listaShow = By.xpath("");
    private By listaOrder = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");


    private By btnCancel = By.xpath("");
    private By btnSave = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminTranslateLanguagePackagePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Tranducir Language");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// LISTAS DESPLEGABLES
// -------------------------

    /**
     * Selecciona un módulo en la lista desplegable "Module".
     * @param texto Valor visible que se desea seleccionar.
     */
    public void seleccionarModulo(String texto){
        esClickeable(listaModulo);
        seleccionarOpcion(listaModulo, texto);
    }

    /**
     * Selecciona un valor en la lista "Show".
     * @param texto Valor visible a seleccionar.
     */
    public void seleccionarShow(String texto){
        esClickeable(listaShow);
        seleccionarOpcion(listaShow, texto);
    }

    /**
     * Selecciona un valor en la lista "Order".
     * @param texto Valor visible a seleccionar.
     */
    public void seleccionarOrder(String texto){
        esClickeable(listaOrder);
        seleccionarOpcion(listaOrder, texto);
    }

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta texto en el campo "Source Text".
     * @param texto Texto original a buscar o filtrar.
     */
    public void insertarSourceText(String texto){
        esClickeable(txtSourceText);
        setText(txtSourceText, texto);
    }

    /**
     * Inserta texto en el campo "Translated Text".
     * @param texto Traducción a introducir.
     */
    public void insertarTranslatedText(String texto){
        esClickeable(txtTraslatedText);
        setText(txtTraslatedText, texto);
    }

// -------------------------
// BOTONES DE ACCIÓN
// -------------------------

    /**
     * Realiza clic en el botón Search.
     * Ejecuta la búsqueda según los filtros establecidos.
     */
    public void pulsarBotonSearch(){
        esClickeable(btnSearch);
        clickElemento(btnSearch, "Pulsar botón Search");
    }

    /**
     * Realiza clic en el botón Reset.
     * Limpia todos los filtros aplicados.
     */
    public void pulsarBotonReset(){
        esClickeable(btnReset);
        clickElemento(btnReset, "Pulsar botón Reset");
    }

// -------------------------
// BOTONES FINALES
// -------------------------

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la operación y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

    /**
     * Realiza clic en el botón Save.
     * Guarda las traducciones realizadas.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }
    //</editor-fold>
}
