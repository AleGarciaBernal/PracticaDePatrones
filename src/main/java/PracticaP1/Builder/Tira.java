package PracticaP1.Builder;

public class Tira extends BuilderPlato{
    @Override
    public void buildTipoCarne() {
        this.plato.setTipoCarne("Tira de Carne");
    }

    @Override
    public void buildSaborRefresco() {
        this.plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Fideo");
    }
}