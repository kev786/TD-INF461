package modifie;

public class Client {
    public static void main(String[] args) {
        System.out.println("........Methode 2 : Abstract Factory........");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        ProduitFactory produitfactoryD = new ProduitFactoryD(); // AJOUT DE LA FABRIQUE D  
        Produit produit = null;

        //affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();

        //affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();

        //affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();

        //affiche un produit de type D
        produit = produitfactoryD.getProduit(); // AJOUT DU PRODUIT D
        produit.methodeproduit();
        
        
    }
}
