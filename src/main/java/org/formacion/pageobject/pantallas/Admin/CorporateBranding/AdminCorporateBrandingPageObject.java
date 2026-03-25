package org.formacion.pageobject.pantallas.Admin.CorporateBranding;

import org.formacion.pageobject.general.BasePageObject;
import org.formacion.utils.logger.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCorporateBrandingPageObject extends BasePageObject {

    // <editor-fold desc="Locators">
    private By btnPublish = By.xpath("");
    private By btnPreview = By.xpath("");
    private By btnResetToDefault = By.xpath("");
    private By txtClientLogo = By.xpath("");
    private By txtClientBanner = By.xpath("");
    private By txtLoginBanner = By.xpath("");

    private By btnPrimaryColor = By.xpath("");
    private By btnPrimaryFontColor = By.xpath("");
    private By btnPrimaryGradientColor1 = By.xpath("");
    private By btnSecondaryColor = By.xpath("");
    private By btnSecondaryFontColor = By.xpath("");
    private By btnPrimaryGradientColor2 = By.xpath("");
    private By checkSocialMediaImages = By.xpath("");
    //</editor-fold>

    // <editor-fold desc="Constructor">
    public AdminCorporateBrandingPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
    //</editor-fold>

    // <editor-fold desc="Sincronizacion">
    public void esperarSincronizacion(){esperarPagina(btnPublish,"Pantalla Corporate Branding");}
    //</editor-fold>

    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUTS (IMÁGENES / FICHEROS)
// -------------------------

    /**
     * Inserta la ruta del archivo para el Client Logo.
     * @param texto Ruta completa del archivo.
     */
    public void insertarClientLogo(String texto){
        esClickeable(txtClientLogo);
        setText(txtClientLogo, texto);
    }

    /**
     * Inserta la ruta del archivo para el Client Banner.
     * @param texto Ruta completa del archivo.
     */
    public void insertarClientBanner(String texto){
        esClickeable(txtClientBanner);
        setText(txtClientBanner, texto);
    }

    /**
     * Inserta la ruta del archivo para el Login Banner.
     * @param texto Ruta completa del archivo.
     */
    public void insertarLoginBanner(String texto){
        esClickeable(txtLoginBanner);
        setText(txtLoginBanner, texto);
    }

// -------------------------
// BOTONES DE COLOR
// -------------------------

    /**
     * Realiza clic en el selector de Primary Color.
     */
    public void pulsarBotonPrimaryColor(){
        esClickeable(btnPrimaryColor);
        clickElemento(btnPrimaryColor, "Pulsar botón Primary Color");
    }

    /**
     * Realiza clic en el selector de Primary Font Color.
     */
    public void pulsarBotonPrimaryFontColor(){
        esClickeable(btnPrimaryFontColor);
        clickElemento(btnPrimaryFontColor, "Pulsar botón Primary Font Color");
    }

    /**
     * Realiza clic en el selector de Primary Gradient Color 1.
     */
    public void pulsarBotonPrimaryGradientColor1(){
        esClickeable(btnPrimaryGradientColor1);
        clickElemento(btnPrimaryGradientColor1, "Pulsar botón Primary Gradient Color 1");
    }

    /**
     * Realiza clic en el selector de Secondary Color.
     */
    public void pulsarBotonSecondaryColor(){
        esClickeable(btnSecondaryColor);
        clickElemento(btnSecondaryColor, "Pulsar botón Secondary Color");
    }

    /**
     * Realiza clic en el selector de Secondary Font Color.
     */
    public void pulsarBotonSecondaryFontColor(){
        esClickeable(btnSecondaryFontColor);
        clickElemento(btnSecondaryFontColor, "Pulsar botón Secondary Font Color");
    }

    /**
     * Realiza clic en el selector de Primary Gradient Color 2.
     */
    public void pulsarBotonPrimaryGradientColor2(){
        esClickeable(btnPrimaryGradientColor2);
        clickElemento(btnPrimaryGradientColor2, "Pulsar botón Primary Gradient Color 2");
    }

// -------------------------
// CHECKBOX
// -------------------------

    /**
     * Activa o desactiva la opción Social Media Images.
     * Controla si se muestran o no las imágenes de redes sociales.
     */
    public void pulsarCheckSocialMediaImages(){
        esClickeable(checkSocialMediaImages);
        clickElemento(checkSocialMediaImages, "Seleccionar Social Media Images");
    }

// -------------------------
// BOTONES PRINCIPALES
// -------------------------

    /**
     * Realiza clic en el botón Publish.
     * Publica los cambios de personalización corporativa.
     */
    public void pulsarBotonPublish(){
        esClickeable(btnPublish);
        clickElemento(btnPublish, "Pulsar botón Publish");
    }

    /**
     * Realiza clic en el botón Preview.
     * Muestra una vista previa de los cambios aplicados.
     */
    public void pulsarBotonPreview(){
        esClickeable(btnPreview);
        clickElemento(btnPreview, "Pulsar botón Preview");
    }

    /**
     * Realiza clic en el botón Reset to Default.
     * Restaura la configuración de branding a los valores por defecto.
     */
    public void pulsarBotonResetToDefault(){
        esClickeable(btnResetToDefault);
        clickElemento(btnResetToDefault, "Pulsar botón Reset to Default");
    }

// </editor-fold>

}
