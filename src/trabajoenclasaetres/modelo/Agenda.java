/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclasaetres.modelo;

import trabajoenclasaetres.util.ListaEnlazada;

/**
 *
 * @author ESTUDIANTE
 */
public class Agenda<T> {
    ListaEnlazada<Contacto<T>> listaContacto;

    public Agenda() {
        listaContacto = new ListaEnlazada<>();
    }
    
    public void nuevoContacto(Contacto contacto){
        listaContacto.agregar(contacto);
    }
    
    public void eliminarContacto(Object nombre){
        for (int i = 0; i < listaContacto.obtenerTamano(); i++) {
            Contacto<T> contacto = listaContacto.obtener(i);
            if (contacto.gettNombre().equals(nombre)){
                listaContacto.eliminar(contacto);
            }
        }
    }
    
    public Contacto buscarContacto(Object nombre){
        for (int i = 0; i < listaContacto.obtenerTamano(); i++) {
            Contacto<T> contacto = listaContacto.obtener(i);
            if (contacto.gettNombre().equals(nombre)){
                return contacto;
            }
        }return null;
    }
    
}
