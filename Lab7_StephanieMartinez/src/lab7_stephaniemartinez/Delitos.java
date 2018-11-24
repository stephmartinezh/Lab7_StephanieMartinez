package lab7_stephaniemartinez;

public class Delitos {

    String descripcion;
    String lgm;
    String culpable;
    String fin;

    public Delitos() {
        
    }

    public Delitos(String descripcion, String lgm, String culpable, String fin) {
        this.descripcion = descripcion;
        this.lgm = lgm;
        this.culpable = culpable;
        this.fin = fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLgm() {
        return lgm;
    }

    public void setLgm(String lgm) {
        this.lgm = lgm;
    }

    public String isCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return descripcion + ", " + lgm + ", " + culpable;
    }

}
