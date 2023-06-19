/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclasaetres.vista;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaMenu {

    Scanner entrada = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Ingresar un nuevo contacto");
        System.out.println("2. Buscar un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("4. Listar contactos");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        return entrada.nextInt();
    }
    
    public void mostrarMensahe(String mensaje){
        System.out.println(mensaje);
    }
}
