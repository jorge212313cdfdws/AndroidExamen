package com.example.sportsapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailTitle, detailDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detailImage);
        detailTitle = findViewById(R.id.detailTitle);
        detailDesc = findViewById(R.id.detailDesc);

        // Recoger los datos enviados desde MainActivity
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageRes = getIntent().getIntExtra("imageRes", -1);

        // Mostrar los datos
        detailTitle.setText(title);
        detailDesc.setText(description);

        if (imageRes != -1) {
            detailImage.setImageResource(imageRes);
        }
    }
}
