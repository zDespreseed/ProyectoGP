package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class casa_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.cocina, "Cocina", R.raw.cocina));
        arrayColores.add(new entidades(R.drawable.comedor, "Comedor", R.raw.comedor));
        arrayColores.add(new entidades(R.drawable.sala, "Sala", R.raw.sala));
        arrayColores.add(new entidades(R.drawable.bano, "Baño", R.raw.bano));
        arrayColores.add(new entidades(R.drawable.cuarto, "Cuarto", R.raw.cuarto));
        arrayColores.add(new entidades(R.drawable.lavanderia, "Lavanderia", R.raw.lavanderia));
        arrayColores.add(new entidades(R.drawable.patio, "Patio", R.raw.patio));
        arrayColores.add(new entidades(R.drawable.sotano, "Sotano", R.raw.sotano));
        arrayColores.add(new entidades(R.drawable.garaje, "Garaje", R.raw.garaje));
        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
