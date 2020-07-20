package com.example.gpaplicacion.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gpaplicacion.R;

public class inicio2_p extends AppCompatActivity {
    ImageView imagenInicio;
    TextView txtvBienvenido, txtvTexto;
    Button buttonIniciar;
    Animation animFormando, animBotton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2_p);
        imagenInicio= findViewById(R.id.imginicio_p);
        txtvBienvenido= findViewById(R.id.inicio_txtv);
        txtvTexto= findViewById(R.id.texto_txtv);
        buttonIniciar= findViewById(R.id.btn_inicio2);

        buttonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(inicio2_p.this, menu_p.class);
                startActivity(intent);

            }
        });

        animFormando = AnimationUtils.loadAnimation(this, R.anim.formando);
        animBotton = AnimationUtils.loadAnimation(this, R.anim.debotton);

        imagenInicio.startAnimation(animFormando);
        txtvTexto.startAnimation(animBotton);
        txtvBienvenido.startAnimation(animBotton);
        buttonIniciar.startAnimation(animBotton);




    }
}