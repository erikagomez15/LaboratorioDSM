package com.example.ejercicio_preparcial_2puntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etSueldo;
    private EditText etAnios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSueldo = (EditText)findViewById(R.id.et_sueldo);
        etAnios = (EditText)findViewById(R.id.et_anios);
    }
    public void MainActivity2 (View v) {
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("txtSueldo", etSueldo.getText().toString());
        i.putExtra("txtAnios", etAnios.getText().toString());
        startActivity(i);
    }
}