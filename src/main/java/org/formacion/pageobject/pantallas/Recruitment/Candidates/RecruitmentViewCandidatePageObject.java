package org.formacion.pageobject.pantallas.Recruitment.Candidates;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentViewCandidatePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnReject = By.xpath("");
    private By btnShortlist = By.xpath("");

    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtFirstName = By.xpath("");
    private By txtMidName = By.xpath("");
    private By txtLastName = By.xpath("");
    private By listaVacancy = By.xpath("");
    private By txtEmail = By.xpath("");
    private By txtContactNumber = By.xpath("");
    private By txtResume = By.xpath("");
    private By checkKeepCurrent = By.xpath("");
    private By checkDeleteCurrent = By.xpath("");
    private By checkReplaceCurrent = By.xpath("");

    private By txtKeywords = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtNotes = By.xpath("");
    private By checkConsent = By.xpath("");
    private By checkEdit = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentViewCandidatePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(checkEdit,"Pantalla Edit Candidate");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
