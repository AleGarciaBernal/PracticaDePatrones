package PracticaP1.Interpreter;

public class Como extends Descripcion{

    public Como(int largoPalabra) {
        this.largoPalabra= largoPalabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Como")){
            context.output= context.output+"Given ";
            context.input= context.input.substring(largoPalabra);
        }
    }
}