package org.formacion.utils.properties;

import org.formacion.utils.logger.LogManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Gestor de lectura del fichero de propiedades del framework.
 *
 * Permite obtener valores desde el archivo config.properties
 * y registrar trazas opcionalmente mediante LogManager.
 */
public class PropertiesManager {
    private String rutaFicheroProperties;
    private LogManager log;

    /**
     * Constructor por defecto.
     *
     * Inicializa la ruta del fichero de propiedades y desactiva el log.
     */
    public PropertiesManager(){
        super();
        rutaFicheroProperties = "src/test/resources/config.properties";
        this.log = null;
    }

    /**
     * Lee una propiedad del fichero config.properties.
     *
     * @param propiedad Nombre de la propiedad a consultar.
     * @return Valor asociado a la propiedad, o null si no existe.
     */
    public String leerPropiedad(String propiedad){
        Properties propiedades = new Properties();

        try{
            propiedades.load(new FileInputStream(rutaFicheroProperties));
            if(this.log != null){
                log.reporta("DEBUG", "Se abre el fichero "+rutaFicheroProperties);
            }
        }catch(IOException e){
            if (this.log != null)
                log.reporta("ERROR","Ha ocurrido un error al intentar abir el fichero properties");
            else
                log.reportaStackTrace(e);

        }
        String valorPropiedad = propiedades.getProperty(propiedad);
        if(this.log != null){
            log.reporta("ERROR", "Se ha leido la propiedad "+ propiedad +" del fichero properties.");
            log.reporta("DEBUG", "PROPIEDAD: "+propiedad+" = "+valorPropiedad);

        }
        return valorPropiedad;
    }
}
