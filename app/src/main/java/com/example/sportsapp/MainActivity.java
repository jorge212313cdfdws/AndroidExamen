package com.example.sportsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnhockeyy, btnBasketball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Vinculamos los botones (LinearLayout)
        btnhockeyy = findViewById(R.id.btnhockeyy);
        btnBasketball = findViewById(R.id.btnBasketball);

        // Cuando pulsamos Hockey
        btnhockeyy.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("title", "Hockey");
            intent.putExtra("description", "El hockey es un juego que se juega con un disco sobre el hielo y con unos sticks");
            intent.putExtra("imageRes", R.drawable.hockeyy);
            startActivity(intent);
        });

        // Cuando pulsamos Basketball
        btnBasketball.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("title", "Basketball");
            intent.putExtra("description", "El basketball o baloncesto se juega en equipos con un balon y un aro");
            intent.putExtra("imageRes", R.drawable.basketball);
            startActivity(intent);
        });
    }
}
