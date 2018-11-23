package lab7_stephaniemartinez;

public class Secuestro extends Delitos {

    int tiempo;
    int edad;

    public Secuestro() {
        super();
    }

    public Secuestro(int tiempo, int edad, String descripcion, String lgm, boolean culpable) {
        super(descripcion, lgm, culpable);
        this.tiempo = tiempo;
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Secuestro{" + "tiempo=" + tiempo + ", edad=" + edad + '}';
    }

}
