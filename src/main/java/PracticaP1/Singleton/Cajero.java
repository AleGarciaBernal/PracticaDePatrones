package PracticaP1.Singleton;

public class Cajero {
    private int codigo;
    private Person person;

    public Cajero(Person person,int codigo){
        this.person=person;
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void pagarCuota(int cantidad){
        SaldoManager.getInstance().pagoCuota(cantidad);
    }

    public void darSaldo(){
        SaldoManager.getInstance().consultarSaldo();
    }


}