# Application de Recettes de Pizza 🍕

## Description  

Cette application mobile Android permet de présenter différentes recettes de pizza.

## Architecture de l'Application  

Pour structurer le développement de l'application, nous avons adopté une architecture basée sur plusieurs couches :  

- **Adapter** : La classe `ProduitAdapter` se trouve dans le package `adapter` et joue le rôle d'interface entre les données (produits) et la `ListView`. Elle génère une  

`ListView` composée de plusieurs items représentant les produits (recettes de pizza).  

- **Services** : La classe `ProduitServices` fournit les méthodes nécessaires pour manipuler la liste des produits, telles que :
  
  - `create` : Ajouter une nouvelle recette.
    
  - `update` : Mettre à jour une recette existante.
    
  - `delete` : Supprimer une recette.
    
  - `findAll` : Récupérer toutes les recettes.
    
  - `getItem` : Obtenir les détails d'une recette spécifique.
    
- **DAO** : La classe `ProduitServices` implémente l'interface générique `IDao` située dans le package `dao`, garantissant des méthodes standardisées pour les opérations CRUD.

## Fonctionnalités  

- **ProgressBar et Animation de Loading** :
  
  Dans notre vue principale, nous avons intégré un composant `ProgressBar` pour indiquer le chargement. Dans le `MainActivity`, nous avons ajouté un code permettant  

d'afficher une animation de chargement pour une courte durée, offrant ainsi une transition élégante entre les deux activités.

- **Liste des Recettes de Pizza** :
  
  - `ListPizzaActivity` affiche une liste de recettes de pizza sous forme de `ListView` grâce à `ProduitAdapter`.
    
  - Un `setOnItemClickListener` est implémenté pour permettre à l'utilisateur de cliquer sur une recette. Lorsqu'un item est sélectionné, la méthode `onClick` transporte les
    
     détails de la recette vers `DescriptionPizzaActivity` pour afficher les informations complètes.

- **Gestion des Ressources** :
  
  - **Images et Icônes** : Stockées dans le dossier `res/drawable` pour une gestion centralisée des visuels.
    
  - **Polices** : Les polices personnalisées sont placées dans `res/font`, offrant ainsi une typographie adaptée à l'application.
    
  - **Menus** : Les éléments de menu sont définis dans `res/menu` pour une meilleure gestion de la navigation et des options de l'application.

En structurant les ressources de cette manière, nous facilitons leur gestion et leur accessibilité, ce qui rend le développement de l'application plus organisé et maintenable.

## Installation  

1. Clonez le dépôt :
   
   ```bash
   git clone https://github.com/Ballouk12/PizzaApp.git
   
3. Ouvrez le projet dans Android Studio.
   
4. Synchronisez les dépendances avec Gradle.
   
5. Lancez l'application sur un émulateur ou un appareil physique.
   
## Technologies Utilisées  

- Langage : Java
  
- IDE : Android Studio
  
- Architecture : Architecture en couches (Adapter, Services, DAO)
  
- Composants Android pricipale : ListView, ProgressBar, Intent, etc.

## Captures d'Écran 
<img width="186" alt="firstPageimage" src="https://github.com/user-attachments/assets/f34d1835-af2b-4572-a0dc-ecef9fab6be9">  

<img width="188" alt="secondPageImage" src="https://github.com/user-attachments/assets/faff8f84-2515-4c76-95e7-1d5565790847">  

<img width="319" alt="descriptionPage" src="https://github.com/user-attachments/assets/d421d830-be5c-4338-ac8d-11a0324c1540">

  
