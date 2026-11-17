package abstract_factory.modifie.exemple2;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryEssence = new FactoryEssence();
        AbstractFactory factoryElectrique = new FactoryElectrique();

        System.out.println("Famille Essence");
        factoryEssence.ConstruireAutomobile().methodeAutomobile();
        factoryEssence.ConstruireScooter().methodeScooter();
        factoryEssence.ConstruireCamion().methodeCamion();

        System.out.println("Famille Electrique");
        factoryElectrique.ConstruireAutomobile().methodeAutomobile();
        factoryElectrique.ConstruireScooter().methodeScooter();
        factoryElectrique.ConstruireCamion().methodeCamion();
    }
}
