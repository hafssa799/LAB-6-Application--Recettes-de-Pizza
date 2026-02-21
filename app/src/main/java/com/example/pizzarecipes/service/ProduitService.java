package com.example.pizzarecipes.service;

import com.example.pizzarecipes.dao.ProduitDao;
import com.example.pizzarecipes.classes.Produit;
import java.util.List;

public class ProduitService {
    private static ProduitService instance;
    private ProduitDao dao;

    private ProduitService() {
        dao = ProduitDao.getInstance();
    }

    public static ProduitService getInstance() {
        if (instance == null) instance = new ProduitService();
        return instance;
    }

    public List<Produit> findAll() {
        return dao.findAll();
    }

    public Produit findById(long id) {
        return dao.findById(id);
    }
}