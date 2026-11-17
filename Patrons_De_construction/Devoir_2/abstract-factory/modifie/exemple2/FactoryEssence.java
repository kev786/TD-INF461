package abstract_factory.modifie.exemple2;

public class FactoryEssence implements AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileEssence();
    }

    public Scooter ConstruireScooter() {
        return new ScooterEssence();
    }

    public Camion ConstruireCamion() {
        return new CamionEssence();
    }
}
