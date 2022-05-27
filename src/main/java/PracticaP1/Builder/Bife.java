package PracticaP1.Builder;

public class Bife extends BuilderPlato{
    @Override
    public void buildTipoCarne() {
        this.plato.setTipoCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Papas fritas");
    }
}