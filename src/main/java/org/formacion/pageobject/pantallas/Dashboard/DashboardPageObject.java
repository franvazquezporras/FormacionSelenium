package org.formacion.pageobject.pantallas.Dashboard;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnTimeAtWork = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla principal del Dashboard.
     *
     * Esta vista muestra accesos rápidos a los módulos del sistema, así como
     * información resumida del usuario y sus actividades recientes.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public DashboardPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla del Dashboard esté completamente cargada.
     * Se sincroniza verificando la presencia del botón Time At Work.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnTimeAtWork,"Pantalla Dashboard");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

    /**
     * Realiza clic en el botón Time at Work.
     * Abre la sección correspondiente dentro del Dashboard.
     */
    public void pulsarBotonTimeAtWork(){
        esClickeable(btnTimeAtWork);
        clickElemento(btnTimeAtWork, "Pulsar botón Time At Work");
    }

    // </editor-fold>

}
