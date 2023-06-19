/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclasaetres.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Contacto<T> {
    private T tNombre;
    private T tTelefono;

    public Contacto() {
    }

    public Contacto(T tNombre, T tTelefono) {
        this.tNombre = tNombre;
        this.tTelefono = tTelefono;
    }

    public T gettNombre() {
        return tNombre;
    }

    public void settNombre(T tNombre) {
        this.tNombre = tNombre;
    }

    public T gettTelefono() {
        return tTelefono;
    }

    public void settTelefono(T tTelefono) {
        this.tTelefono = tTelefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "tNombre=" + tNombre + ", tTelefono=" + tTelefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.tNombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto<?> other = (Contacto<?>) obj;
        return Objects.equals(this.tNombre, other.tNombre);
    }
    
    
    
}
