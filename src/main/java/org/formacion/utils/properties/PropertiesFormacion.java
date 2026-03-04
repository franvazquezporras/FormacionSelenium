package org.formacion.utils.properties;

public class PropertiesFormacion {
    public static final PropertiesManager pm = new PropertiesManager();

    //Ruta web
    public static final String RUTA_URL = pm.leerPropiedad("ruta.url");


    //Trazas y logs
    public static final String RUTA_LOGS = pm.leerPropiedad("ruta.logs");
    public static final String PARENT_HANDLERS = pm.leerPropiedad("parent.handlers");
    public static final String NIVEL_TRAZAS = pm.leerPropiedad("nivel.trazas");


    //datos usuarios
    public static final String USERNAME = pm.leerPropiedad("username");
    public static final String PASSWORD = pm.leerPropiedad("password");
}
