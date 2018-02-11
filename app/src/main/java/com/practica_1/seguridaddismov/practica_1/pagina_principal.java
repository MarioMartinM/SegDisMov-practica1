package com.practica_1.seguridaddismov.practica_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class pagina_principal extends AppCompatActivity {

    Button insertar;
    Button listar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        insertar = findViewById(R.id.Insertar);
        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirInsertar = new Intent("android.intent.action.INSERTAR");
                startActivity(abrirInsertar);
            }
        });

        listar = findViewById(R.id.Listar);
        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirListar = new Intent("android.intent.action.LISTAR");
                startActivity(abrirListar);
            }
        });
    }

}
