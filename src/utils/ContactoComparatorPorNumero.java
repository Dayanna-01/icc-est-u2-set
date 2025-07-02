package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorPorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int resultado = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (resultado == 0) {
            resultado = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        }
        if (resultado == 0) {
            // Teléfono en orden descendente
            resultado = o2.getTelefono().compareToIgnoreCase(o1.getTelefono());
        }
        return resultado;
    }
}
