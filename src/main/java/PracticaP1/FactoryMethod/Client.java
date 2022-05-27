package PracticaP1.FactoryMethod;

public class Client {
    public static void main (String []args){
        KitEscolar kit1 = new CreatorKitEscolar().createProduct();
        kit1.showInfo();

        KitDeColegio kit2 = new CreatorKitDeColegio().createProduct();
        kit2.showInfo();
    }
}