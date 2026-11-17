package abstract_factory.cours.exemple2;

public class FactoryElectrique implements AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileElectrique();
    }

    public Scooter ConstruireScooter() {
        return new ScooterElectrique();
    }
}
