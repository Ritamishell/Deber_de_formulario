package com.example.deber_de_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Listadeformulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadeformulario);

        TextView formulario= (TextView) findViewById(R.id.txtresultado);
        Bundle bundle = this.getIntent().getExtras();

        formulario.setText("DATOS REGISTRADOS,  " +
                " \n " +
                bundle.getString("CEDULA") +
                " \n " +
                bundle.getString("NOMBRE") +
                " \n " +
                bundle.getString("FECHA") +
                " \n " +
                bundle.getString("CUIDAD")+
                " \n " +
                bundle.getString("GENERO")
                + " \n " +
                bundle.getString("CORREO")
                + " \n " +
                bundle.getString("TELEFONO")
        );
    }
}