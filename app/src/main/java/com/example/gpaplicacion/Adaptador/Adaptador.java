package com.example.gpaplicacion.Adaptador;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.gpaplicacion.R;
import com.example.gpaplicacion.entidades.entidades;
import com.example.gpaplicacion.interfaces.interfaz_p;


import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private ArrayList<entidades> listEntidades;
    private Context context;
    private LayoutInflater inflater;


    public Adaptador(Context context, ArrayList<entidades> listFiguras) {
        this.context = context;
        this.listEntidades = listFiguras;
    }

    @Override
    public int getCount() {
        return listEntidades.size();
    }

    @Override
    public Object getItem(int position) {
        return listEntidades.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // OBTENER EL OBJETO POR CADA ITEM A MOSTRAR
        final entidades entidad = (entidades) getItem(position);

        // CREAMOS E INICIALIZAMOS LOS ELEMENTOS DEL ITEM DE LA LISTA
        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView imgFoto = convertView.findViewById(R.id.imgFoto);
        TextView tvTitulo = convertView.findViewById(R.id.tvTitulo);
        CardView cardItem = convertView.findViewById(R.id.card_item);


        // LLENAMOS LOS ELEMENTOS CON LOS VALORES DE CADA ITEM
        imgFoto.setImageResource(entidad.getImgFoto());
        tvTitulo.setText(entidad.getTitulo());



        cardItem.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, interfaz_p.class);
                i.putExtra("item", entidad);
                context.startActivity(i);
                System.out.println("Click !!");
            }
        });

        return convertView;
    }
}
