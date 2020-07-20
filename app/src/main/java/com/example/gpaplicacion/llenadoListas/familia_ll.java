package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class familia_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.papa, "Papá", R.raw.papa));
        arrayColores.add(new entidades(R.drawable.mama, "Mamà", R.raw.mama));
        arrayColores.add(new entidades(R.drawable.hermano, "Hermano", R.raw.hermano));
        arrayColores.add(new entidades(R.drawable.hermana, "Hermana", R.raw.hermana));
        arrayColores.add(new entidades(R.drawable.bebe, "Bebè", R.raw.bebe));
        arrayColores.add(new entidades(R.drawable.abuelo, "Abuelo", R.raw.abuelo));
        arrayColores.add(new entidades(R.drawable.abuela, "Abuela", R.raw.abela));

        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
