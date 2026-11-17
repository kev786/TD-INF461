package abstract_factory.cours.exemple2;

public class FactoryEssence implements AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileEssence();
    }

    public Scooter ConstruireScooter() {
        return new ScooterEssence();
    }
}
