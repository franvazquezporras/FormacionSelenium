package org.formacion.utils.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Formateador personalizado para los registros del logger.
 *
 * Genera líneas de log con fecha, nivel de severidad y mensaje,
 * usando un formato legible y simplificado.
 */
public class FormatoLog extends Formatter {
    private final DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    @Override
    public String format(LogRecord record){
        StringBuilder builder = new StringBuilder(1000);
        String severidad = "";

        if(record.getLevel().equals(Level.SEVERE))
            severidad = "ERROR";
        else if ((record.getLevel().equals(Level.ALL)) || (record.getLevel().equals(Level.FINE)) || (record.getLevel().equals(Level.FINER)) || (record.getLevel().equals(Level.FINEST)))
            severidad = "DEBUG";
        else
            severidad = "WARNING";

        builder.append(df.format(new Date(record.getMillis()))).append(" - ");
        builder.append("[").append(severidad).append("] - ");
        builder.append(formatMessage(record));
        builder.append("\n");
        return builder.toString();
    }
}
