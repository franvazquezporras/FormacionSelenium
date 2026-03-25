package org.formacion.pageobject.pantallas.Performance.MyTracker;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformanceMyTrackerDetailsPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnAddLog = By.xpath("");
    private By btnAccionesPrimerRegistro = By.xpath("");
    private By btnAccionesEditar = By.xpath("");
    private By btnAccionesBorrar = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PerformanceMyTrackerDetailsPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnAddLog,"Pantalla Tracker Details");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Add Log.
     * Abre el popup para agregar un nuevo log al tracker.
     */
    public void pulsarBotonAddLog(){
        esClickeable(btnAddLog);
        clickElemento(btnAddLog, "Pulsar botón Add Log");
    }

    /**
     * Realiza clic en el botón Acciones del primer registro.
     * Despliega el menú de acciones disponibles.
     */
    public void pulsarBotonAccionesPrimerRegistro(){
        esClickeable(btnAccionesPrimerRegistro);
        clickElemento(btnAccionesPrimerRegistro, "Pulsar botón Acciones del primer registro");
    }

    /**
     * Realiza clic en la opción Editar dentro del menú de acciones.
     * Abre el popup para editar el log seleccionado.
     */
    public void pulsarBotonAccionesEditar(){
        esClickeable(btnAccionesEditar);
        clickElemento(btnAccionesEditar, "Pulsar botón Editar del menú Acciones");
    }

    /**
     * Realiza clic en la opción Borrar dentro del menú de acciones.
     * Elimina el log seleccionado.
     */
    public void pulsarBotonAccionesBorrar(){
        esClickeable(btnAccionesBorrar);
        clickElemento(btnAccionesBorrar, "Pulsar botón Borrar del menú Acciones");
    }

// </editor-fold>

}
