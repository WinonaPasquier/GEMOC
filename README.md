# GEMOC Project

## Exemple de synthaxe

Avant de commencer il faut que l'extension du fichier soient sous la forme **myFile.projetHTML** pour pouvoir générer le fichier HTML.

Pour generer notre fichier HTML il suffit de suivre la synthaxe suivante :



### Exemple 1
```
Column : 'Horsepower'
Column : 'Car' ,abs
Column : 'Origin' = 'US'

File : "C:/Users/winon/Documents/L3IA/S2/Langage_Et_Compilation/Projet/cars.csv"
Graph {
	graphName : 'scenario1'
	graphType : bar
	}
  ```
*Cet synthaxe permet de generer le graphique du scenario1*  
[Code HTML](scenario1.html)  
[Graphique](pictures/scenario1.png)
### Exemple 2
```
Column : 'Country',abs
Column : 'Population'
Column : 'Telephones'

File : "C:/Users/winon/Documents/L3IA/S2/Langage_Et_Compilation/Projet/factbook.csv"
Graph {
	graphName : 'scenario2'
	graphType : line
	}
```
*Cet synthaxe permet de generer le graphique du scenario2*  
[Code HTML](scenario2.html)  
[Graphique](pictures/scenario2.png)

## Explication de la synthaxe

**Column :** le nom de la colonne *il faut que le nom des colonnes soient identique au nom dans le fichier csv. Attention il ne faut pas que la colonne est un nom avec des espaces.*  
Pour definir quelle est la colonne qui doit etre en abscisse il suffit d'ajouter **, abs** apres le nom de la colonne.  
Il est egalement possible de créer un filtre sur les données. On peut voir cela dans l'exemple 1. Dans cette exemple les données qui seront selectionnées seront les lignes où la colonne Origin correspond à US

**File :** le chemin d'acces au fichier CSV *Il faut bien respecter le format du fichier*
[exemples de fichiers](files/)

**graphName :** le nom de la page HTML que l'on va generer

**graphType :** le type de graphique *les differents type de graphiques sont trouvables dans le diagramme de classe dans EnumType*  
[class Diagram](pictures/classDiag.png)
