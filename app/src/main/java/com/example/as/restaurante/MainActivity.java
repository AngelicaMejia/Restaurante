package com.example.as.restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMenu (View view) {
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);
            Toast.makeText(this, "Bienvenido...", Toast.LENGTH_SHORT).show();

    }
}
