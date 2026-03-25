package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnCandidates = By.xpath("");

    private By btnVacancies = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public RecruitmentMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnCandidates,"Menu Recruitment");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">


// -------------------------
// CANDIDATES
// -------------------------

    public void pulsarBotonCandidates(){
        esClickeable(btnCandidates);
        clickElemento(btnCandidates, "Pulsar botón Candidates");
    }

// -------------------------
// VACANCIES
// -------------------------

    public void pulsarBotonVacancies(){
        esClickeable(btnVacancies);
        clickElemento(btnVacancies, "Pulsar botón Vacancies");
    }
    //</editor-fold>
}
