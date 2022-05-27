package PracticaP1.Singleton;
public class Client {
    public static void main(String [] args){

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero ventanillaCol = new Cajero(new Person("ALE "),567);
                System.out.println("Saldo inicial: " + SaldoManager.getInstance().getSaldo());
                System.out.print("Estudiante " + ventanillaCol.getPerson().getName() + " realizo pago: ");
                ventanillaCol.pagarCuota(150);
                ventanillaCol.darSaldo();
                ventanillaCol.setPerson(new Person("DANY"));
                System.out.print("Estudiante " + ventanillaCol.getPerson().getName() + " realizo pago: ");
                ventanillaCol.pagarCuota(250);
                ventanillaCol.darSaldo();
                ventanillaCol.setPerson(new Person("DIEGO"));
                System.out.print("Estudiante " + ventanillaCol.getPerson().getName() + " realizo pago: ");
                ventanillaCol.pagarCuota(400);
                ventanillaCol.darSaldo();
                ventanillaCol.setPerson(new Person("RAFA"));
                System.out.print("Estudiante " + ventanillaCol.getPerson().getName() + " realizo pago: ");
                ventanillaCol.pagarCuota(150);
                ventanillaCol.darSaldo();
                ventanillaCol.setPerson(new Person("ENZO"));
                System.out.print("Estudiante " + ventanillaCol.getPerson().getName() + " realizo pago: ");
                ventanillaCol.pagarCuota(25);
                ventanillaCol.darSaldo();
            }
        });


        hilo1.start();

    }
}