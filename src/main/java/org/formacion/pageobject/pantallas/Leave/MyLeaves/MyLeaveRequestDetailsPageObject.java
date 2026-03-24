package org.formacion.pageobject.pantallas.Leave.MyLeaves;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeaveRequestDetailsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAddComment = By.xpath("");
    private By btnAccionesPrimerRegistro = By.xpath("");
    private By btnComment = By.xpath("");
    private By btnBack = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyLeaveRequestDetailsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnComment,"Pantalla My Leaves Request Details");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
