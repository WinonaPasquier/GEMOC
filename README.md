# GEMOC Project

## Exemple de syntaxe

Avant de commencer il faut que l'extension du fichier soit sous la forme **myFile.projectHTML** pour pouvoir générer le fichier HTML.

Pour générer notre fichier HTML il suffit de suivre la syntaxe suivante :



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
*Cette syntaxe permet de générer le graphique du scenario1*  
[Code HTML](resources/generatedFile/scenario1.html)  
[Graphique](resources/pictures/scenario1.png)
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
*Cette syntaxe permet de générer le graphique du scenario2*  
[Code HTML](resources/generatedFile/scenario2.html)  
[Graphique](resources/pictures/scenario2.png)

## Explication de la syntaxe

**Column :** le nom de la colonne. *Il faut que les noms des colonnes soient identiques aux noms dans le fichier CSV. Attention il ne faut pas que la colonne est un nom avec des espaces.*  
Pour définir quelle est la colonne qui doit être en abscisse il suffit d'ajouter **, abs** apres le nom de la colonne. *On ne peut définir qu'une seule colonne avec l'attribut abs*  
Il est également possible de créer un filtre sur les données. On peut voir cela dans l'exemple 1. Dans cet exemple les données qui seront sélectionnées seront les lignes où la colonne Origin correspond à US

**File :** le chemin d'accès au fichier CSV *Il faut bien respecter le format du fichier*
[exemples de fichiers](resources/csvFile/)

**graphName :** le nom de la page HTML que l'on va générer

**graphType :** le type de graphique *les différents types de graphiques sont trouvables dans le diagramme de classes dans EnumType*  
[class Diagram](resources/pictures/classDiag.png)

## Structure BNF
```
<program> ::= <filter><file_loader><graph>
<filter> ::= 'Column :' <columnname> (','<abs>)? (<comparaison>)? (<elementComparaison>)?
<fileloader> ::= 'File :' <path>
<graph> ::= Graph {' 'graphName : '<graphname> 'graphType :' <graphtype> '}'
<columnname> ::= <chaine_de_caracteres>
<abs> ::= 'true' | 'false'
<comparaison> ::= '=' | '<' | '>' | '>=' | '<=' | '!='
<elementComparaison> ::= <value>
<path> ::= <nom_dossier>'/'<nom_fichier>'.'<extension>
<nom_dossier> ::= <chaine_de_caracteres>
<nom_fichier> ::= <chaine_de_caracteres>
<extension> ::= 'csv'
<graphname> ::= <chaine_de_caracteres>
<graphtype> ::= 'line'|'pie'|'doughnut'|'scatter'|'bubble'|'radar'|'polarArea'
```
`<program>` : Représente l'ensemble du programme.  
`<filter>` : Représente la colonne.  
`<fileloader>` : Représente le fichier.  
`<graph>` : Représente le graphique.  
`<columnname>` : Représente le nom de la colonne à afficher, suivi d'un éventuel filtre.  
`<abs>` : Représente si la colonne est en abscisse.  
`<comparaison>` : Représente l'opérateur de comparaison.  
`<elementComparaison>` : Représente la valeur de comparaison.  
`<path>` : représente le chemin d'accès complet au fichier CSV à utiliser.  
`<nom_dossier>` : Représente le nom du dossier contenant le fichier.  
`<nom_fichier>` : Représente le nom du fichier de données.  
`<extension>` : Représente l'extension du fichier de données.  
`<graphname>` : Représente le nom de la page.  
`<graphtype>` : Représente le type de graphique à générer.  
[le fichier myDsl.xtext](l3IAProjectHTML/src/l3IAProjectHTML/MyDsl.xtext)

## Explication du code

Pour pouvoir générer notre fichier HTML on va récupérer toutes les données fournies par l'utilisateur.  
Ensuite on va récupérer toutes les données de notre fichier CSV.  
Puis on va sélectionner uniquement les données que l'on souhaite utiliser pour créer notre graphique. Ces données vont être ajouté dans notre fichier JSON. Les clés dans le fichier JSON auront le même noms que la colonne sélectionnée du fichier CSV. Par exemple dans l'exemple 1 on aura un fichier JSON sous la forme : 
```
{Horsepower:130.0,Car:"Chevrolet Chevelle Malibu"},
{Horsepower:165.0,Car:"Buick Skylark 320"},
{Horsepower:150.0,Car:"Plymouth Satellite"}
```
C'est donc dans ce fichier JSON qu'il y aura l'ensemble des données à afficher.

[le fichier myDslGenerator.xtend](l3IAProjectHTML/src/l3IAProjectHTML/generator/MyDslGenerator.xtend)
