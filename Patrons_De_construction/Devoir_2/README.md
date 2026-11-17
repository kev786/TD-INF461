# Devoir 2 : Patron Abstract Factory

INF461 : Principes et processus du logiciel.

Ce devoir porte sur le patron **Abstract Factory** (fabrique abstraite). Deux exemples vus en cours sont étudiés, chacun décliné dans une version modifiée où l'on ajoute une **troisième famille de produits**. La fabrique fournit un ensemble de produits cohérents (une « famille ») sans que le client connaisse les classes concrètes.

## Structure

| Dossier | Exemple | Familles du cours | Ajout dans la version modifiée |
|---------|---------|-------------------|--------------------------------|
| [abstract-factory/cours/exemple1](./abstract-factory/cours/exemple1) | Produits A et B | `ProduitA1/A2`, `ProduitB1/B2`, fabriques `ProduitFactory1/2`, interface `IProduitFactory` | Famille C : `ProduitC`, `ProduitC1`, `ProduitC2` |
| [abstract-factory/cours/exemple2](./abstract-factory/cours/exemple2) | Véhicules essence / électrique | `Automobile`, `Scooter` et leurs variantes, `FactoryEssence`, `FactoryElectrique`, interface `AbstractFactory` | `Camion`, `CamionEssence`, `CamionElectrique` |

Chaque exemple contient :
- `cours/` : l'exemple vu en cours (deux familles de produits) ;
- `modifie/` : l'exemple modifié (ajout de la troisième famille).

Dans les deux exemples, l'ajout se fait en complétant **l'interface de la fabrique**, les **deux fabriques concrètes** et le **Client**. Les classes de produits déjà présentes restent inchangées.

## Compiler et exécuter

Depuis le dossier `abstract-factory` :

```bash
cd abstract-factory

javac -d out/cours/exemple1 cours/exemple1/*.java
java -cp out/cours/exemple1 abstract_factory.cours.exemple1.Client

javac -d out/modifie/exemple1 modifie/exemple1/*.java
java -cp out/modifie/exemple1 abstract_factory.modifie.exemple1.Client

javac -d out/cours/exemple2 cours/exemple2/*.java
java -cp out/cours/exemple2 abstract_factory.cours.exemple2.Client

javac -d out/modifie/exemple2 modifie/exemple2/*.java
java -cp out/modifie/exemple2 abstract_factory.modifie.exemple2.Client
```

**Attention :** le dossier s'appelle `abstract-factory` (avec un tiret) mais les paquetages Java s'appellent `abstract_factory` (avec un tiret bas) : c'est bien `abstract_factory.cours.exemple1.Client` qu'il faut passer à `java`.

## Rapport

Les diagrammes de classes (version cours et version modifiée de chaque exemple) se trouvent dans [`abstract-factory/rapport/digrammes/`](./abstract-factory/rapport/digrammes). Le rapport PDF (diagrammes, code et analyse) est remis séparément sur le Drive du cours.
