package com.example.ejercicio_preparcial_2puntos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_aumento;
    private TextView tv_salario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        double aumento, salarioTotal;

        tv_aumento = (TextView) findViewById(R.id.tv_aumento);
        tv_salario = (TextView) findViewById(R.id.tv_salario);

        Bundle bundle = getIntent().getExtras();
        String sueldo1 = bundle.getString("txtSueldo");
        String anios1 = bundle.getString("txtAnios");

        double sueldo = Double.parseDouble(sueldo1);
        int anios = Integer.parseInt(anios1);

        if (sueldo >= 100 && anios > 0) {
            if (sueldo < 500 && anios >= 10) {
                aumento = sueldo * 0.2;
                salarioTotal = sueldo + aumento;
                tv_aumento.setText("Total aumento: " + aumento);
                tv_salario.setText("Total salario: " + salarioTotal);
            }
            if (sueldo < 500 && anios < 10) {
                aumento = sueldo * 0.05;
                salarioTotal = sueldo + aumento;
                tv_aumento.setText("Total aumento: " + aumento);
                tv_salario.setText("Total salario: " + salarioTotal);
            }
            if (sueldo >= 500) {
                tv_aumento.setText("Total aumento: 0");
                tv_salario.setText("Total salario: " + sueldo);
            }
        }
        else {
            Toast notificacion= Toast.makeText(this,"Error: Datos invalidos! >:(",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

    public void finalizar(View v) {
        finish();
    }
}