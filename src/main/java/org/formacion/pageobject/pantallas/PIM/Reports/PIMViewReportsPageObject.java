package org.formacion.pageobject.pantallas.PIM.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMViewReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtAllEmployeeSubUnitHierarchyReport = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PIMViewReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtAllEmployeeSubUnitHierarchyReport,"Pantalla View Reports");}

    //</editor-fold>

    // <editor-fold desc="Getters">
    public By gettxtAllEmployeeSubUnitHierarchyReport(){return txtAllEmployeeSubUnitHierarchyReport;}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
