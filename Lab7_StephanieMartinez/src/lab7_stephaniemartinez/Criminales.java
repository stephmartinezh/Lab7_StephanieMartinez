
package lab7_stephaniemartinez;

import java.util.ArrayList;


public class Criminales {
    String nombre;
    int edad;
    String numeroIdentidad;
    int celda;
    ArrayList<Delitos> delitos = new ArrayList();
    int anios;

    public Criminales() {
    }

    public Criminales(String nombre, int edad, String numeroIdentidad, int celda, int anios) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentidad = numeroIdentidad;
        this.celda = celda;
        this.anios = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    public ArrayList<Delitos> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delitos> delitos) {
        this.delitos = delitos;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "Criminales{" + "nombre=" + nombre + ", edad=" + edad + ", numeroIdentidad=" + numeroIdentidad + ", celda=" + celda + ", delitos=" + delitos + ", anios=" + anios + '}';
    }
    
    
}
