package PracticaP1.Singleton;


public class SaldoManager {
    private static SaldoManager manejoSaldo;
    private int saldo;

    private SaldoManager() {
        saldo = 0;
    }


    private synchronized static void multiThreadControl() {
        if (manejoSaldo == null)
            manejoSaldo = new SaldoManager();
    }


    public static SaldoManager getInstance() {
        if (manejoSaldo == null)
            multiThreadControl();
        return manejoSaldo;
    }

    public synchronized void pagoCuota(int cantidad) {
        saldo = saldo + cantidad;
        System.out.println(" de " + cantidad );
    }

    public synchronized void consultarSaldo() {
        System.out.println("Saldo Actual:" + saldo );
    }

    public int getSaldo() {
        return saldo;
    }
}