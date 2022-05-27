package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversionDePesos extends AppCompatActivity {

    private EditText et1;
    private TextView tv1;
    private Spinner sp1,sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_de_pesos);

        et1 = (EditText) findViewById(R.id.num1);
        tv1 = (TextView) findViewById(R.id.resul);
        sp1 = (Spinner) findViewById(R.id.spi1);
        sp2 = (Spinner) findViewById(R.id.spi2);

        String [] opciones = {"Kilogramo","Gramo","Tonelada"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado,opciones);
        sp1.setAdapter(adapter);

        String [] opciones2 = {"Kilogramo","Gramo","Tonelada"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado2,opciones2);
        sp2.setAdapter(adapter2);

    }

    //metodo de calculo
    public void calcular(View view)
    {
        String v1_s = et1.getText().toString();

        int n1 = Integer.parseInt(v1_s);

        String selec = sp1.getSelectedItem().toString();
        String selec2 = sp2.getSelectedItem().toString();


        if(selec.equals("Kilogramo") && selec2.equals("Gramo"))
        {
            int kg = n1*1000;
            String result = String.valueOf(kg);
            tv1.setText(result+" gramos.");
        }

        if(selec.equals("Kilogramo") && selec2.equals("Tonelada"))
        {
            int kg2 = n1/1000;
            String result = String.valueOf(kg2);
            tv1.setText(result+" toneladas.");
        }

        if(selec.equals("Kilogramo") && selec2.equals("Kilogramo"))
        {
            int kg3 = n1;
            String result = String.valueOf(kg3);
            tv1.setText(result+" kilogramos.");
        }


        if(selec.equals("Gramo") && selec2.equals("Tonelada"))
        {
            int g = n1/1000000 ;
            String result = String.valueOf(g);
            tv1.setText(result+" toneladas.");
        }

        if(selec.equals("Gramo") && selec2.equals("Kilogramo"))
        {
            int g2 = n1/1000;
            String result = String.valueOf(g2);
            tv1.setText(result+" kilogramos.");
        }

        if(selec.equals("Gramo") && selec2.equals("Gramo"))
        {
            int g3 = n1;
            String result = String.valueOf(g3);
            tv1.setText(result+" gramos.");
        }


        if(selec.equals("Tonelada") && selec2.equals("Gramo"))
        {
            int t = n1*1000000 ;
            String result = String.valueOf(t);
            tv1.setText(result+" gramos.");
        }

        if(selec.equals("Tonelada") && selec2.equals("Kilogramo"))
        {
            int t2 = n1/1000;
            String result = String.valueOf(t2);
            tv1.setText(result+" kilogramos.");
        }

        if(selec.equals("Tonelada") && selec2.equals("Tonelada"))
        {
            int t3 = n1;
            String result = String.valueOf(t3);
            tv1.setText(result+" toneladas.");
        }


    }

    //metodo regresar
    public void conper(View view)
    {
        Intent conper = new Intent(this, MainActivity.class);
        startActivity(conper);
    }
}