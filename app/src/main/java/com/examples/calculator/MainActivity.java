package com.examples.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //segunda prueba de repositorio
     private EditText txtN1;
     private EditText txtN2;
     private TextView txt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txt = (TextView) findViewById(R.id.textView3);


    }
    public void Sumar(View igual) {

        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        int suma = valor1 + valor2;
        String result = String.valueOf(suma);
        txt.setText(result);
    }
}