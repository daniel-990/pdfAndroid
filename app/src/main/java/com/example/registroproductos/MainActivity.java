package com.example.registroproductos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    //inputs
    EditText nombre;
    EditText descripcion;
    EditText categoria;
    EditText cantidad;
    EditText precio;

    //botones
    Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //registro de elementos
        registrar = findViewById(R.id.registrar); //boton
        //inputs
        nombre = findViewById(R.id.nombre);
        descripcion = findViewById(R.id.descripcion);
        categoria = findViewById(R.id.categoria);
        cantidad = findViewById(R.id.cantidad);
        precio = findViewById(R.id.precio);

        //registro de eventos
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //elementos con datos
                String ElemNombre = nombre.getText().toString();
                String ElemDescripcion = descripcion.getText().toString();
                String ElemCategoria = categoria.getText().toString();
                int ElemCantidad = cantidad.getText().length();
                int ElemPrecio = precio.getText().length();



                //alerta con los datos
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("data: "+ElemNombre+"");
                AlertDialog alertDialog = alert.create();
                alertDialog.show();

            }
        });

    }



}