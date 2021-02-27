package com.example.votacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText elecciones;
    TextView result;
    Button btnCalcular;
    int a=0,b=0,c=0,d=0,i=0;
    List<Integer> votos= new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elecciones=(EditText)findViewById(R.id.eleccion);
        result=(TextView)findViewById(R.id.R);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int dato=Integer.parseInt(elecciones.getText().toString());
        votos.add(dato);
                switch (votos.get(i)){
                    case 1:
                        a++;
                        break;
                    case 2:
                        b++;
                        break;
                    case 3:
                        c++;
                        break;
                    case 4:
                        d++;
                        break;
                    default:
                        String votoN="Voto Nulo";
                        break;
                }//fin switch
            i++;
            double PrctA=(a*100)/votos.size();
            double PrctB=(b*100)/votos.size();
            double PrctC=(c*100)/votos.size();
            double PrctD=(d*100)/votos.size();
            result.setText("Resultados"+"\n"+"Votos para presidente A= "+a+"\n"+"Votos para presidente B= "+b+"\n"+"Votos para presidente C= "+c+"\n"+"Votos para presidente D= "+d+"\n\n"
                    +"Porcentajes"+"\n"+"% presidente A= "+PrctA+"%\n"+"% presidente B= "+PrctB+"%\n"+"% presidente C= "+PrctC+"%\n"+"% presidente D= "+PrctD+"%");
            dato=0;
        }
}