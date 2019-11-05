package com.example.javier;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Acercade extends AppCompatActivity {
        TextView tvNombre, tvDireccion;
        ImageView tvfoto;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.actvity_acercade);
            tvNombre = findViewById(R.id.tvNombre);


            tvDireccion = findViewById(R.id.tvDireccion);

            informacion();
        }
        public void informacion (){

            tvNombre.setText("Tecnico: Carlos Javier Mendoza Galeano");

            tvDireccion.setText("Direccion : km 32, Comalapa, La Paz.");

        }
    }