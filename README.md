
# LAB 6 : Pizza Recipes Android App

 
# Objectif :

Application Android simple permettant d’afficher une liste de pizzas et de consulter les détails de chaque pizza. Le projet est réalisé en Java avec Android Studio dans un cadre pédagogique.

 # Étape 1 — Structure du projet

Organisation du projet en plusieurs packages pour bien séparer les rôles :

-ui : écrans de l’application
-adapter : affichage de la liste
-classes : modèle de données
-service : gestion des données

![](https://github.com/user-attachments/assets/0c9c6345-7f15-4ee2-9b9e-6d375d5843d1)

 # Étape 2 — Écran Splash

-Un écran de démarrage affichant le logo de l’application.
-Layout simple
-Image centrée

![](https://github.com/user-attachments/assets/bd445bb1-ba64-45ae-a5d7-a0b26d4f45ec)

 # Étape 3 — Classe Produit

-Classe modèle représentant une pizza qui contient :nom, prix, durée,image, ingrédients, description, étapes.

 # Étape 4 — Service ProduitService

-Service qui simule une base de données en mémoire.
-Utilisation du Singleton
-Liste de pizzas
-Méthode seed() pour ajouter les pizzas

 # Étape 5 — Liste des pizzas

-Affichage de toutes les pizzas dans une ListView.
-Utilisation d’un BaseAdapter
-Chaque pizza est affichée dans une CardView

![](https://github.com/user-attachments/assets/d6c3a978-2eef-4fd2-9a1d-94b7512d28b9)
 
 # Étape 6 — Détail d’une pizza

-Affichage des informations complètes d’une pizza sélectionnée : Image-Nom-Prix-durée-Ingrédients-Description-Étapes.

![](https://github.com/user-attachments/assets/320e8c24-a3c7-4607-8e7a-a9b32f3e2308)

![](https://github.com/user-attachments/assets/75e8d802-5a59-4523-be01-bc65fde911ee)


 # Étape 7 — Navigation

-Splash → Liste des pizzas
-Clic sur une pizza → Détail
-Passage de l’ID via Intent

 # Technologies utilisées

-Java
-Android Studio
-XML



