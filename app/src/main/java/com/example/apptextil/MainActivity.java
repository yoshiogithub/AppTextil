package com.example.apptextil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3;
    Empleado n1,n2,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);

        n1=new Empleado(201,"Juan Manuel","Perez Gomez","gerencia");
        n2=new Empleado(202,"Maria Isabel","Fernandez Valerio","prueba");
        n3=new Empleado(203,"Carol Lisset","Martinez Santos","gerencia");

        txt1.setText(n1.Info());
        txt2.setText(n2.Info());
        txt3.setText(n3.Info());
    }
}
