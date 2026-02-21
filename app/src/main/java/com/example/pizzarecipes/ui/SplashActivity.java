package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_splash);

        // Récupérer les vues
        ImageView logo = findViewById(R.id.logo);
        TextView title = findViewById(R.id.tvTitle);
        TextView sub = findViewById(R.id.tvSub);
        TextView footer = findViewById(R.id.tvFooter);
        android.view.View loader = findViewById(R.id.loader);

        // Charger les animations
        Animation splashAnim = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        Animation btmAnim = AnimationUtils.loadAnimation(this, R.anim.btm_anim);

        // Démarrer les animations dès que les vues sont prêtes
        logo.post(() -> {
            logo.startAnimation(splashAnim);
            title.startAnimation(btmAnim);
            sub.startAnimation(btmAnim);
            footer.startAnimation(btmAnim);
            loader.startAnimation(btmAnim);
        });

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            finish();
        }, 3500); // Temps légèrement augmenté pour une transition plus douce
    }
}