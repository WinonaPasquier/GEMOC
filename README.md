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
Pour definir quelle est la colonne qui doit etre en abscisse il suffit d'ajouter **, abs** apres le nom de la colonne. *On ne peut definir qu'une seule colonne avec l'attribut abs*  
Il est egalement possible de créer un filtre sur les données. On peut voir cela dans l'exemple 1. Dans cette exemple les données qui seront selectionnées seront les lignes où la colonne Origin correspond à US

**File :** le chemin d'acces au fichier CSV *Il faut bien respecter le format du fichier*
[exemples de fichiers](files/)

**graphName :** le nom de la page HTML que l'on va generer

**graphType :** le type de graphique *les differents type de graphiques sont trouvables dans le diagramme de classe dans EnumType*  
[class Diagram](pictures/classDiag.png)

## Structure BNF
```
<program> ::= <filter><file_loader><graph>
<filter> ::= 'Column :' <columnname> (','<abs>)? (<comparaison>)? (<elementComparaison>)?
<fileloader> ::= 'File :' <path>
<graph> ::= Graph {' 'graphName : '<graphname> 'graphType :' <graphtype> '}'
<columnname> ::= <chaine_de_caracteres>
<abs> ::= 'true' | 'false'
<comparaison> ::= '=' | '<' | '>'
<elementComparaison> ::= <value>
<path> ::= <nom_dossier>'/'<nom_fichier>'.'<extension>
<nom_dossier> ::= <chaine_de_caracteres>
<nom_fichier> ::= <chaine_de_caracteres>
<extension> ::= 'csv'
<graphname> ::= <chaine_de_caracteres>
<graphtype> ::= 'line'|'pie'|'doughnut'|'scatter'|'bubble'|'radar'|'polarArea'
```
`<program>` : represente l'ensemble du programme.  
`<filter>` : représente la colonne.  
`<fileloader>` : représente le fichier.  
`<graph>` : représente le graphique.  
`<columnname>` : représente le nom de la colonne à afficher, suivi d'un éventuel filtre.  
`<abs>` : représente si la colonne est en abscisse.  
`<comparaison>` : représente l'opérateur de comparaison.  
`<elementComparaison>` : représente la valeur de comparaison.  
`<path>` : représente le chemin d'accès complet au fichier csv à utiliser.  
`<nom_dossier>` : représente le nom du dossier contenant le fichier.  
`<nom_fichier>` : représente le nom du fichier de données.  
`<extension>` : représente l'extension du fichier de données.  
`<graphname>` : représente le nom de la page.  
`<graphtype>` : représente le type de graphique à générer.  
[le fichier myDsl.xtext](l3IAProjectHTML/src/l3IAProjectHTML/MyDsl.xtext)

## Explication code :

Pour pouvoir generer notre fichier HTML on va recuperer toutes les données fournis par l'utilisateur.  
Ensuite on va recuperer toutes les données de notre fichier csv.  
Puis on va selectionner uniquement les données que l'on souhaite utiliser pour créer notre graphique. Ces données vont etre ajouter dans notre fichier JSON. C'est dans ce JSON où il y a toutes les données a afficher.  
[le fichier myDslGenerator.xtend](l3IAProjectHTML/src/l3IAProjectHTML/generator/MyDslGenerator.xtend)
