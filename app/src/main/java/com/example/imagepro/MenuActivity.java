package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, SpeechToTextActivity.class)));

        ConstraintLayout btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, MainActivity.class)));
    }
}