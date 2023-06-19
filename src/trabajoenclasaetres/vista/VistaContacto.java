/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclasaetres.vista;

import java.util.Scanner;
import trabajoenclasaetres.modelo.Contacto;
import trabajoenclasaetres.util.ListaEnlazada;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaContacto {
    Scanner entrada = new Scanner(System.in);
    
    public Contacto crear(){
        System.out.println("Ingrese el nombre del contacto: ");
        Object nombre = entrada.next();
        System.out.println("Ingrese el numero del contacto: ");
        Object numero = entrada.next();
        return new Contacto(nombre, numero);
    }
    
    public Object eliminar(Object object){
        System.out.println("Ingrese el nombre del objecto a eliminar: ");
        return entrada.next();
    }
    
    public Object buscar(Object object){
        System.out.println("Ingrese el nombre del objecto a buscar: ");
        return entrada.next();
    }
    
    public void verContacto(Contacto contacto){
        if(contacto != null){
            System.out.println(contacto);
        }else{
            System.out.println("El contacto no se a encontrado");
        }
    
    }
    
    public void verLista(ListaEnlazada<Contacto> listaAux){
        for (int i = 0; i < listaAux.obtenerTamano(); i++) {
            Contacto contacto = listaAux.obtener(i);
            System.out.println(contacto);
        }
    }
    
    
}
