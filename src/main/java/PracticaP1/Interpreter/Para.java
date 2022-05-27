package PracticaP1.Interpreter;

public class Para extends Descripcion{
    public Para(int largoPalabra) {
        this.largoPalabra= largoPalabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Para")){
            context.output= context.output+"Then ";
            context.input= context.input.substring(largoPalabra);
        }
    }
}