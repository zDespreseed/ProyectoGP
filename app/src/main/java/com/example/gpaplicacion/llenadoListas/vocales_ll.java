package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class vocales_ll extends AppCompatActivity {
    private ListView lvItemsC;
    private Adaptador adaptador;
    private ArrayList<entidades> arrayColores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_ll);

        lvItemsC = (ListView) findViewById(R.id.lvItems);

        llenarItemsC();
    }
    private void llenarItemsC(){

        arrayColores.add(new entidades(R.drawable.a, "Vocal A", R.raw.a));
        arrayColores.add(new entidades(R.drawable.e, "Vocal E", R.raw.e));
        arrayColores.add(new entidades(R.drawable.i, "Vocal I", R.raw.i));
        arrayColores.add(new entidades(R.drawable.o, "Vocal O", R.raw.o));
        arrayColores.add(new entidades(R.drawable.u, "Vocal U", R.raw.u));


        adaptador = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptador);
    }
}
