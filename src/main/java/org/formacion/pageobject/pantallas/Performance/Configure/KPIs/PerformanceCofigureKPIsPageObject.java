package org.formacion.pageobject.pantallas.Performance.Configure.KPIs;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceCofigureKPIsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregarKPI = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By txtFiltroJobTitle = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceCofigureKPIsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregarKPI,"Pantalla KPIs");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
