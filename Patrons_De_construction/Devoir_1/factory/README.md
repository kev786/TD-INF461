# Patron Factory (fabrique abstraite et fabriques concrètes)

## Principe

La classe abstraite `ProduitFactory` contient `getProduit()` et la méthode abstraite
`createProduit()`. Chaque fabrique concrète (`ProduitFactoryA`, `B`, `C`) redéfinit
`createProduit()` pour créer son produit. Le choix du produit se fait en choisissant la fabrique.

## Contenu

| Dossier | Description |
|---------|-------------|
| `src/cours/` | Exemple du cours : `Produit`, `ProduitA/B/C`, `ProduitFactory`, `ProduitFactoryA/B/C`, `Client` |
| `src/modifie/` | Exemple modifié : ajout de `ProduitD` et de `ProduitFactoryD` |

## Ce qui change entre l'exemple du cours et l'exemple modifié

- Nouvelle classe `ProduitD` (hérite de `Produit`)
- Nouvelle classe `ProduitFactoryD` (hérite de `ProduitFactory`)
- Dans `Client` : utilisation de `ProduitFactoryD`
- Aucune classe existante de la hiérarchie n'est modifiée

## Compiler et exécuter

```bash
javac -d out/cours src/cours/*.java
java -cp out/cours cours.Client

javac -d out/modifie src/modifie/*.java
java -cp out/modifie modifie.Client
```