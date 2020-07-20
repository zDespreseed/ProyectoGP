package com.example.gpaplicacion.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;

public class interfaz_p extends AppCompatActivity {
    private TextView tvTitulo;
    private ImageView imgFoto;
    private entidades item;
    private LottieAnimationView amlsound;
    MediaPlayer S1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_p);
        item = (entidades) getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo);
            imgFoto = findViewById(R.id.imgFoto);
            amlsound = findViewById(R.id.amv_sonido);

            tvTitulo.setText(item.getTitulo());
            imgFoto.setImageResource(item.getImgFoto());
            S1 = MediaPlayer.create(this, item.getSonido());
            amlsound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    S1.start();
                }
            });
        }

    }

}