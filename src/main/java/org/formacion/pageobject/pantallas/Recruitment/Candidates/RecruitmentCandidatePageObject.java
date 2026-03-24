package org.formacion.pageobject.pantallas.Recruitment.Candidates;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentCandidatePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAgregar = By.xpath("");
    private By btnEliminar = By.xpath("");
    private By btnEliminarSeleccionados = By.xpath("");
    private By btnEditar = By.xpath("");
    private By checkPrimerRegistro = By.xpath("");
    private By btnSearch = By.xpath("");
    private By btnReset = By.xpath("");
    private By txtJobTitle = By.xpath("");
    private By listaVacancy = By.xpath("");
    private By listaHiringManager = By.xpath("");
    private By listaStatus = By.xpath("");
    private By txtCandidateName = By.xpath("");
    private By txtKeywords = By.xpath("");
    private By txtDateFrom = By.xpath("");
    private By txtDateTo = By.xpath("");
    private By listaMethodApplication = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentCandidatePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAgregar,"Pantalla Candidates");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
