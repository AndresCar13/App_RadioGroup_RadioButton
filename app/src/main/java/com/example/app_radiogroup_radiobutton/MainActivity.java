package com.example.app_radiogroup_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et_val1);
        et2 = findViewById(R.id.et_val2);
        tv1 = findViewById(R.id.tv_res);
        rb1 = findViewById(R.id.rb_sumar);
        rb2 = findViewById(R.id.rb_restar);
        rb3 = findViewById(R.id.rb_multiplicar);
        rb4 = findViewById(R.id.rb_dividir);
    }

    public void Calcular (View view) {
        String resultado;
        int res;
        String val1_String = et1.getText().toString();
        String val2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(val1_String);
        int valor2_int = Integer.parseInt(val2_String);

        if (rb1.isChecked()) {
            res = valor1_int + valor2_int;
        } else if (rb2.isChecked()) {
            res = valor1_int - valor2_int;
        } else if (rb3.isChecked()) {
            res = valor1_int * valor2_int;
        } else if (rb4.isChecked()) {
            res = valor1_int / valor2_int;
        } else {
            res = 0;
        }
        resultado = String.valueOf(res);

        tv1.setText(resultado);
    }
}