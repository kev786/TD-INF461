# Patron Factory Method (méthode de création avec paramètre)

## Principe

Une seule classe `FabriqueProduit` regroupe toutes les créations. Le client lui donne un type
(`"A"`, `"B"`, `"C"`...) et elle renvoie le bon produit, toujours sous le type abstrait `Produit`.
Le client n'utilise donc jamais `new ProduitA()` lui-même.

## Contenu

| Dossier | Description |
|---------|-------------|
| `src/cours/` | Exemple du cours : `Produit`, `ProduitA/B/C`, `FabriqueProduit`, `Client` |
| `src/modifie/` | Exemple modifié : ajout de `ProduitD` et du `case "D"` dans `FabriqueProduit` |

## Ce qui change entre l'exemple du cours et l'exemple modifié

- Nouvelle classe `ProduitD` (hérite de `Produit`)
- Dans `FabriqueProduit` : nouveau `case "D"` dans le `switch`
- Dans `Client` : appel de `createProduit("D")`

## Compiler et exécuter

```bash
javac -d out/cours src/cours/*.java
java -cp out/cours cours.Client

javac -d out/modifie src/modifie/*.java
java -cp out/modifie modifie.Client
```

La dernière ligne du `Client` demande un type inexistant pour montrer que la fabrique lève une
`IllegalArgumentException`. L'exception affichée en fin d'exécution est donc normale.