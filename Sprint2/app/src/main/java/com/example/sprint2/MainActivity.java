package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText estatura = (EditText) findViewById(R.id.textEstatura);
        EditText peso = (EditText) findViewById(R.id.textPeso);
    }
}