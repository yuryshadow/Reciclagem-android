package com.cursoandroid.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void alterarNumero (View view){

            TextView txtViewNum = findViewById(R.id.txtViewNum);

            int numero = new Random().nextInt(11);


            txtViewNum.setText("Número : " + numero);

        }



}
