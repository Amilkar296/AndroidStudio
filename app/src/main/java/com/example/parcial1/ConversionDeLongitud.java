package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversionDeLongitud extends AppCompatActivity {

    private EditText et2;
    private TextView tv2;
    private Spinner sp3,sp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_de_longitud);

        et2 = (EditText) findViewById(R.id.numl);
        tv2 = (TextView) findViewById(R.id.resul2);
        sp3 = (Spinner) findViewById(R.id.spi3);
        sp4 = (Spinner) findViewById(R.id.spi4);

        String [] opciones3 = {"Metro","Centimetro","Kilometro"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado,opciones3);
        sp3.setAdapter(adapter3);

        String [] opciones4 = {"Metro","Centimetro","Kilometro"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, R.layout.simple_spinner_item_perzonalizado2,opciones4);
        sp4.setAdapter(adapter4);

    }

    public void calcular2(View view)
    {
        String v1_s = et2.getText().toString();

        int n1 = Integer.parseInt(v1_s);

        String selec = sp3.getSelectedItem().toString();
        String selec2 = sp4.getSelectedItem().toString();


        if(selec.equals("Metro") && selec2.equals("Centimetro"))
        {
            int m = n1*100;
            String result = String.valueOf(m);
            tv2.setText(result+" centimetros.");
        }

        if(selec.equals("Metro") && selec2.equals("Kilometro"))
        {
            int m2 = n1/1000;
            String result = String.valueOf(m2);
            tv2.setText(result+" kilometros.");
        }

        if(selec.equals("Metro") && selec2.equals("Metro"))
        {
            int m3 = n1;
            String result = String.valueOf(m3);
            tv2.setText(result+" metros.");
        }


        if(selec.equals("Centimetro") && selec2.equals("Metro"))
        {
            int m = n1/100;
            String result = String.valueOf(m);
            tv2.setText(result+" metros.");
        }

        if(selec.equals("Centimetro") && selec2.equals("Kilometro"))
        {
            int m = n1/100000;
            String result = String.valueOf(m);
            tv2.setText(result+" kilometros.");
        }

        if(selec.equals("Centimetro") && selec2.equals("Centimetro"))
        {
            int c2 = n1;
            String result = String.valueOf(c2);
            tv2.setText(result+" centimetros.");
        }


        if(selec.equals("Kilometro") && selec2.equals("Centimetro"))
        {
            int k = n1*100000;
            String result = String.valueOf(k);
            tv2.setText(result+" centimetros.");
        }

        if(selec.equals("Kilometro") && selec2.equals("Metro"))
        {
            int k2 = n1/1000;
            String result = String.valueOf(k2);
            tv2.setText(result+" metros.");
        }

        if(selec.equals("Kilometro") && selec2.equals("Kilometro"))
        {
            int k3 = n1;
            String result = String.valueOf(k3);
            tv2.setText(result+" kilometros.");
        }


    }

    public void conlo(View view)
    {
        Intent conlo = new Intent(this, MainActivity.class);
        startActivity(conlo);
    }

}