# LAB-6-Pizza Recipes Android App

 Pizza Recipes – Application Android
 
# Objectif :

Application Android simple permettant d’afficher une liste de pizzas et de consulter les détails de chaque pizza. Le projet est réalisé en Java avec Android Studio dans un cadre pédagogique.

 # Étape 1 — Structure du projet

Organisation du projet en plusieurs packages pour bien séparer les rôles :

ui : écrans de l’application

adapter : affichage de la liste

classes : modèle de données

service : gestion des données

📸 Capture : structure du projet

🧩 Étape 2 — Écran Splash

Un écran de démarrage affichant le logo de l’application.

Layout simple

Image centrée

📄 Fichier : activity_splash.xml 📸 Capture : splash.png

🍕 Étape 3 — Classe Produit

Classe modèle représentant une pizza.

Contient :

nom

prix

durée

image

ingrédients

description

étapes

📄 Fichier : Produit.java

🗂️ Étape 4 — Service ProduitService

Service qui simule une base de données en mémoire.

Utilisation du Singleton

Liste de pizzas

Méthode seed() pour ajouter les pizzas

📄 Fichier : ProduitService.java 📸 Capture : produit_service.png

📋 Étape 5 — Liste des pizzas

Affichage de toutes les pizzas dans une ListView.

Utilisation d’un BaseAdapter

Chaque pizza est affichée dans une CardView

📄 Fichiers :

PizzaAdapter.java

row_pizza.xml

📸 Capture : list_pizza.png

🔍 Étape 6 — Détail d’une pizza

Affichage des informations complètes d’une pizza sélectionnée.

Image

Nom

Prix et durée

Ingrédients

Description

Étapes

📄 Fichiers :

PizzaDetailActivity.java

activity_pizza_detail.xml

📸 Capture : detail_pizza.png

🔗 Étape 7 — Navigation

Splash → Liste des pizzas

Clic sur une pizza → Détail

Passage de l’ID via Intent

🛠️ Technologies utilisées

Java

Android Studio

XML

ListView

CardView

🚀 Exécution du projet

Ouvrir le projet dans Android Studio

Synchroniser Gradle

Lancer sur émulateur ou téléphone

📸 Dossier des captures

Créer un dossier screenshots/ à la racine du projet et ajouter :

splash.png

list_pizza.png

detail_pizza.png

produit_service.png
