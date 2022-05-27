package PracticaP1.FactoryMethod;

public class KitDeColegio implements IKit{
    private Mochila mochila;

    private Libros libros;

    private Computadora computadora;

    public KitDeColegio(Mochila mochila, Libros libros, Computadora computadora){
        this.mochila = mochila;
        this.libros = libros;
        this. computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("KIT DE COLEGIO");

        System.out.println("La mochila tiene " + mochila.getNumeroBolsillos() +
                " bolsillos y es de un tamanioo de " + mochila.getTamano() +" cm");

        System.out.println("Los libros son de " + libros.getAutor() +
                ", y es de tipo " + libros.getTipo());

        System.out.println("La computadora es marca " + computadora.getMarca() +
                " con S.O" + computadora.getOs());
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}