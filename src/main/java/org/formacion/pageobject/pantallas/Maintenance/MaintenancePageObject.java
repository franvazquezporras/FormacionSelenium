package org.formacion.pageobject.pantallas.Maintenance;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MaintenancePageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPassword = By.xpath("");
    private By btnConfirm = By.xpath("");
    private By btnCancel = By.xpath("");

    //</editor-fold>

    // <editor-fold desc="Constructor">
    public MaintenancePageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnConfirm,"Pantalla Mantenimiento");}

    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta la contraseña requerida para acceder a la sección de mantenimiento.
     * @param texto Contraseña del usuario.
     */
    public void insertarPassword(String texto){
        esClickeable(txtPassword);
        setText(txtPassword, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Confirm.
     * Confirma la acción e ingresa a la sección de mantenimiento.
     */
    public void pulsarBotonConfirm(){
        esClickeable(btnConfirm);
        clickElemento(btnConfirm, "Pulsar botón Confirm");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cancela la acción y regresa a la pantalla anterior.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
