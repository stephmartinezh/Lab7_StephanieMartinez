package lab7_stephaniemartinez;

public class Trafico extends Delitos {

    String nombre;
    double peso;

    public Trafico() {
        super();
    }

    public Trafico(String nombre, double peso, String descripcion, String lgm, String culpable, String fin) {
        super(descripcion, lgm, culpable, fin);
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Trafico: " + nombre + ", " + peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
