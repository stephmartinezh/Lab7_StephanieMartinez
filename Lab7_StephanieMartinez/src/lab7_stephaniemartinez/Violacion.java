package lab7_stephaniemartinez;

public class Violacion extends Delitos {

    int edad;

    public Violacion() {
        super();
    }

    public Violacion(int edad, String descripcion, String lgm, String culpable, String fin) {
        super(descripcion, lgm, culpable, fin);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Violacion: " +edad ;
    }

}
