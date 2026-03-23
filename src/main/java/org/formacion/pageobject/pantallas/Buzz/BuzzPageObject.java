package org.formacion.pageobject.pantallas.Buzz;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By txtPost = By.xpath("");
    private By btnPost = By.xpath("");
    private By btnShareFoto = By.xpath("");
    private By btnShareVideo = By.xpath("");
    private By btnFiltroMostRecentPost = By.xpath("");
    private By btnFiltroMostLikedPost = By.xpath("");
    private By btnFiltroMostCommentedPost = By.xpath("");
    private By btnAccionesPost = By.xpath("");
    private By btnAccionesPostEditar = By.xpath("");
    private By btnAccionesPostEliminar = By.xpath("");
    private By btnLike = By.xpath("");
    private By btnComentar = By.xpath("");
    private By btnCompartir = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public BuzzPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(txtPost,"Pantalla Buzz");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

    //</editor-fold>
}
