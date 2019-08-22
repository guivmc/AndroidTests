package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botaoSomar = (Button) findViewById(R.id.btnSomar);
        Button botaoSubtrair = (Button) findViewById(R.id.btnSubtrair);
        Button btnMultp = (Button) findViewById(R.id.btnMultp);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        final EditText etN1 = (EditText) findViewById(R.id.txtNumero1);
        final EditText etN2 = (EditText) findViewById(R.id.txtNumero2);
        final TextView tvRes = (TextView) findViewById(R.id.tvResultado);

        botaoSomar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int numero1 = Integer.parseInt(etN1.getText().toString());
                int numero2 = Integer.parseInt( etN2.getText().toString());
                int r = numero1+numero2;
                tvRes.setText( Integer.toString(r));
            }
        });
        botaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int numero1 = Integer.parseInt(etN1.getText().toString());
                int numero2 = Integer.parseInt( etN2.getText().toString());
                int r = numero1-numero2;
                tvRes.setText( Integer.toString(r));
            }
        });

        btnMultp.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int numero1 = Integer.parseInt(etN1.getText().toString());
                int numero2 = Integer.parseInt( etN2.getText().toString());
                int r = numero1*numero2;
                tvRes.setText( Integer.toString(r));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int numero1 = Integer.parseInt(etN1.getText().toString());
                int numero2 = Integer.parseInt( etN2.getText().toString());
                int r = numero1/numero2;
                tvRes.setText( Integer.toString(r));
            }
        });
    }

}
