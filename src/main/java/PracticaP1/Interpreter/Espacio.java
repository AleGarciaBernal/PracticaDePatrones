package PracticaP1.Interpreter;

public class Espacio extends Descripcion{
    public Espacio(int largoPalabra) {
        this.largoPalabra= largoPalabra;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        context.output = context.output + context.input.substring(0, this.largoPalabra) + " ";
        context.input = context.input.substring(this.largoPalabra);

    }
}