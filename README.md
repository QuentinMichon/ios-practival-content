# Java IOs - Practical content template

This repository contains the template to the
[Java IOs](https://github.com/heig-vd-dai-course/heig-vd-dai-course/tree/main/05-java-ios)
practical content.

## Questions

#### Which type of stream is the most efficient for each use case?

dans chaque cas que ce soit Input ou Output, la méthode avec Buffer est soit équivalente pour les petites taille de fichier soit plus rapide pour les grand fichiers


#### Why is it more efficient than the other types of streams? 

Car il effectue moins d'appel system. Ce qui prend du temps.

#### What is the difference between binary data and text data?

D'un point de vue stockage, il n'y a aucune différence. 
La différence se fait lors de l'interprétation de ces données. 
Pour une data binaire il faut par exemple le traduire en utilisant 
un système d'encodage (ASCII, UTF-8, ...) 

#### What is a character encoding?

C'est une table de correspondance entre des Bytes et, dans nôtre cas
, un caractère d'écriture. 

#### Why is this benchmark methodology important?

Afin d'être sûr que l'architecture choisie soit bien la plus efficace.
