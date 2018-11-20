package com.itche.gibranhr.listviewimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    String[] nombres;
    String[] dominios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se usan los arreglos de nombres de países y dominio que están en recursos
        Resources res = getResources();

        nombres = res.getStringArray(R.array.array_paises);
        dominios = res.getStringArray(R.array.array_dominiosPaises);

        ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);

        Pais myAdapter = new Pais(getApplicationContext(), nombres, dominios);

        lstNombresPaises.setAdapter(myAdapter);

    }
}
