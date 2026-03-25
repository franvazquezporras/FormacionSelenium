package org.formacion.pageobject.menus;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMenuPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnConfigure = By.xpath("");
    private By btnConfigureKPIs = By.xpath("");
    private By btnConfigureTrackers = By.xpath("");

    private By btnManageReviews = By.xpath("");
    private By btnManageReviewsManageReviews = By.xpath("");
    private By btnManageReviewsMyReviews = By.xpath("");
    private By btnManageReviewsEmployeeReviews = By.xpath("");

    private By btnMyTrackers = By.xpath("");

    private By btnEmployeeTrackers = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object del menú Performance.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PerformanceMenuPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }

    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú Performance esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnManageReviews,"Menu Performance");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// CONFIGURE
// -------------------------

    /**
     * Abre la sección Configure del módulo Performance.
     */
    public void pulsarBotonConfigure(){
        esClickeable(btnConfigure);
        clickElemento(btnConfigure, "Pulsar botón Configure");
    }

    /**
     * Accede a la opción KPIs dentro de Configure.
     */
    public void pulsarBotonConfigureKPIs(){
        esClickeable(btnConfigureKPIs);
        clickElemento(btnConfigureKPIs, "Pulsar botón Configure - KPIs");
    }

    /**
     * Accede a la opción Trackers dentro de Configure.
     */
    public void pulsarBotonConfigureTrackers(){
        esClickeable(btnConfigureTrackers);
        clickElemento(btnConfigureTrackers, "Pulsar botón Configure - Trackers");
    }

// -------------------------
// MANAGE REVIEWS
// -------------------------

    /**
     * Abre la sección Manage Reviews.
     */
    public void pulsarBotonManageReviews(){
        esClickeable(btnManageReviews);
        clickElemento(btnManageReviews, "Pulsar botón Manage Reviews");
    }

    /**
     * Accede a Manage Reviews dentro de la sección Manage Reviews.
     */
    public void pulsarBotonManageReviewsManageReviews(){
        esClickeable(btnManageReviewsManageReviews);
        clickElemento(btnManageReviewsManageReviews, "Pulsar botón Manage Reviews - Manage Reviews");
    }

    /**
     * Accede a My Reviews dentro de la sección Manage Reviews.
     */
    public void pulsarBotonManageReviewsMyReviews(){
        esClickeable(btnManageReviewsMyReviews);
        clickElemento(btnManageReviewsMyReviews, "Pulsar botón Manage Reviews - My Reviews");
    }

    /**
     * Accede a Employee Reviews dentro de la sección Manage Reviews.
     */
    public void pulsarBotonManageReviewsEmployeeReviews(){
        esClickeable(btnManageReviewsEmployeeReviews);
        clickElemento(btnManageReviewsEmployeeReviews, "Pulsar botón Manage Reviews - Employee Reviews");
    }

// -------------------------
// MY TRACKERS
// -------------------------

    /**
     * Accede a la sección My Trackers.
     */
    public void pulsarBotonMyTrackers(){
        esClickeable(btnMyTrackers);
        clickElemento(btnMyTrackers, "Pulsar botón My Trackers");
    }

// -------------------------
// EMPLOYEE TRACKERS
// -------------------------

    /**
     * Accede a la sección Employee Trackers.
     */
    public void pulsarBotonEmployeeTrackers(){
        esClickeable(btnEmployeeTrackers);
        clickElemento(btnEmployeeTrackers, "Pulsar botón Employee Trackers");
    }
    //</editor-fold>
}
