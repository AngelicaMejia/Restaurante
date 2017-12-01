package com.example.as.restaurante;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class PlatosActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.platos);

        //        pedirDialogo = (Button) findViewById(R.id.btnPedir);
//
//        pedirDialogo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//                builder.setTitle("Información del pedido").
//                        setMessage("Precio: $14000");
//
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//            }
//        });
    }

    public void goToMenu (View view) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

    public void abrirDial (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.pedido);
        builder.setMessage(R.string.precio);
        builder.setPositiveButton(R.string.pedi, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(PlatosActivity.this, R.string.men, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton(android.R.string.cancel, null);


        Dialog dialog = builder.create();
        dialog.show();
    }


}
