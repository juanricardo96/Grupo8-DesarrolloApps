package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText estatura = (EditText) findViewById(R.id.textEstatura);
        EditText peso = (EditText) findViewById(R.id.textPeso);
        Button botonCalcular = (Button) findViewById(R.id.boton_calcular);
        final TextView imc = (TextView) findViewById(R.id.textIMC);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*String estaturaF = estatura.getText().toString();
                String pesoF = peso.getText().toString();*/
                float estaturaF = new Float(estatura.getText().toString());
                float pesoF = new Float(peso.getText().toString());
                imc.setText(""+ pesoF/((estaturaF/100)*(estaturaF/100)));
            }
        });
    }
}