package com.example.gpaplicacion.llenadoListas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;
import com.example.gpaplicacion.interfaces.evaluacion_p;
import com.example.gpaplicacion.interfaces.menu_p;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class animales_ll extends AppCompatActivity {
    private ListView lvItemsC;
    private Adaptador adaptadorC;
    private ArrayList<entidades> arrayColores = new ArrayList<>();
    FloatingActionButton evabtnflo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_ll);

        lvItemsC = (ListView) findViewById(R.id.lvItems);

        llenarItemsC();
        evabtnflo = findViewById(R.id.fab);
        evabtnflo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(animales_ll.this, evaluacion_p.class);
                startActivity(intent);
            }
        });

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
