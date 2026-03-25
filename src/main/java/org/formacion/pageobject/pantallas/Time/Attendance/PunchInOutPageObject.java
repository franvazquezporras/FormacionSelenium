package org.formacion.pageobject.pantallas.Time.Attendance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PunchInOutPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnIn = By.xpath("");
    private By txtDate = By.xpath("");
    private By txtTime = By.xpath("");
    private By listaTimezone = By.xpath("");
    private By txtNote = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public PunchInOutPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnIn,"Pantalla Punch In Out");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS
// -------------------------

    /**
     * Inserta la fecha del Punch.
     * @param texto Fecha.
     */
    public void insertarDate(String texto){
        esClickeable(txtDate);
        setText(txtDate, texto);
    }

    /**
     * Inserta la hora del Punch.
     * @param texto Hora.
     */
    public void insertarTime(String texto){
        esClickeable(txtTime);
        setText(txtTime, texto);
    }

    /**
     * Inserta una nota para el Punch.
     * @param texto Nota.
     */
    public void insertarNote(String texto){
        esClickeable(txtNote);
        setText(txtNote, texto);
    }

// -------------------------
// LISTAS
// -------------------------

    /**
     * Selecciona un Timezone.
     * @param opcion Zona horaria.
     */
    public void seleccionarListaTimezone(String opcion){
        esClickeable(listaTimezone);
        seleccionarOpcion(listaTimezone, opcion);
    }

// -------------------------
// BOTÓN PRINCIPAL
// -------------------------

    /**
     * Realiza clic en el botón In/Out.
     * Ejecuta la acción de Punch In o Punch Out según corresponda.
     */
    public void pulsarBotonIn(){
        esClickeable(btnIn);
        clickElemento(btnIn, "Pulsar botón In/Out");
    }

// </editor-fold>

}
