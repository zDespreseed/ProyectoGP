package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class frutas_ll extends AppCompatActivity {
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

        arrayColores.add(new entidades(R.drawable.banana, "Banana", R.raw.banana));
        arrayColores.add(new entidades(R.drawable.cereza, "Cereza", R.raw.cereza));
        arrayColores.add(new entidades(R.drawable.fresa, "Fresa", R.raw.fresa));
        arrayColores.add(new entidades(R.drawable.mandarina, "Mandarina", R.raw.mandarina));
        arrayColores.add(new entidades(R.drawable.mango, "Mango", R.raw.mango));
        arrayColores.add(new entidades(R.drawable.manzana, "Manzana", R.raw.manzana));
        arrayColores.add(new entidades(R.drawable.naranjaf, "Naranja", R.raw.naranja));
        arrayColores.add(new entidades(R.drawable.pera, "Pera", R.raw.pera));
        arrayColores.add(new entidades(R.drawable.pina, "Piña", R.raw.pina));
        arrayColores.add(new entidades(R.drawable.uva, "Uva", R.raw.uva));

        adaptadorC = new Adaptador(this, arrayColores);
        lvItemsC.setAdapter(adaptadorC);
    }
}
