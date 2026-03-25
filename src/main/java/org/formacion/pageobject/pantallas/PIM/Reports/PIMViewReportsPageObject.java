package org.formacion.pageobject.pantallas.PIM.Reports;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMViewReportsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtAllEmployeeSubUnitHierarchyReport = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para la pantalla de visualización de reportes
     * (View Reports) dentro del módulo de PIM.
     *
     * Esta vista permite acceder a los reportes configurados en el sistema y
     * visualizar su contenido. Desde aquí el usuario puede consultar informes
     * generados previamente, incluyendo jerarquías, estructuras organizativas
     * y cualquier otro reporte disponible.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public PIMViewReportsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de View Reports esté completamente cargada.
     * Se sincroniza verificando la presencia del elemento correspondiente al
     * reporte "All Employee Sub Unit Hierarchy Report".
     */
    public void esperarSincronizacion(){
        esperarPagina(txtAllEmployeeSubUnitHierarchyReport,"Pantalla View Reports");
    }
// </editor-fold>

    // <editor-fold desc="Getters">
    /**
     * Obtiene el localizador del reporte "All Employee Sub Unit Hierarchy Report".
     *
     * @return Localizador By del elemento del reporte.
     */
    public By gettxtAllEmployeeSubUnitHierarchyReport(){
        return txtAllEmployeeSubUnitHierarchyReport;
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
