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
    /**
     * Constructor del Page Object para la pantalla principal de Buzz.
     *
     * @param driver    Driver del navegador.
     * @param log       Gestor de logs.
     * @param mainClass Clase principal que ejecuta la prueba.
     */
    public BuzzPageObject(WebDriver driver, LogManager log, String mainClass){
        super(driver, log, mainClass);
    }
// </editor-fold>

// <editor-fold desc="Sincronizacion">
    /**
     * Espera a que la pantalla de Buzz esté completamente cargada.
     * Se sincroniza verificando la presencia del campo de texto para crear un post.
     */
    public void esperarSincronizacion(){
        esperarPagina(txtPost,"Pantalla Buzz");
    }
// </editor-fold>


    // <editor-fold desc="Funciones de locators">

// -------------------------
// INPUT
// -------------------------

    /**
     * Inserta el texto del Post.
     * @param texto Contenido del post.
     */
    public void insertarPost(String texto){
        esClickeable(txtPost);
        setText(txtPost, texto);
    }

// -------------------------
// BOTONES PRINCIPALES
// -------------------------

    /**
     * Realiza clic en el botón Post.
     * Publica un nuevo post.
     */
    public void pulsarBotonPost(){
        esClickeable(btnPost);
        clickElemento(btnPost, "Pulsar botón Post");
    }

    /**
     * Realiza clic en el botón Share Foto.
     * Abre la opción para compartir una imagen.
     */
    public void pulsarBotonShareFoto(){
        esClickeable(btnShareFoto);
        clickElemento(btnShareFoto, "Pulsar botón Share Foto");
    }

    /**
     * Realiza clic en el botón Share Video.
     * Abre la opción para compartir un video.
     */
    public void pulsarBotonShareVideo(){
        esClickeable(btnShareVideo);
        clickElemento(btnShareVideo, "Pulsar botón Share Video");
    }

// -------------------------
// FILTROS
// -------------------------

    /**
     * Aplica el filtro Most Recent Post.
     */
    public void pulsarBotonFiltroMostRecentPost(){
        esClickeable(btnFiltroMostRecentPost);
        clickElemento(btnFiltroMostRecentPost, "Pulsar filtro Most Recent Post");
    }

    /**
     * Aplica el filtro Most Liked Post.
     */
    public void pulsarBotonFiltroMostLikedPost(){
        esClickeable(btnFiltroMostLikedPost);
        clickElemento(btnFiltroMostLikedPost, "Pulsar filtro Most Liked Post");
    }

    /**
     * Aplica el filtro Most Commented Post.
     */
    public void pulsarBotonFiltroMostCommentedPost(){
        esClickeable(btnFiltroMostCommentedPost);
        clickElemento(btnFiltroMostCommentedPost, "Pulsar filtro Most Commented Post");
    }

// -------------------------
// ACCIONES SOBRE UN POST
// -------------------------

    /**
     * Abre el menú de acciones del post.
     */
    public void pulsarBotonAccionesPost(){
        esClickeable(btnAccionesPost);
        clickElemento(btnAccionesPost, "Abrir menú de acciones del post");
    }

    /**
     * Selecciona la opción Editar dentro del menú de acciones.
     */
    public void pulsarBotonAccionesPostEditar(){
        esClickeable(btnAccionesPostEditar);
        clickElemento(btnAccionesPostEditar, "Pulsar acción Editar post");
    }

    /**
     * Selecciona la opción Eliminar dentro del menú de acciones.
     */
    public void pulsarBotonAccionesPostEliminar(){
        esClickeable(btnAccionesPostEliminar);
        clickElemento(btnAccionesPostEliminar, "Pulsar acción Eliminar post");
    }

// -------------------------
// INTERACCIONES CON EL POST
// -------------------------

    /**
     * Realiza clic en el botón Like.
     */
    public void pulsarBotonLike(){
        esClickeable(btnLike);
        clickElemento(btnLike, "Pulsar botón Like");
    }

    /**
     * Realiza clic en el botón Comentar.
     */
    public void pulsarBotonComentar(){
        esClickeable(btnComentar);
        clickElemento(btnComentar, "Pulsar botón Comentar");
    }

    /**
     * Realiza clic en el botón Compartir.
     */
    public void pulsarBotonCompartir(){
        esClickeable(btnCompartir);
        clickElemento(btnCompartir, "Pulsar botón Compartir");
    }

// </editor-fold>

}
