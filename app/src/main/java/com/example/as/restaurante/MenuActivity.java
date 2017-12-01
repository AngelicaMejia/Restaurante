package com.example.as.restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void goBeb (View view) {
        Intent i = new Intent(this, BebidasActivity.class);
        startActivity(i);
    }

    public void goPla (View view) {
        Intent i = new Intent(this, PlatosActivity.class);
        startActivity(i);
    }
    public void goPost (View view) {
        Intent i = new Intent(this, PostresActivity.class);
        startActivity(i);
    }

}
