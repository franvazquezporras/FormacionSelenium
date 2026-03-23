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

    //</editor-fold>
}
