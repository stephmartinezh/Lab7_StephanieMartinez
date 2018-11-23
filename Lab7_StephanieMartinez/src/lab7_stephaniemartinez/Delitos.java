
package lab7_stephaniemartinez;


public class Delitos {
    String descripcion;
    String lgm;
    boolean culpable;

    public Delitos() {
    }

    public Delitos(String descripcion, String lgm, boolean culpable) {
        this.descripcion = descripcion;
        this.lgm = lgm;
        this.culpable = culpable;
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

    public boolean isCulpable() {
        return culpable;
    }

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }

    @Override
    public String toString() {
        return "Delitos{" + "descripcion=" + descripcion + ", lgm=" + lgm + ", culpable=" + culpable + '}';
    }
    
}
