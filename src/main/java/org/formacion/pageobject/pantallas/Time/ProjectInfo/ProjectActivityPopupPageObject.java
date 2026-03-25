package org.formacion.pageobject.pantallas.Time.ProjectInfo;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectActivityPopupPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtName = By.xpath("");
    private By btnSave = By.xpath("");
    private By btnCancel = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    /**
     * Constructor del Page Object para el popup de creación o edición de una
     * actividad de proyecto (Add/Edit Project Activity).
     *
     * Este popup permite añadir una nueva actividad asociada a un proyecto o
     * modificar una existente, incluyendo su nombre, estado y cualquier otro
     * parámetro configurado dentro del módulo de Time/Projects.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public ProjectActivityPopupPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

    // <editor-fold desc="Sincronizacion">
    /**
     * Espera a que el popup de Add/Edit Project Activity esté completamente cargado.
     * Se sincroniza verificando la presencia del botón Save, que confirma que el
     * popup está listo para interactuar.
     */
    public void esperarSincronizacion(){
        esperarPagina(btnSave,"Popup Add/Edit Project Activity");
    }
// </editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el nombre de la actividad del proyecto.
     * @param texto Nombre de la actividad.
     */
    public void insertarName(String texto){
        esClickeable(txtName);
        setText(txtName, texto);
    }

// -------------------------
// BOTONES
// -------------------------

    /**
     * Realiza clic en el botón Save.
     * Guarda la actividad del proyecto.
     */
    public void pulsarBotonSave(){
        esClickeable(btnSave);
        clickElemento(btnSave, "Pulsar botón Save");
    }

    /**
     * Realiza clic en el botón Cancel.
     * Cierra el popup sin guardar cambios.
     */
    public void pulsarBotonCancel(){
        esClickeable(btnCancel);
        clickElemento(btnCancel, "Pulsar botón Cancel");
    }

// </editor-fold>

}
