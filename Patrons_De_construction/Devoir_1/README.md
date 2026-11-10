# Devoir 1 : Patrons de construction

INF461 : Principes et processus du logiciel. Date de remise : 11/11/2026.

Ce devoir porte sur le patron **Factory**, étudié dans ses deux variantes vues en cours.
Pour chaque variante, le dossier contient l'exemple du cours et un exemple modifié
dans lequel on ajoute un **produit D**.

## Structure

| Dossier | Patron | Idée |
|---------|--------|------|
| [factory-method](./factory-method) | Factory Method | Une seule fabrique, dont la méthode `createProduit(String type)` choisit le produit avec un `switch` |
| [factory](./factory) | Factory | Une fabrique abstraite `ProduitFactory` et une fabrique concrète par produit |

Chaque dossier contient :
- `src/cours/` : l'exemple vu en cours (produits A, B, C)
- `src/modifie/` : l'exemple modifié (ajout du produit D)

## Compiler et exécuter

Depuis le dossier du patron choisi (par exemple `factory-method`) :

```bash
javac -d out/cours src/cours/*.java
java -cp out/cours cours.Client

javac -d out/modifie src/modifie/*.java
java -cp out/modifie modifie.Client
```

## Rapport

Le rapport PDF (diagrammes de classes, code et analyse) est remis séparément sur le Drive du cours.