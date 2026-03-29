package testcases;

import org.formacion.base.TestCaseBase;
import org.formacion.pageobject.acceso.LoginPageObject;
import org.formacion.pageobject.comun.ComunPageObject;
import org.formacion.utils.properties.PropertiesFormacion;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class TC_AED_License extends TestCaseBase {

    @Override
    public void test() throws MalformedURLException, InterruptedException{
        // <editor-fold desc="Configuración Test">
        String mainClass = this.getClass().getSimpleName();
        WebDriver driver = getDriver();
        // </editor-fold>

        try{
            // <editor-fold desc="Inicialización PageObject">
            LoginPageObject login = new LoginPageObject(driver,log,mainClass);
            ComunPageObject comun = new ComunPageObject(driver,log,mainClass);
            // </editor-fold>

            //Inicio Test
            irALogin();
            //Step1
            LoginUsuario(login);
            //Step2
            NavegarALicenses();
            //Step3
            NavegarAAgregarLicense();
            //Step4
            CrearLicense();
            //Step5
            EditarLicense();
            //Step6
            EliminarLicense();
            //Step7
            CerrarSesion(comun);

            if(log.devuelveCriticidad()){
                log.reporta("INFO","-----El caso de prueba se ha completado correctamente------");
                log.reporta("INFO","Fin");
            }
        }catch(Exception e){
            takeScreenshot(this.getClass().getSimpleName()+"_ERROR");
            log.reporta("ERROR","-------El caso de prueba no ha finalizado correctamente------");
            throw new NoSuchElementException(e.getMessage());
        }
    }

    // <editor-fold desc="Step1">
    public void LoginUsuario(LoginPageObject login){
        log.reporta("INFO","Step1: Login");
        login.esperarSincronizacion();
        login.IntroducirUsuario(PropertiesFormacion.USERNAME);
        login.IntroducirPassword(PropertiesFormacion.PASSWORD);
        login.PulsarLogin();
    }
    // </editor-fold>

    // <editor-fold desc="Step2">
    public void NavegarALicenses(){
        log.reporta("INFO","Step2: Navegar a Licenses");

    }
    // </editor-fold>

    // <editor-fold desc="Step3">
    public void NavegarAAgregarLicense(){
        log.reporta("INFO","Step3: Navegar a AddLicense");

    }
    // </editor-fold>

    // <editor-fold desc="Step4">
    public void CrearLicense() {
        log.reporta("INFO","Step4: Agregar License");

    }
    // </editor-fold>

    // <editor-fold desc="Step5">
    public void EditarLicense(){
        log.reporta("INFO","Step5: Editar License");

    }
    // </editor-fold>

    // <editor-fold desc="Step6">
    public void EliminarLicense(){
        log.reporta("INFO","Step6: Eliminar License");

    }
    // </editor-fold>
    
    // <editor-fold desc="Step7">
    public void CerrarSesion(ComunPageObject comun) throws InterruptedException {
        log.reporta("INFO","Step7: Cerrar Sesion");
        comun.pulsarBotonBarraSuperiorMenuUsuario();
        comun.pulsarBotonBarraSuperiorMenuUsuarioLogout();
        Thread.sleep(5000);
    }
    // </editor-fold>

}
