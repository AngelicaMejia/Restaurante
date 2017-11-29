package com.example.as.restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goMenu (View view)
    {
//        Toast.makeText(this, "Bienvenido...", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);

    }
}
