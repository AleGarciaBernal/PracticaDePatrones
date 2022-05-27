package PracticaP1.Builder;

public abstract class BuilderPlato {
    protected Plato plato;

    public Plato getProduct() {
        return plato;
    }

    public void createPlato() {
        this.plato = new Plato();
    }

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}