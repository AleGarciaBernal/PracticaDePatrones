package PracticaP1.Builder;

public class Client {
    public static void main(String[] args) {
        Cocinero jose = new Cocinero();
        BuilderPlato pB = new Bife();
        BuilderPlato pL = new Lomo();
        BuilderPlato pT = new Tira();

        jose.setBuilder(pB);
        jose.cocinarPlato();
        Plato plato1 = jose.getPlatoCocinado();
        System.out.println("BIFE");
        plato1.showInfo();

        jose.setBuilder(pL);
        jose.cocinarPlato();
        Plato plato2 = jose.getPlatoCocinado();
        System.out.println("LOMO");
        plato2.showInfo();

        jose.setBuilder(pT);
        jose.cocinarPlato();
        Plato plato3 = jose.getPlatoCocinado();
        System.out.println("TIRA");
        plato3.showInfo();
    }
}