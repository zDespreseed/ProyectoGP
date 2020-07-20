package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class escuela_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.salon, "Salon", R.raw.salon));
        arrayColores.add(new entidades(R.drawable.biblioteca, "Biblioteca", R.raw.biblioteca));
        arrayColores.add(new entidades(R.drawable.laboratorio, "Laboratorio", R.raw.laboratorio));
        arrayColores.add(new entidades(R.drawable.comedore, "Comedor", R.raw.comedore));
        arrayColores.add(new entidades(R.drawable.banoe, "Baño", R.raw.bano));
        arrayColores.add(new entidades(R.drawable.patioe, "Patio", R.raw.patio));
        arrayColores.add(new entidades(R.drawable.cancha, "Cancha", R.raw.cancha));

        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
