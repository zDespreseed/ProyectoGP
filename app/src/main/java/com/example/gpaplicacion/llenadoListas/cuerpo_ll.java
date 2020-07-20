package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class cuerpo_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.cabeza, "Cabeza", R.raw.cabeza));
        arrayColores.add(new entidades(R.drawable.ojos, "Ojos", R.raw.ojos));
        arrayColores.add(new entidades(R.drawable.pestanas, "Pestañas", R.raw.pestanas));
        arrayColores.add(new entidades(R.drawable.boca, "Boca", R.raw.boca));
        arrayColores.add(new entidades(R.drawable.lengua, "Lengua", R.raw.lengua));
        arrayColores.add(new entidades(R.drawable.nariz, "Nariz", R.raw.nariz));
        arrayColores.add(new entidades(R.drawable.orejas, "Orejas", R.raw.orejas));
        arrayColores.add(new entidades(R.drawable.manos, "Manos", R.raw.manos));
        arrayColores.add(new entidades(R.drawable.pies, "Pies", R.raw.pies));
        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
