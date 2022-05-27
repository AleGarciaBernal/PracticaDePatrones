package PracticaP1.FactoryMethod;

public class CreatorKitDeColegio extends Creator{
    @Override
    public KitDeColegio createProduct() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(8);
        mochila.setTamano(25);

        Libros libros = new Libros();
        libros.setAutor("Hegel");
        libros.setTipo("Novela Santillana");

        Computadora computadora = new Computadora();
        computadora.setMarca("DELL");
        computadora.setOs("Windows 10");

        KitDeColegio kitColegial = new KitDeColegio(mochila,libros,computadora);
        return kitColegial;
    }
}