package org.formacion.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.formacion.utils.logger.LogManager;
import org.formacion.utils.properties.PropertiesFormacion;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
/**
 * Clase base para todos los casos de prueba.
 * Gestiona la configuración del navegador, la inicialización del logger,
 * la captura de pantallas, el cierre seguro del driver y utilidades comunes.
 */
public class TestCaseBase {
    /** Driver principal utilizado en los casos de prueba. */
    protected WebDriver driver;
    /** Logger para registrar la ejecución de los casos de prueba. */
    protected LogManager log;

    /**
     * Método de prueba genérico.
     * Es sobrescrito por cada caso de prueba específico.
     *
     * @throws InterruptedException si ocurre un error en la ejecución.
     * @throws IOException si ocurre un error al manejar archivos.
     */
    @Test
    public void test() throws InterruptedException, IOException{
        //metodo sobreescrito por cada caso de prueba
    }

    /**
     * Abre la URL definida en el archivo de propiedades.
     * Se ejecuta antes de iniciar un caso de prueba.
     */
    @Parameters
    //Abre el navegador en la web indicada
    public void irALogin(){driver.get(PropertiesFormacion.RUTA_URL);}

    /**
     * Configura el entorno antes de cada método de prueba.
     * Inicializa el logger, selecciona el navegador desde properties,
     * abre el navegador y navega a la URL inicial.
     */
    @BeforeMethod
    public void setUp(){

        // Log
        log = new LogManager();

        // Leer navegador desde properties
        String browser = PropertiesFormacion.BROWSER;

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Navegador no soportado: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(PropertiesFormacion.RUTA_URL);
    }

    /**
     * Realiza una captura de pantalla y la guarda en la ruta configurada.
     *
     * @param nombre Nombre base del archivo de captura.
     */
    public void takeScreenshot(String nombre){
        //realiza capturas cuando detecta un error en la ejecucion
        try{
            File srcFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File(PropertiesFormacion.RUTA_LOGS + "\\"+day()+"\\"+"capturas"+"\\"+nombre+"-"+date()+".jpeg"),true);
        }catch(IOException e){
            log.reporta("ERROR","Error en la generación de la captura de pantalla"+e);
        }
    }

    /**
     * Devuelve el driver actual.
     *
     * @return WebDriver driver actual.
     */
    public WebDriver getDriver(){return this.driver;}

    /**
     * Genera una cadena con la fecha y hora actual en formato yyyy_MM_dd-HH_mm_ss.
     *
     * @return Fecha formateada como String.
     */
    public String date(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     * Genera una cadena con la fecha actual en formato yyyy_MM_dd.
     *
     * @return Día actual formateado como String.
     */
    public String day(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Date day = new Date();
        return dateFormat.format(day);
    }

    /**
     * Genera una fecha modificada a partir de la fecha actual.
     *
     * @param dias   Días a sumar.
     * @param meses  Meses a sumar.
     * @param anios  Años a sumar.
     * @param formato Formato de salida (ej: "dd/MM/yyyy").
     * @return Fecha generada como String.
     */
    public static String generarFecha(int dias,int meses, int anios, String formato){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaModificada = fechaActual.plusDays(dias).plusMonths(meses).plusYears(anios);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return fechaModificada.format(formatter);
    }

    /**
     * Cierra el navegador de forma segura después de cada método de prueba.
     * Elimina cookies, cierra el driver y finaliza el log.
     */
    @AfterMethod
    //Cierra el navegador tras finalizar la ejecucion del caso de prueba
    public void closeDriverSafe(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        for(Cookie cookie : allCookies){
            driver.manage().deleteCookieNamed(cookie.getName());
        }

        if(this.driver != null){
            this.driver.quit();
            this.driver = null;
        }
        log.cerrarLog();
    }
}
