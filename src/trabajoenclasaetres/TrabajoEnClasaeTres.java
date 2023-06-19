/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclasaetres;

import trabajoenclasaetres.modelo.Agenda;
import trabajoenclasaetres.modelo.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class TrabajoEnClasaeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda<Contacto> agendaContactos = new Agenda();
        
        agendaContactos.nuevoContacto(new Contacto("Paul1", 03124));
        agendaContactos.nuevoContacto(new Contacto("Paul2", 03124));
        agendaContactos.nuevoContacto(new Contacto("Paul3", 03124));
        agendaContactos.nuevoContacto(new Contacto("Paul", 03124));
        agendaContactos.nuevoContacto(new Contacto("Paul5", 03124));
        System.out.println(agendaContactos.buscarContacto("Paul"));
        agendaContactos.eliminarContacto("Paul");
                System.out.println(agendaContactos.buscarContacto("Paul"));

        
    }
    
}
