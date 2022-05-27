package PracticaP1.FactoryMethod;

public class Cuadernos {
    private String tipo;

    private int numeroHojasl;

    public Cuadernos(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojasl() {
        return numeroHojasl;
    }

    public void setNumeroHojasl(int numeroHojasl) {
        this.numeroHojasl = numeroHojasl;
    }
}