package abstract_factory.cours.exemple2;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();

        System.out.println("Famille Essence");
        factoryEssence.ConstruireAutomobile().methodeAutomobile();
        factoryEssence.ConstruireScooter().methodeScooter();

        System.out.println("Famille Electrique");
        factoryElectrique.ConstruireAutomobile().methodeAutomobile();
        factoryElectrique.ConstruireScooter().methodeScooter();
    }
}
