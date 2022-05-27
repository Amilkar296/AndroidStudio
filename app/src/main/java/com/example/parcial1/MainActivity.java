package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    //metodo boton siguiente activity
    public void conpe(View view)
    {
        Intent conpe = new Intent(this, ConversionDePesos.class);
        startActivity(conpe);
    }

    public void conlo(View view)
    {
        Intent conlo = new Intent(this, ConversionDeLongitud.class);
        startActivity(conlo);
    }

    public void convo(View view)
    {
        Intent convo = new Intent(this, ConversionDeVolumen.class);
        startActivity(convo);
    }

}