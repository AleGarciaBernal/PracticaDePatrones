package PracticaP1.Prototype;

public class Contract implements IContract{
    private int sueldo ;
    private int cargaHoraria ;
    private boolean cursoSuperior ;
    private boolean accesoPlataforma ;
    private boolean marcaoBiometrico ;
    private String horaEntrada ;
    private String horaSalida ;
    private String nombre;
    private String apellido;


    public Contract(){}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(boolean cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcaoBiometrico() {
        return marcaoBiometrico;
    }

    public void setMarcaoBiometrico(boolean marcaoBiometrico) {
        this.marcaoBiometrico = marcaoBiometrico;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public Object clone(){

        Contract clone = new Contract();
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoSuperior(this.isCursoSuperior());
        clone.setSueldo(this.getSueldo());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setAccesoPlataforma(this.isMarcaoBiometrico());
        clone.setHoraEntrada(this.getHoraEntrada());
        clone.setHoraSalida(this.getHoraSalida());
        clone.setNombre(this.getNombre());
        clone.setApellido(this.getApellido());

        return clone;
    }

    public void showInfo(){
        System.out.println(" \n ****  Contrato De Docente *** \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("El sueldo es: " + sueldo);
        System.out.println("La carga Horaria es de: " + cargaHoraria);
        System.out.println("Cuenta con curso superior? " + cursoSuperior);
        System.out.println("Tiene acceso a la plataforma? " + accesoPlataforma);
        System.out.println("Tiene marcado biometrico? " + marcaoBiometrico);
        System.out.println("Hora de entrada es: " + horaEntrada);
        System.out.println("Hora de salida es: " + horaSalida);

    }
}