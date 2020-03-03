package br.ifsc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText min;
    EditText max;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        min = findViewById(R.id.editTextMin);
        max = findViewById(R.id.editTextMax);
        resultado = findViewById(R.id.textViewResultado);

    }

    public void Sortear(View view){
        int minimo = Integer.parseInt(min.getText().toString());
        int maximo = Integer.parseInt(max.getText().toString());
        int num_escolhido =  new Random().nextInt((maximo-minimo)+1)+minimo;
        resultado.setText(String.valueOf(num_escolhido));
    }
}
