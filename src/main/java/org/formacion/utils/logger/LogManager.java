package org.formacion.utils.logger;

import org.formacion.base.TestCaseBase;
import org.formacion.utils.properties.PropertiesFormacion;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gestor centralizado de logs para el framework.
 *
 * Configura el logger, crea el fichero de log, aplica el formato personalizado
 * y expone métodos para registrar mensajes y excepciones.
 */
public class LogManager {
    private Logger logger;
    private String nivel;
    private boolean criticidad;
    private FileHandler handler;


    /**
     * Inicializa el logger, crea el fichero de log y establece el nivel de trazas.
     */
    public LogManager(){
        try{
            logger = Logger.getLogger(LogManager.class.getName());
            logger.setUseParentHandlers(Boolean.valueOf(PropertiesFormacion.PARENT_HANDLERS));

            //Se inicializan las fechas para almacenar y nombrar los ficheros de log
            Date date = new Date();
            String day = new SimpleDateFormat("yyyy_MM_dd").format(date);
            String timeStamp = new SimpleDateFormat("-yyyy_MM_dd").format(date);

            //Se establece el formato interno del log
            FormatoLog formatter = new FormatoLog();

            //Se crear el fichero de log
            String rutaFicheroLog = PropertiesFormacion.RUTA_LOGS +"\\" +day+ "\\"+"FormacionSelenium"+timeStamp+".log";
            handler = new FileHandler(rutaFicheroLog,0,1,true);
            handler.setFormatter(formatter);
            logger.addHandler(handler);
        }catch(SecurityException | IOException e){
            reportaStackTrace(e);
        }
        this.nivel =  PropertiesFormacion.NIVEL_TRAZAS;
        if("DEBUG".equals(this.nivel))
            logger.setLevel(Level.FINEST);
        if("DETALLE".equals(this.nivel))
            logger.setLevel(Level.FINE);
        if("INFO".equals(this.nivel))
            logger.setLevel(Level.INFO);
        if("ERROR".equals(this.nivel))
            logger.setLevel(Level.SEVERE);
        if("NONE".equals(this.nivel))
            logger.setLevel(Level.OFF);
    }

    /**
     * Registra un mensaje en el nivel indicado.
     *
     * @param nivel    Nivel de log (DEBUG, DETALLE, INFO, ERROR, WARNING…)
     * @param mensaje  Texto a registrar.
     */
    public void reporta(String nivel, String mensaje){
        if("DEBUG".equals(nivel))
            this.logger.finest(mensaje+'\n');
        else if("DETALLE".equals(nivel))
            this.logger.fine(mensaje);
        else if("INFO".equals(nivel))
            this.logger.info(mensaje);
        else if("ERROR".equals(nivel))
            this.logger.severe(mensaje);
        else if("ERRORCRITICO".equals(nivel)){
            this.logger.severe(mensaje);
            TestCaseBase tCB = new TestCaseBase();
            WebDriver driver = tCB.getDriver();
            driver.quit();
        }else if ("WARNING".equals(nivel))
            this.logger.warning(mensaje);
    }


    /**
     * Cierra el fichero de log y libera recursos.
     */
    public void cerrarLog(){
        if(this.handler !=null){
            this.handler.close();
            this.handler = null;
        }
        if (this.logger != null){
            this.logger = null;
        }
    }

    /**
     * Registra el stack trace completo de una excepción.
     *
     * @param e Excepción capturada.
     */
    public void reportaStackTrace(Exception e){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace();
        this.logger.severe("======= Detalle de la excepción ====== \n"+sw.toString());
    }


    /**
     * Devuelve si existe criticidad configurada.
     *
     * @return true si hay criticidad, false en caso contrario.
     */
    public boolean devuelveCriticidad(){return criticidad;}
}
