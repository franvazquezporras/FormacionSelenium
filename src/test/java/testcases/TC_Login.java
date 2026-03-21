package testcases;

import org.formacion.base.TestCaseBase;
import org.formacion.pageobject.acceso.LoginPageObject;
import org.formacion.utils.properties.PropertiesFormacion;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class TC_Login extends TestCaseBase {

    @Override
    public void test() throws MalformedURLException, InterruptedException{
        String mainClass = this.getClass().getSimpleName();
        WebDriver driver = getDriver();

        try{
            LoginPageObject login = new LoginPageObject(driver,log,mainClass);

            irALogin();

            LoginUsuario(login);

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


    public void LoginUsuario(LoginPageObject login){
        login.esperarSincronizacion();
        login.IntroducirUsuario(PropertiesFormacion.USERNAME);
        login.IntroducirPassword(PropertiesFormacion.PASSWORD);
        login.PulsarLogin();

    }
}
