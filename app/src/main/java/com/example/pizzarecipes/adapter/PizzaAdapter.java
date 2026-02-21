package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private Context context;
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Context context, List<Produit> produits) {
        this.context = context;
        this.produits = produits;
        this.inflater = LayoutInflater.from(context);
    }

    public void updateList(List<Produit> newList) {
        this.produits = newList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_pizza, parent, false);
        }

        Produit p = produits.get(position);

        ImageView img = convertView.findViewById(R.id.imgPizza);
        TextView nom = convertView.findViewById(R.id.tvNom);
        TextView meta = convertView.findViewById(R.id.tvMeta);
        ImageView imgFav = convertView.findViewById(R.id.imgFav);

        img.setImageResource(p.getImageRes());
        nom.setText(p.getNom());
        meta.setText(p.getDuree() + " • " + p.getPrix() + " DH");

        // Gérer l'icône favori
        if (p.isFavorite()) {
            imgFav.setImageResource(android.R.drawable.btn_star_big_on);
        } else {
            imgFav.setImageResource(android.R.drawable.btn_star_big_off);
        }

        imgFav.setOnClickListener(v -> {
            p.setFavorite(!p.isFavorite());
            notifyDataSetChanged();
        });

        return convertView;
    }
}
