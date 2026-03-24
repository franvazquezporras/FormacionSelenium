package org.formacion.pageobject.pantallas.PIM.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMEditReportsPageObject extends BasePageObject {
    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel= By.xpath("");
    private By txtReportName = By.xpath("");
    private By listaSelectionCriteria = By.xpath("");
    private By btnAddSelectionCriteria = By.xpath("");
    private By listaInclude= By.xpath("");
    private By listaSelectDisplayFieldGroup = By.xpath("");
    private By listaSelectDisplayField = By.xpath("");
    private By btnAddSelectDisplayField = By.xpath("");
    //agregar campos extras
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMEditReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Reports");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
