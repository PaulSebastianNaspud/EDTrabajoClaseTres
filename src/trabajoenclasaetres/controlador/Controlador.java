/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclasaetres.controlador;

import trabajoenclasaetres.modelo.Agenda;
import trabajoenclasaetres.modelo.Contacto;
import trabajoenclasaetres.vista.VistaContacto;
import trabajoenclasaetres.vista.VistaMenu;

/**
 *
 * @author ESTUDIANTE
 */
public class Controlador {
    VistaContacto vistaContacto;
    VistaMenu vistaMenu;
    Contacto contacto;
    Agenda<Contacto> agenda;

    public Controlador(VistaContacto vistaContacto, VistaMenu vistaMenu, Agenda<Contacto> agenda) {
        this.vistaContacto = vistaContacto;
        this.vistaMenu = vistaMenu;
        this.agenda = agenda;
    }

    
    public void iniciar() {
        int opcionPrincipal = -1;

        while (opcionPrincipal != 0) {
            opcionPrincipal = vistaMenu.mostrarMenuPrincipal();

            // Instancia de [dato] segun la opcion escogida
            switch (opcionPrincipal) {
                case 1:
                    
                    break;
                case 2:

                    
                    break;
                case 3:

                    
                    break;
                case 0:
                    vistaMenu.mostrarMensahe("Saliendo del programa...");
                    break;
                default:
                    vistaMenu.mostrarMensahe("Opcion invalida...");
                    break;
            }
        }
    }
    

    
    
}
