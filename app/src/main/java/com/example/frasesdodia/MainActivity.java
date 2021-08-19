package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "O bagulho é doido !!!",
                "Oh my god !!!",
                "Treino é treino, jogo é jogo !!!",
                "O bagulho tá doido !!!"
        };
        // 0 1 2 3
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}
