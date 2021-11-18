package com.example.sprint2;

import static java.lang.Math.round;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sprint2.model.Registro;
import com.example.sprint2.model.RegistroAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Registro> registros = new ArrayList<Registro>();

        EditText nombre = (EditText) findViewById(R.id.textNombre);
        EditText estatura = (EditText) findViewById(R.id.textEstatura);
        EditText peso = (EditText) findViewById(R.id.textPeso);
        Button botonCalcular = (Button) findViewById(R.id.boton_calcular);
        final TextView imc = (TextView) findViewById(R.id.textIMC);

        RegistroAdapter adaptador = new RegistroAdapter(this, R.layout.layout_for_item, registros);

        RecyclerView listaContactos = (RecyclerView) findViewById(R.id.lista_contactos);
        listaContactos.setAdapter(adaptador);
        listaContactos.setLayoutManager(new LinearLayoutManager(this));
        listaContactos.setHasFixedSize(true);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombre = new String(nombre.getText().toString());
                String estado = new String("");
                float estaturaF = new Float(estatura.getText().toString());
                float pesoF = new Float(peso.getText().toString());
                float vimc = round(pesoF/((estaturaF/100)*(estaturaF/100)));

                if(vimc < 18.5)
                    estado = "Bajo peso";
                if(vimc >= 18.5 && 18.5 < 25.0)
                    estado = "Normal";
                if(vimc >= 25.0 && 18.5 < 30.0)
                    estado = "Sobrepeso";
                if(vimc >= 30.0)
                    estado = "Obesidad";

                imc.setText(""+ vimc +", Estado: "+estado);
                registros.add(new Registro(Nombre,estaturaF,pesoF,vimc));
            }
        });
    }
}