package com.example.gpaplicacion.interfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.gpaplicacion.R;
import com.example.gpaplicacion.llenadoListas.animales_ll;
import com.example.gpaplicacion.llenadoListas.casa_ll;
import com.example.gpaplicacion.llenadoListas.colores_ll;
import com.example.gpaplicacion.llenadoListas.cuerpo_ll;
import com.example.gpaplicacion.llenadoListas.escuela_ll;
import com.example.gpaplicacion.llenadoListas.familia_ll;
import com.example.gpaplicacion.llenadoListas.figuras_ll;
import com.example.gpaplicacion.llenadoListas.frutas_ll;
import com.example.gpaplicacion.llenadoListas.vocales_ll;

public class menu_p extends AppCompatActivity {
    CardView carddFiguras, cardColores, cardVocales, cardFrutas, cardAnimales, cardCuerpo, cardCasa, cardEscuela, cardFamilia, cardPrueba;
    ImageButton btn_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_p);

        carddFiguras = findViewById(R.id.card_figuras);
        carddFiguras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(menu_p.this, figuras_ll.class);
                startActivity(intent);
            }
        });

        cardColores = findViewById(R.id.card_colores);
        cardColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, colores_ll.class);
                startActivity(intent);
            }
        });

        cardVocales = findViewById(R.id.card_vocales);
        cardVocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, vocales_ll.class);
                startActivity(intent);
            }
        });

        cardFrutas = findViewById(R.id.card_frutas);
        cardFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, frutas_ll.class);
                startActivity(intent);
            }
        });

        cardAnimales = findViewById(R.id.card_animales);
        cardAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, animales_ll.class);
                startActivity(intent);
            }
        });

        cardCuerpo = findViewById(R.id.card_cuerpo);
        cardCuerpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, cuerpo_ll.class);
                startActivity(intent);
            }
        });

        cardCasa = findViewById(R.id.card_casa);
        cardCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, casa_ll.class);
                startActivity(intent);
            }
        });

        cardEscuela = findViewById(R.id.card_escuela);
        cardEscuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, escuela_ll.class);
                startActivity(intent);
            }
        });

        cardFamilia = findViewById(R.id.card_familia);
        cardFamilia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, familia_ll.class);
                startActivity(intent);
            }
        });

        cardPrueba = findViewById(R.id.card_prueba);
        cardPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(menu_p.this, prueba_m.class);
                startActivity(intent);
            }
        });

        btn_salir= findViewById(R.id.btn_salir);
        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}