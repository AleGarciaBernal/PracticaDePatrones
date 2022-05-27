package PracticaP1.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Descripcion{

    private List<Descripcion> grammar = new ArrayList<>();

    private Context context;

    public Interpreter(String msgToInterpreter){
        context = new Context(msgToInterpreter);
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new Como(charOriginal.length()));
                    break;
                case "Quiero":
                    grammar.add(new Quiero(charOriginal.length()));
                    break;
                case "Para":
                    grammar.add(new Para(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Espacio(charOriginal.length()));
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (Descripcion expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}