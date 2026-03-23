package org.formacion.pageobject.pantallas.Admin.Job.JobTitles;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminEditJobTitlesPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtJobTitle = By.xpath("");
    private By txtJobDescription = By.xpath("");
    private By txtJobNotes = By.xpath("");
    private By txtJobSpecifications = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminEditJobTitlesPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Editar Job Title");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
