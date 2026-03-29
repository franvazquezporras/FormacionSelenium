package org.formacion.pageobject.comun;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object que centraliza las acciones comunes del menú lateral y la barra superior.
 * Permite navegar entre módulos y acceder a opciones globales de la aplicación.
 */
public class ComunPageObject extends BasePageObject {


    // <editor-fold desc="Locators">
    private By txtMenuLateralSearch = By.xpath("//aside[@class='oxd-sidepanel']//div[@class='oxd-main-menu-search']/input");
    private By btnMenuLateralAdmin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    private By btnMenuLateralPIM = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    private By btnMenuLateralLeave = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    private By btnMenuLateralTime = By.xpath("//a[@href='/web/index.php/time/viewTimeModule']");
    private By btnMenuLateralRecruitment = By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']");
    private By btnMenuLateralMyInfo = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");
    private By btnMenuLateralPerformance = By.xpath("//a[@href='/web/index.php/performance/viewPerformanceModule']");
    private By btnMenuLateralDashboard = By.xpath("//a[@href='/web/index.php/dashboard/index']");
    private By btnMenuLateralDirectory = By.xpath("//a[@href='/web/index.php/directory/viewDirectory']");
    private By btnMenuLateralMaintenance = By.xpath("//a[@href='/web/index.php/maintenance/viewMaintenanceModule']");
    private By btnMenuLateralClaim = By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']");
    private By btnMenuLateralBuzz = By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']");
    private By btnMenuLateralShowHide = By.xpath("//aside//button");

    private By txtBarraSuperiorNameScreen = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    private By btnBarraSuperiorUpgrade = By.xpath("//a[@href='https://orangehrm.com/open-source/upgrade-to-advanced']/button");
    private By btnBarraSuperiorMenuUsuario = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    private By btnBarraSuperiorMenuUsuarioAbout = By.xpath("//a[@href='#']");
    private By btnBarraSuperiorMenuUsuarioSupport = By.xpath("//a[@href='/web/index.php/help/support']");
    private By btnBarraSuperiorMenuUsuarioChangePassword = By.xpath("//a[@href='/web/index.php/pim/updatePassword']");
    private By btnBarraSuperiorMenuUsuarioLogout = By.xpath("//a[@href='/web/index.php/auth/logout']");
    private By btnBarraSuperiorHelp = By.xpath("//button[@title='Help']");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object común.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ComunPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el menú lateral esté completamente cargado.
     */
    public void esperarSincronizacion(){esperarPagina(btnMenuLateralShowHide,"Menu lateral");}
    //</editor-fold>

    // <editor-fold desc="Getters">
    /**
     * Devuelve el locator del nombre de la pantalla en la barra superior.
     *
     * @return Locator del nombre de pantalla.
     */
    public By gettxtBarraSuperiorNameScreen(){return txtBarraSuperiorNameScreen;}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta texto en el buscador del menú lateral.
     *
     * @param texto Texto a introducir.
     */
    public void insertarMenuLateralSearch(String texto){
        esClickeable(txtMenuLateralSearch);
        setText(txtMenuLateralSearch, texto);
    }

// -------------------------
// BOTONES — MENU LATERAL
// -------------------------

    /**
     * Accede al módulo Admin desde el menú lateral.
     */
    public void pulsarBotonMenuLateralAdmin(){
        esClickeable(btnMenuLateralAdmin);
        clickElemento(btnMenuLateralAdmin, "Pulsar botón Menu Lateral Admin");
    }

    /**
     * Accede al módulo PIM desde el menú lateral.
     */
    public void pulsarBotonMenuLateralPIM(){
        esClickeable(btnMenuLateralPIM);
        clickElemento(btnMenuLateralPIM, "Pulsar botón Menu Lateral PIM");
    }

    /**
     * Accede al módulo Leave desde el menú lateral.
     */
    public void pulsarBotonMenuLateralLeave(){
        esClickeable(btnMenuLateralLeave);
        clickElemento(btnMenuLateralLeave, "Pulsar botón Menu Lateral Leave");
    }

    /**
     * Accede al módulo Time desde el menú lateral.
     */
    public void pulsarBotonMenuLateralTime(){
        esClickeable(btnMenuLateralTime);
        clickElemento(btnMenuLateralTime, "Pulsar botón Menu Lateral Time");
    }

    /**
     * Accede al módulo Recruitment desde el menú lateral.
     */
    public void pulsarBotonMenuLateralRecruitment(){
        esClickeable(btnMenuLateralRecruitment);
        clickElemento(btnMenuLateralRecruitment, "Pulsar botón Menu Lateral Recruitment");
    }

