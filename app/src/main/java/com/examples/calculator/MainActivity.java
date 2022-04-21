package com.examples.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    //segunda prueba de repositorio
     private EditText txtN1;
     private EditText txtN2;
     private TextView txt;
    private Button btn;
    private operaciones ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txt = (TextView) findViewById(R.id.textView3);
        ope = new operaciones();
        AppCenter.start(getApplication(), "e61d59eb-5062-4411-8afe-a7cc973e1f38",
                Analytics.class, Crashes.class);

    }


    public void Sumar(View igual) {

        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
      //  int suma = valor1 + valor2;
        //String result = String.valueOf(suma);
        txt.setText(ope.suma(valor1,valor2));
    }
    public void resta(View igual) {

        int valor1 = Integer.parseInt(txtN1.getText().toString());
        int valor2 = Integer.parseInt(txtN2.getText().toString());
        int suma = valor1 - valor2;
        String result = String.valueOf(suma);
        txt.setText(result);
    }
}