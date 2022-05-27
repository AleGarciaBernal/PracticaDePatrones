package PracticaP1.FactoryMethod;

public class CreatorKitEscolar extends Creator{

    @Override
    public KitEscolar createProduct() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(10);
        mochila.setTamano(25);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("celeste");
        deportivo.setNumeroPrendas(6);
        deportivo.setTalla("XL");

        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setNumeroHojasl(100);
        cuadernos.setTipo("TAPA DURA");

        KitEscolar kitEscolar = new KitEscolar(cuadernos, deportivo, mochila);
        return kitEscolar;
    }
}