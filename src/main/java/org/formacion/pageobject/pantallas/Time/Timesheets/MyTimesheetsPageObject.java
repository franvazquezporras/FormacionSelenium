package org.formacion.pageobject.pantallas.Time.Timesheets;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTimesheetsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnEdit = By.xpath("");
    private By btnSubmit = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MyTimesheetsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnEdit,"Pantalla My Timesheet");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Edit.
     * Abre la pantalla para editar el timesheet.
     */
    public void pulsarBotonEdit(){
        esClickeable(btnEdit);
        clickElemento(btnEdit, "Pulsar botón Edit");
    }

    /**
     * Realiza clic en el botón Submit.
     * Envía el timesheet para aprobación.
     */
    public void pulsarBotonSubmit(){
        esClickeable(btnSubmit);
        clickElemento(btnSubmit, "Pulsar botón Submit");
    }

// </editor-fold>

}
