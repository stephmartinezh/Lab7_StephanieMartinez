package lab7_stephaniemartinez;

public class Robo extends Delitos {

    String nombre;
    int valor;

    public Robo() {
        super();
    }

    public Robo(String nombre, int valor, String descripcion, String lgm, String culpable, String fin) {
        super(descripcion, lgm, culpable, fin);
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Robo: " + nombre + ", " + valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
