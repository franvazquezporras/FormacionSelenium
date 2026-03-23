package org.formacion.pageobject.pantallas.Leave.Configure.WorkWeek;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkWeekPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnSave = By.xpath("");
    private By listaMonday = By.xpath("");
    private By listaTuesday = By.xpath("");
    private By listaWednesday = By.xpath("");
    private By listaThursday = By.xpath("");
    private By listaFriday = By.xpath("");
    private By listaSaturday = By.xpath("");
    private By listaSunday = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public WorkWeekPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnSave,"Pantalla Work week");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
