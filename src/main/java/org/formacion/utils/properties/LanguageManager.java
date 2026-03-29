package org.formacion.utils.properties;

import java.io.InputStream;
import java.util.Properties;

public class LanguageManager {

    private static Properties props = new Properties();

    static {
        loadLanguage();
    }

    private static void loadLanguage() {
        try {
            // 1. Cargar config.properties
            Properties config = new Properties();
            InputStream configStream = LanguageManager.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            config.load(configStream);

            String lang = config.getProperty("language", "es");

            // 2. Cargar el fichero de literales correspondiente
            String fileName = "literales/literales_" + lang + ".properties";

            InputStream langStream = LanguageManager.class
                    .getClassLoader()
                    .getResourceAsStream(fileName);

            if (langStream == null) {
                throw new RuntimeException("No se encontró el fichero de idioma: " + fileName);
            }

            props.load(langStream);

        } catch (Exception e) {
            throw new RuntimeException("Error cargando idioma", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
