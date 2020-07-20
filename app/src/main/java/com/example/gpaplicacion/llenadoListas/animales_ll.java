package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class animales_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.perro, "Perro", R.raw.perro));
        arrayColores.add(new entidades(R.drawable.gato, "Gato", R.raw.gato));
        arrayColores.add(new entidades(R.drawable.ardilla, "Ardilla", R.raw.ardilla));
        arrayColores.add(new entidades(R.drawable.ballena, "Ballena", R.raw.ballena));
        arrayColores.add(new entidades(R.drawable.buho, "Buho", R.raw.buho));
        arrayColores.add(new entidades(R.drawable.cebra, "Cebra", R.raw.cebra));
        arrayColores.add(new entidades(R.drawable.conejo, "Conejo", R.raw.conejo));
        arrayColores.add(new entidades(R.drawable.delfin, "Delfin", R.raw.delfin));
        arrayColores.add(new entidades(R.drawable.elefante, "Elefante", R.raw.elefante));
        arrayColores.add(new entidades(R.drawable.jirafa, "Jirafa", R.raw.jirafa));
        arrayColores.add(new entidades(R.drawable.oveja, "Oveja", R.raw.oveja));
        arrayColores.add(new entidades(R.drawable.tigre, "Tigre", R.raw.tigre));
        arrayColores.add(new entidades(R.drawable.zorro, "Zorro", R.raw.zorro));
        arrayColores.add(new entidades(R.drawable.leon, "Leon", R.raw.leon));
        arrayColores.add(new entidades(R.drawable.caballo, "Caballo", R.raw.cabalo));
        arrayColores.add(new entidades(R.drawable.cerdo, "Cerdo", R.raw.cerdo));
        arrayColores.add(new entidades(R.drawable.paloma, "Paloma", R.raw.paloma));
        arrayColores.add(new entidades(R.drawable.mono, "Mono", R.raw.mono));
        arrayColores.add(new entidades(R.drawable.gallina, "Gallina", R.raw.gallina));




        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
