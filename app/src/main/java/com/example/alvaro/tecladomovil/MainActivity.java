package com.example.alvaro.tecladomovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void borrarValor(View v) {

        EditText campoTexto = (EditText) findViewById(R.id.editText);
        EditText campoResultado= (EditText) findViewById(R.id.editText2);
        campoResultado.setText("");
        campoTexto.setText("");

    }

    public void verValor(View v){
        EditText campoTexto = (EditText) findViewById(R.id.editText);
        String cadena= campoTexto.getText().toString();
        String resultado= "";

        for (int i=0; i <cadena.length() ; i++ ){
            char divisor = cadena.charAt(i);
            if (divisor  == ' '){
                resultado += " 0";
            }
            if (divisor  == 'a'){
                resultado += " 2";
            }
            if (divisor  == 'b'){
                resultado += " 22";
            }
            if (divisor  == 'c'){
                resultado += " 222";
            }
            if (divisor  == 'd'){
                resultado += " 3";
            }
            if (divisor  == 'e'){
                resultado += " 33";
            }
            if (divisor  == 'f'){
                resultado += " 333";
            }
            if (divisor  == 'g'){
                resultado += " 4";
            }
            if (divisor  == 'h'){
                resultado += " 44";
            }
            if (divisor  == 'i'){
                resultado += " 444";
            }
            if (divisor  == 'j'){
                resultado += " 5";
            }
            if (divisor  == 'k'){
                resultado += " 55";
            }
            if (divisor  == 'l'){
                resultado += " 555";
            }
            if (divisor  == 'm'){
                resultado += " 6";
            }
            if (divisor  == 'n'){
                resultado += " 66";
            }
            if (divisor  == 'o'){
                resultado += " 666";
            }
            if (divisor  == 'p'){
                resultado += " 7";
            }
            if (divisor  == 'q'){
                resultado += " 77";
            }
            if (divisor  == 'r'){
                resultado += " 777";
            }
            if (divisor  == 's'){
                resultado += " 7777";
            }
            if (divisor  == 't'){
                resultado += " 8";
            }
            if (divisor  == 'u'){
                resultado += " 88";
            }
            if (divisor  == 'v'){
                resultado += " 888";
            }
            if (divisor  == 'w'){
                resultado += " 9";
            }
            if (divisor  == 'x'){
                resultado += " 99";
            }
            if (divisor  == 'y'){
                resultado += " 999";
            }
            if (divisor  == 'z'){
                resultado += " 9999";
            }
        }

        EditText campoResultado= (EditText) findViewById(R.id.editText2);
        campoResultado.setText(resultado);


    }
}
