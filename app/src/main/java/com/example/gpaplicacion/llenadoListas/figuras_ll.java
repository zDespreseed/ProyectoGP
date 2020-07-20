package com.example.gpaplicacion.llenadoListas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gpaplicacion.Adaptador.Adaptador;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

import java.util.ArrayList;

public class figuras_ll extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<entidades> arrayFiguras = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_ll);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){

        arrayFiguras.add(new entidades(R.drawable.circulo, "Circulo", R.raw.circulo));
        arrayFiguras.add(new entidades(R.drawable.cuadrado, "Cuadrado", R.raw.cuadrado));
        arrayFiguras.add(new entidades(R.drawable.triangulo, "Triangulo", R.raw.triangulo));
        arrayFiguras.add(new entidades(R.drawable.rectangulo, "Rectangulo", R.raw.rectangulo));
        arrayFiguras.add(new entidades(R.drawable.cubo, "Cubo", R.raw.cubo));
        arrayFiguras.add(new entidades(R.drawable.ovalo, "Ovalo", R.raw.ovalo));
        arrayFiguras.add(new entidades(R.drawable.piramide, "Piramide", R.raw.piramide));
        arrayFiguras.add(new entidades(R.drawable.prisma, "Prisma", R.raw.prisma));
        arrayFiguras.add(new entidades(R.drawable.cilindro, "Cilindro", R.raw.cilindro));
        arrayFiguras.add(new entidades(R.drawable.hexagono, "Hexàgono", R.raw.hexagono));
        arrayFiguras.add(new entidades(R.drawable.estrella, "Estrella", R.raw.estrella));


        adaptador = new Adaptador(this, arrayFiguras);
        lvItems.setAdapter(adaptador);
    }
}
