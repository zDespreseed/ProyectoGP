package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class colores_ll extends AppCompatActivity {
    private ListView lvItemsC;
    private Adaptador adaptadorC;
    private ArrayList<entidades> arrayColores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_ll);

        lvItemsC = (ListView) findViewById(R.id.lvItems);

        llenarItemsC();
    }
    private void llenarItemsC(){

        arrayColores.add(new entidades(R.drawable.rojo, "Rojo", R.raw.rojo));
        arrayColores.add(new entidades(R.drawable.azul, "Azul", R.raw.azul));
        arrayColores.add(new entidades(R.drawable.amarillo, "Amarillo", R.raw.amarilo));
        arrayColores.add(new entidades(R.drawable.verde, "Verde", R.raw.verde));
        arrayColores.add(new entidades(R.drawable.blanco, "Blanco", R.raw.blanco));
        arrayColores.add(new entidades(R.drawable.gris, "Gris", R.raw.gris));
        arrayColores.add(new entidades(R.drawable.lima, "Lima", R.raw.lima));
        arrayColores.add(new entidades(R.drawable.marron, "Marron", R.raw.marron));
        arrayColores.add(new entidades(R.drawable.morado, "Morado", R.raw.morado));
        arrayColores.add(new entidades(R.drawable.naranja, "Naranja", R.raw.naranjac));
        arrayColores.add(new entidades(R.drawable.rosa, "Rosa", R.raw.rosa));
        arrayColores.add(new entidades(R.drawable.negro, "Negro", R.raw.negro));
        arrayColores.add(new entidades(R.drawable.turquesa, "Turquesa", R.raw.turquesa));
        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
