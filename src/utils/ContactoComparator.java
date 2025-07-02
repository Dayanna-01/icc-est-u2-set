package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    public int compare(Contacto o1, Contacto o2) {
    int resultado = o1.getApellido().compareToIgnoreCase(o2.getApellido());
    if (resultado == 0) {
        resultado = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (resultado == 0) {
            resultado = o1.getTelefono().compareToIgnoreCase(o2.getTelefono());
        }
    }
    return resultado;
}

}
