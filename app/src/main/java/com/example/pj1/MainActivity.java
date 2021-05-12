package com.example.pj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn_calcular;
    EditText valor;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_calcular = findViewById(R.id.btn_calcular);
        valor = findViewById(R.id.txt_valor);
        resultado = findViewById(R.id.txt_resultado);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double calcular = 0.0;
                calcular = Double.parseDouble(valor.getText().toString())* 1.8 + 32;
                resultado.setText(calcular +" Fahrenheit");
            }
        });

    }
}