package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversionDeVolumen extends AppCompatActivity {

    private EditText et3;
    private TextView tv3;
    private Spinner sp5,sp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_de_volumen);

        et3 = (EditText) findViewById(R.id.numv);
        tv3 = (TextView) findViewById(R.id.resul3);
        sp5 = (Spinner) findViewById(R.id.spi5);
        sp6 = (Spinner) findViewById(R.id.spi6);

        String [] opciones5 = {"Segundo","Minuto","Hora"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado,opciones5);
        sp5.setAdapter(adapter5);

        String [] opciones6 = {"Segundo","Minuto","Hora"};
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado2,opciones6);
        sp6.setAdapter(adapter6);

    }

    public void calcular3(View view)
    {
        String v1_s = et3.getText().toString();

        int n1 = Integer.parseInt(v1_s);

        String selec = sp5.getSelectedItem().toString();
        String selec2 = sp6.getSelectedItem().toString();

        if(selec.equals("Segundo") && selec2.equals("Minuto"))
        {
            int s = n1/60;
            String result = String.valueOf(s);
            tv3.setText(result+" minutos.");
        }

        if(selec.equals("Segundo") && selec2.equals("Hora"))
        {
            int s2 = n1/3600;
            String result = String.valueOf(s2);
            tv3.setText(result+" horas.");
        }

        if(selec.equals("Segundo") && selec2.equals("Segundo"))
        {
            int s3 = n1;
            String result = String.valueOf(s3);
            tv3.setText(result+" segundos.");
        }


        if(selec.equals("Minuto") && selec2.equals("Segundo"))
        {
            int m = n1*60;
            String result = String.valueOf(m);
            tv3.setText(result+" segundos.");
        }

        if(selec.equals("Minuto") && selec2.equals("Hora"))
        {
            int m2 = n1/60;
            String result = String.valueOf(m2);
            tv3.setText(result+" horas.");
        }

        if(selec.equals("Minuto") && selec2.equals("Minuto"))
        {
            int m3 = n1;
            String result = String.valueOf(m3);
            tv3.setText(result+" minutos.");
        }


        if(selec.equals("Hora") && selec2.equals("Segundo"))
        {
            int h = n1*3600;
            String result = String.valueOf(h);
            tv3.setText(result+" segundos.");
        }

        if(selec.equals("Hora") && selec2.equals("Minuto"))
        {
            int h2 = n1*60;
            String result = String.valueOf(h2);
            tv3.setText(result+" minutos.");
        }

        if(selec.equals("Hora") && selec2.equals("Hora"))
        {
            int h3 = n1;
            String result = String.valueOf(h3);
            tv3.setText(result+" horas.");
        }



    }

    public void convo(View view)
    {
        Intent convo = new Intent(this, MainActivity.class);
        startActivity(convo);
    }

}