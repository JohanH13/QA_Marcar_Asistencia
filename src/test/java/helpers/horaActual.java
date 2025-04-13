package helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class horaActual {

    public static void main(String[] args) {
        // Capturamos el momento actual
        LocalDateTime ahora = LocalDateTime.now();

        // Mostramos la hora en formato HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = ahora.format(formatter);

        System.out.println("La hora actual es: " + horaFormateada );
    }



}
