package org.formacion.utils.properties;

import org.formacion.utils.logger.LogManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    private String rutaFicheroProperties;
    private LogManager log;

    public PropertiesManager(){
        super();
        rutaFicheroProperties = "src/test/resources/config.properties";
        this.log = null;
    }


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