    /**
     * Accede al módulo My Info desde el menú lateral.
     */
    public void pulsarBotonMenuLateralMyInfo(){
        esClickeable(btnMenuLateralMyInfo);
        clickElemento(btnMenuLateralMyInfo, "Pulsar botón Menu Lateral My Info");
    }

    /**
     * Accede al módulo Performance desde el menú lateral.
     */
    public void pulsarBotonMenuLateralPerformance(){
        esClickeable(btnMenuLateralPerformance);
        clickElemento(btnMenuLateralPerformance, "Pulsar botón Menu Lateral Performance");
    }

    /**
     * Accede al Dashboard desde el menú lateral.
     */
    public void pulsarBotonMenuLateralDashboard(){
        esClickeable(btnMenuLateralDashboard);
        clickElemento(btnMenuLateralDashboard, "Pulsar botón Menu Lateral Dashboard");
    }

    /**
     * Accede al módulo Directory desde el menú lateral.
     */
    public void pulsarBotonMenuLateralDirectory(){
        esClickeable(btnMenuLateralDirectory);
        clickElemento(btnMenuLateralDirectory, "Pulsar botón Menu Lateral Directory");
    }

    /**
     * Accede al módulo Maintenance desde el menú lateral.
     */
    public void pulsarBotonMenuLateralMaintenance(){
        esClickeable(btnMenuLateralMaintenance);
        clickElemento(btnMenuLateralMaintenance, "Pulsar botón Menu Lateral Maintenance");
    }

    /**
     * Accede al módulo Claim desde el menú lateral.
     */
    public void pulsarBotonMenuLateralClaim(){
        esClickeable(btnMenuLateralClaim);
        clickElemento(btnMenuLateralClaim, "Pulsar botón Menu Lateral Claim");
    }

    /**
     * Accede al módulo Buzz desde el menú lateral.
     */
    public void pulsarBotonMenuLateralBuzz(){
        esClickeable(btnMenuLateralBuzz);
        clickElemento(btnMenuLateralBuzz, "Pulsar botón Menu Lateral Buzz");
    }

    /**
     * Muestra u oculta el menú lateral.
     */
    public void pulsarBotonMenuLateralShowHide(){
        esClickeable(btnMenuLateralShowHide);
        clickElemento(btnMenuLateralShowHide, "Pulsar botón Menu Lateral Show/Hide");
    }

// -------------------------
// BOTONES — BARRA SUPERIOR
// -------------------------

    /**
     * Accede a la opción Upgrade desde la barra superior.
     */
    public void pulsarBotonBarraSuperiorUpgrade(){
        esClickeable(btnBarraSuperiorUpgrade);
        clickElemento(btnBarraSuperiorUpgrade, "Pulsar botón Barra Superior Upgrade");
    }

    /**
     * Abre el menú de usuario en la barra superior.
     */
    public void pulsarBotonBarraSuperiorMenuUsuario(){
        esClickeable(btnBarraSuperiorMenuUsuario);
        clickElemento(btnBarraSuperiorMenuUsuario, "Pulsar botón Barra Superior Menú Usuario");
    }

    /**
     * Accede a la opción About del menú de usuario.
     */
    public void pulsarBotonBarraSuperiorMenuUsuarioAbout(){
        esClickeable(btnBarraSuperiorMenuUsuarioAbout);
        clickElemento(btnBarraSuperiorMenuUsuarioAbout, "Pulsar opción About del Menú Usuario");
    }

    /**
     * Accede a la opción Support del menú de usuario.
     */
    public void pulsarBotonBarraSuperiorMenuUsuarioSupport(){
        esClickeable(btnBarraSuperiorMenuUsuarioSupport);
        clickElemento(btnBarraSuperiorMenuUsuarioSupport, "Pulsar opción Support del Menú Usuario");
    }

    /**
     * Accede a la opción Change Password del menú de usuario.
     */
    public void pulsarBotonBarraSuperiorMenuUsuarioChangePassword(){
        esClickeable(btnBarraSuperiorMenuUsuarioChangePassword);
        clickElemento(btnBarraSuperiorMenuUsuarioChangePassword, "Pulsar opción Change Password del Menú Usuario");
    }

    /**
     * Cierra sesión desde el menú de usuario.
     */
    public void pulsarBotonBarraSuperiorMenuUsuarioLogout(){
        esClickeable(btnBarraSuperiorMenuUsuarioLogout);
        clickElemento(btnBarraSuperiorMenuUsuarioLogout, "Pulsar opción Logout del Menú Usuario");
    }

    /**
     * Accede a la opción Help de la barra superior.
     */
    public void pulsarBotonBarraSuperiorHelp(){
        esClickeable(btnBarraSuperiorHelp);
        clickElemento(btnBarraSuperiorHelp, "Pulsar botón Barra Superior Help");
    }
    //</editor-fold>

}
