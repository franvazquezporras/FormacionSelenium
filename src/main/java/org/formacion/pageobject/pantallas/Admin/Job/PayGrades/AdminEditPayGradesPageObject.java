package org.formacion.pageobject.pantallas.Admin.Job.PayGrades;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminEditPayGradesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSavePayGrade = By.xpath("");
    private By btnCancelPayGrade = By.xpath("");
    private By btnSaveCurrency = By.xpath("");
    private By btnCancelCurrency = By.xpath("");
    private By btnAgregarCurrency = By.xpath("");
    private By btnBorrarSeleccionadosCurrency = By.xpath("");
    private By checkPrimerRegistroCurrency = By.xpath("");
    private By btnEditarCurrency = By.xpath("");
    private By btnBorrarCurrency = By.xpath("");
    private By listaCurrency = By.xpath("");
    private By txtMinimumSalary = By.xpath("");
    private By txtMaximumSalary = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminEditPayGradesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSavePayGrade,"Pantalla Editar Pay Grade");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta el salario mínimo para la moneda seleccionada.
     * @param texto Valor del salario mínimo.
     */
    public void insertarMinimumSalary(String texto){
        esClickeable(txtMinimumSalary);
        setText(txtMinimumSalary, texto);
    }

    /**
     * Inserta el salario máximo para la moneda seleccionada.
     * @param texto Valor del salario máximo.
     */
    public void insertarMaximumSalary(String texto){
        esClickeable(txtMaximumSalary);
        setText(txtMaximumSalary, texto);
    }

// -------------------------
// LISTA
// -------------------------

    /**
     * Selecciona una moneda de la lista Currency.
     * @param texto Nombre de la moneda a seleccionar.
     */
    public void seleccionarCurrency(String texto){
        esClickeable(listaCurrency);
        seleccionarOpcion(listaCurrency, texto);
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva el checkbox del primer registro de Currency.
     * Se utiliza para seleccionar o deseleccionar la moneda.
     */
    public void pulsarCheckPrimerRegistroCurrency(){
        esClickeable(checkPrimerRegistroCurrency);
        clickElemento(checkPrimerRegistroCurrency, "Seleccionar/Deseleccionar primer registro Currency");
    }

// -------------------------
// BOTONES PAY GRADE
// -------------------------

    /**
     * Realiza clic en el botón Save del Pay Grade.
     * Guarda los cambios generales del Pay Grade.
     */
    public void pulsarBotonSavePayGrade(){
        esClickeable(btnSavePayGrade);
        clickElemento(btnSavePayGrade, "Pulsar botón Save Pay Grade");
    }

    /**
     * Realiza clic en el botón Cancel del Pay Grade.
     * Cancela la edición del Pay Grade.
     */
    public void pulsarBotonCancelPayGrade(){
        esClickeable(btnCancelPayGrade);
        clickElemento(btnCancelPayGrade, "Pulsar botón Cancel Pay Grade");
    }

// -------------------------
// BOTONES CURRENCY
// -------------------------

    /**
     * Realiza clic en el botón Save de Currency.
     * Guarda los valores de salario mínimo y máximo para la moneda seleccionada.
     */
    public void pulsarBotonSaveCurrency(){
        esClickeable(btnSaveCurrency);
        clickElemento(btnSaveCurrency, "Pulsar botón Save Currency");
    }

    /**
     * Realiza clic en el botón Cancel de Currency.
     * Cancela la edición de la moneda.
     */
    public void pulsarBotonCancelCurrency(){
        esClickeable(btnCancelCurrency);
        clickElemento(btnCancelCurrency, "Pulsar botón Cancel Currency");
    }

    /**
     * Realiza clic en el botón Agregar Currency.
     * Abre la sección para añadir una nueva moneda al Pay Grade.
     */
    public void pulsarBotonAgregarCurrency(){
        esClickeable(btnAgregarCurrency);
        clickElemento(btnAgregarCurrency, "Pulsar botón Agregar Currency");
    }

    /**
     * Realiza clic en el botón Borrar seleccionados de Currency.
     * Elimina todas las monedas marcadas en la lista.
     */
    public void pulsarBotonBorrarSeleccionadosCurrency(){
        esClickeable(btnBorrarSeleccionadosCurrency);
        clickElemento(btnBorrarSeleccionadosCurrency, "Pulsar botón Borrar seleccionados Currency");
    }

    /**
     * Realiza clic en el botón Editar Currency.
     * Abre la edición de la moneda seleccionada.
     */
    public void pulsarBotonEditarCurrency(){
        esClickeable(btnEditarCurrency);
        clickElemento(btnEditarCurrency, "Pulsar botón Editar Currency");
    }

    /**
     * Realiza clic en el botón Borrar Currency.
     * Elimina la moneda actualmente seleccionada.
     */
    public void pulsarBotonBorrarCurrency(){
        esClickeable(btnBorrarCurrency);
        clickElemento(btnBorrarCurrency, "Pulsar botón Borrar Currency");
    }

// </editor-fold>

}
