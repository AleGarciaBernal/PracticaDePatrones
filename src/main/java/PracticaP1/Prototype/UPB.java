package PracticaP1.Prototype;

public class UPB {
    public static void main(String[]args){


        Contract contratoModelo = new Contract();
        contratoModelo.setSueldo(1500);
        contratoModelo.setCargaHoraria(40);
        contratoModelo.setCursoSuperior(true);
        contratoModelo.setAccesoPlataforma(true);
        contratoModelo.setMarcaoBiometrico(false);
        contratoModelo.setHoraEntrada("150:00");
        contratoModelo.setHoraSalida("18:45");

        Contract contrato1 = (Contract) contratoModelo.clone();
        contrato1.setNombre("ALE");
        contrato1.setApellido("GARCIA");

        Contract contrato2 = (Contract) contratoModelo.clone();
        contrato2.setNombre("DANY");
        contrato2.setApellido("GUZMAN");

        contrato1.showInfo();
        contrato2.showInfo();
    }
}