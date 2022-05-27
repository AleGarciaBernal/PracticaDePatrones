package PracticaP1.Interpreter;

public class Client {
    public static void main (String[]args) {
        String msg = "Como programador Quiero ganar dinero Para comprar pizzas";

        Interpreter parser = new Interpreter(msg);

        System.out.println("msg interpretado: " + parser.evaluateMsg());
    }
}