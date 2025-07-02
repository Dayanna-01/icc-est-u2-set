package controllers;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;
import models.Contacto;
import utils.ContactoComparator;

public class ContactoController {
    public ContactoController(){
        runContactos();
    }

    private void runContactos() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789")); 

        System.out.println("\nContactos orden alfabetico apellido - nombre:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }

        // Orden descendente sin CASE_INSENSITIVE_ORDER
        List<Contacto> listaDescendente = contactos.stream()
            .sorted((c1, c2) -> {
                int cmp = c1.getApellido().compareToIgnoreCase(c2.getApellido());
                if (cmp == 0) {
                    cmp = c1.getNombre().compareToIgnoreCase(c2.getNombre());
                    if (cmp == 0) {
                        cmp = c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
                    }
                }
                return cmp;
            })
            .collect(Collectors.toList());

        System.out.println("\nContactos orden alfabetico apellido - nombre - telefono (descendente):");
        for (Contacto contacto : listaDescendente) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
    }
}