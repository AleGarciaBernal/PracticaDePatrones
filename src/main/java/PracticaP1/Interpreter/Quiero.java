package PracticaP1.Interpreter;

public class Quiero extends Descripcion{
    public Quiero(int largoPalabra) {
        this.largoPalabra= largoPalabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Quiero")){
            context.output= context.output+"When ";
            context.input= context.input.substring(largoPalabra);
        }
    }
}