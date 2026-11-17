package abstract_factory.cours.exemple1;

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
