package lab7_stephaniemartinez;

public class Asesinato extends Delitos {

    String arma;
    int victimas;

    public Asesinato() {
        super();
    }

    public Asesinato(String arma, int victimas, String descripcion, String lgm, String culpable, String fin) {
        super(descripcion, lgm, culpable, fin);
        this.arma = arma;
        this.victimas = victimas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVictimas() {
        return victimas;
    }

    @Override
    public String toString() {
        return "Asesinato: " + arma + " ," + victimas ;
    }

   
    
    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

}
