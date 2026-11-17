package abstract_factory.modifie.exemple2;

public class FactoryElectrique implements AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileElectrique();
    }

    public Scooter ConstruireScooter() {
        return new ScooterElectrique();
    }

    public Camion ConstruireCamion() {
        return new CamionElectrique();
    }
}
