# Test Maison


Pour installer le projet :

*   il faut entrer dans le répertoire du projet  «  TestMaisonAdneom »
*   Lancer la commande maven : mvn compile : pour compiler le code de l’application et voir s’il y a des erreurs.
*   Lancer la commande maven : mvn install : pour installer les dépendances maven et pour lancer les Tests aussi.


Pour générer la JAR :


Lancer la commande maven : mvn package : pour générer la JAR dans le target du projet 




Pour utiliser la JAR :


*   soit ajouter manuellement le jar dans le build path des autres projets.
*   soit ajouter la Jar à la Repository Central de maven et Pour l’utiliser , et ajouter à chaque projet la dépendance suivante: 
             <dependency>
                      <groupId>com.adneom</groupId>
                      <artifactId>TestMaisonAdneom</artifactId>
                <version>0.0.1-SNAPSHOT</version>
             <dependency>





