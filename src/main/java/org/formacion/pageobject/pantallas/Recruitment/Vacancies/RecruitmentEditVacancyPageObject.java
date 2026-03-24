package org.formacion.pageobject.pantallas.Recruitment.Vacancies;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentEditVacancyPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    private By txtVacancyName = By.xpath("");
    private By listaJobTitle = By.xpath("");
    private By txtDescription = By.xpath("");
    private By txtHiringManager = By.xpath("");
    private By txtNumberPositions = By.xpath("");
    private By checkActive = By.xpath("");
    private By checkPublishRSS = By.xpath("");
    private By btnRSSFeedURL = By.xpath("");
    private By btnWebPageURL = By.xpath("");
    private By btnAddAttachment = By.xpath("");
    private By btnEditAttachment = By.xpath("");
    private By btnDeleteAttachment = By.xpath("");
    private By btnDescargarAttachment = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentEditVacancyPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Edit Vacancy");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
