package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;
import java.util.ArrayList;
import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    private PizzaAdapter adapter;
    private List<Produit> allPizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        ListView lv = findViewById(R.id.lvPizzas);
        EditText etSearch = findViewById(R.id.etSearch);

        allPizzas = ProduitService.getInstance().findAll();
        adapter = new PizzaAdapter(this, new ArrayList<>(allPizzas));
        lv.setAdapter(adapter);

        // Implémentation de la recherche
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterPizzas(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        lv.setOnItemClickListener((parent, view, pos, id) -> {
            Produit selected = (Produit) parent.getItemAtPosition(pos);
            if (selected != null) {
                Intent it = new Intent(this, PizzaDetailActivity.class);
                it.putExtra("pizza_id", selected.getId());
                startActivity(it);
            }
        });
    }

    private void filterPizzas(String query) {
        List<Produit> filtered = new ArrayList<>();
        for (Produit p : allPizzas) {
            if (p.getNom().toLowerCase().contains(query.toLowerCase())) {
                filtered.add(p);
            }
        }
        adapter.updateList(filtered);
    }
}