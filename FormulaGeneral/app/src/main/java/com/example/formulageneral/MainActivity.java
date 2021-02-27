package com.example.formulageneral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText a,b,c;
    Button btnCalcular;
    TextView X1,X2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(EditText)findViewById(R.id.A);
        b=(EditText)findViewById(R.id.B);
        c=(EditText)findViewById(R.id.C);
        X1=(TextView)findViewById(R.id.X1);
        X2=(TextView)findViewById(R.id.X2);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double valorA = Double.parseDouble(a.getText().toString());
        double valorB = Double.parseDouble(b.getText().toString());
        double valorC = Double.parseDouble(c.getText().toString());
        double disc=Math.pow(valorB,2)-(4*valorA*valorC);
        if (disc>0){
            double x1=(-valorB+Math.sqrt(disc))/2*valorA;
            double x2=(-valorB-Math.sqrt(disc))/2*valorA;

            X1.setText("X1= "+x1);
            X2.setText("X2= "+x2);
        }
        else{
            X1.setText("X1 Dont exists");
            X2.setText("X2 Dont exists");
        }
    }
}