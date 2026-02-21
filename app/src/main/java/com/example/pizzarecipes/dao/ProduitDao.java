package com.example.pizzarecipes.dao;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitDao implements IDao<Produit> {
    private List<Produit> produits;
    private static ProduitDao instance;

    private ProduitDao() {
        produits = new ArrayList<>();
        // Ajout des 10 pizzas demandées avec descriptions détaillées et prix en DIRHAMS (DH)
        produits.add(new Produit("Margherita", 45.0, R.mipmap.pizza1, "20 min", 
            "Tomate San Marzano, Mozzarella di Bufala, Basilic frais, Huile d'olive extra vierge", 
            "La véritable icône italienne. Simple, fraîche et élégante, elle représente les couleurs du drapeau italien avec sa tomate rouge, sa mozzarella blanche et son basilic vert.", 
            "1. Étalez la pâte finement.\n2. Étalez une fine couche de sauce tomate.\n3. Garnissez de morceaux de mozzarella.\n4. Enfournez à 250°C pendant 8-10 min.\n5. Ajoutez le basilic frais à la sortie."));

        produits.add(new Produit("Quatre Saisons", 65.0, R.mipmap.pizza2, "30 min", 
            "Champignons, Jambon blanc, Artichauts, Olives noires, Mozzarella", 
            "Un voyage gustatif à travers les saisons. Chaque quartier de cette pizza offre une saveur unique et authentique.", 
            "1. Divisez visuellement la pizza en 4 zones.\n2. Garnissez chaque zone avec un ingrédient différent.\n3. Ajoutez la mozzarella sur l'ensemble.\n4. Cuisez jusqu'à ce que les bords soient bien dorés."));

        produits.add(new Produit("Napolitaine", 55.0, R.mipmap.pizza3, "25 min", 
            "Anchois de Méditerranée, Câpres, Olives, Origan, Ail", 
            "Pour les amateurs de saveurs iodées et puissantes. Une recette ancestrale qui respire le sud de l'Italie.", 
            "1. Préparez une base tomate aillée.\n2. Disposez les anchois en étoile.\n3. Parsemez de câpres et d'olives.\n4. Saupoudrez généreusement d'origan avant cuisson."));

        produits.add(new Produit("Quatre Fromages", 75.0, R.mipmap.pizza4, "25 min", 
            "Mozzarella, Gorgonzola, Parmesan Reggiano, Chèvre affiné", 
            "Une alliance onctueuse et fondante. Le mélange parfait entre la douceur de la mozzarella et le caractère du gorgonzola.", 
            "1. Préparez un mélange équilibré des 4 fromages.\n2. Répartissez sur une base de crème ou de tomate selon votre envie.\n3. Surveillez la cuisson pour un fondu parfait."));

        produits.add(new Produit("Végétarienne", 50.0, R.mipmap.pizza5, "35 min", 
            "Aubergines grillées, Courgettes, Poivrons, Maïs, Tomates fraîches", 
            "Un cocktail de vitamines croquantes. La fraîcheur des légumes de saison sur une pâte croustillante.", 
            "1. Grillez préalablement les légumes avec des herbes de Provence.\n2. Garnissez la pâte avec la base tomate et les légumes.\n3. Finissez avec un filet d'huile d'olive."));

        produits.add(new Produit("Calzone", 70.0, R.mipmap.pizza6, "40 min", 
            "Jambon, Œuf, Champignons, Fromage, Ricotta", 
            "La gourmandise cachée sous une enveloppe de pâte dorée. Un chausson fondant qui garde toute sa chaleur.", 
            "1. Garnissez seulement la moitié de la pâte.\n2. Cassez l'œuf au centre de la garniture.\n3. Repliez la pâte et soudez les bords.\n4. Badigeonnez de jaune d'œuf avant d'enfourner."));

        produits.add(new Produit("Reine (Regina)", 60.0, R.mipmap.pizza7, "25 min", 
            "Jambon blanc, Emmental français, Champignons de Paris, Tomate", 
            "La pizza préférée des familles. Un équilibre parfait de saveurs douces et appréciées de tous.", 
            "1. Base tomate classique.\n2. Ajoutez le jambon en lamelles et les champignons frais coupés.\n3. Recouvrez d'une pluie d'emmental.\n4. Faites cuire à feu vif."));

        produits.add(new Produit("Orientale", 65.0, R.mipmap.pizza8, "30 min", 
            "Merguez épicées, Poivrons doux, Oignons rouges, Œuf", 
            "Une explosion de saveurs relevées. Les épices du maghreb s'invitent sur une pâte à pizza traditionnelle.", 
            "1. Faites revenir les merguez.\n2. Disposez sur la pizza avec les oignons et poivrons émincés.\n3. Ajoutez l'œuf au centre 3 minutes avant la fin de la cuisson."));

        produits.add(new Produit("Hawaïenne", 55.0, R.mipmap.pizza9, "25 min", 
            "Jambon blanc, Ananas frais, Mozzarella, Maïs", 
            "Le célèbre mélange sucré-salé qui divise mais qui enchante les palais audacieux. Fraîcheur exotique garantie.", 
            "1. Préparez la base tomate.\n2. Disposez les morceaux d'ananas frais bien égouttés.\n3. Ajoutez le jambon et le maïs.\n4. Enfournez jusqu'à caramélisation."));

        produits.add(new Produit("Capresa", 80.0, R.mipmap.pizza10, "20 min", 
            "Tomates cerises, Roquette, Jambon de Parme, Copeaux de Grana Padano", 
            "Une pizza de luxe qui se déguste presque comme une salade composée. Finesse et produits d'exception.", 
            "1. Cuisez la pâte avec juste un peu de tomate ou à blanc.\n2. À la sortie du four, disposez la roquette fraîche.\n3. Ajoutez les tranches de jambon de Parme et les copeaux de fromage."));
    }

    public static ProduitDao getInstance() {
        if (instance == null) instance = new ProduitDao();
        return instance;
    }

    @Override
    public Produit create(Produit o) {
        produits.add(o);
        return o;
    }

    @Override
    public Produit update(Produit o) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == o.getId()) {
                produits.set(i, o);
                return o;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return produits.removeIf(p -> p.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
