package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyRecordsEditPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtPunchInDate = By.xpath("");
    private By txtPunchInTime = By.xpath("");
    private By txtPunchInNote = By.xpath("");
    private By txtPunchOutDate = By.xpath("");
    private By txtPunchOutTime = By.xpath("");
    private By txtPunchOutNote = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyRecordsEditPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit My Records");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
