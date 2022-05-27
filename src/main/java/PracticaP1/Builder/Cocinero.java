package PracticaP1.Builder;

public class Cocinero {

    private BuilderPlato builder;

    public Plato getPlatoCocinado(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderPlato builder){
        this.builder = builder;
    }

    public void cocinarPlato(){
        this.builder.createPlato();
        this.builder.buildTipoCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}