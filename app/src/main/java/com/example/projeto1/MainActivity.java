package com.example.projeto1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText valorGasolina, valorEtanol;
    private ImageView imagemResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorGasolina = findViewById(R.id.valorGasolina);
        valorEtanol = findViewById(R.id.valorEtanol);
        imagemResultado = findViewById(R.id.imagemResultado);
    }

    public void calcular(View view) {
        double gasolina = Double.parseDouble(valorGasolina.getText().toString());
        double etanol = Double.parseDouble(valorEtanol.getText().toString());
        double resultado = etanol / gasolina;

        if (resultado <= 0.7) {
            imagemResultado.setImageResource(R.drawable.etanol);
        } else {
            imagemResultado.setImageResource(R.drawable.gasolina);
        }
    }
}




