package com.example.deber_de_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btlim(View view) {
        EditText Cedula= findViewById(R.id.txtcedula);
        EditText Nombres= findViewById(R.id.txtnombre);
        EditText Fechadenacimiento= findViewById(R.id.txtfechadenacimiento);
        EditText Cuidad= findViewById(R.id.txtcuidad);
        EditText correo= findViewById(R.id.txtcorreo);
        EditText Telefono= findViewById(R.id.txttelefono);
        RadioButton Mas=(RadioButton) findViewById(R.id.btmasculino);
        RadioButton Fem=(RadioButton) findViewById(R.id.btfemenino);
        String sexo;
        if(Mas.isChecked())
            sexo = "Hombre";
        else
            sexo = "Mujer";
        Cedula.setText("");
        Nombres.setText("");
        Fechadenacimiento.setText("");
        Cuidad.setText("");
        correo.setText("");
        Telefono.setText("");
        Mas.setChecked(false);
        Fem.setChecked(false);

        }
    public void btenviar (View view) {
        EditText Cedula= findViewById(R.id.txtcedula);
        EditText Nombres= findViewById(R.id.txtnombre);
        EditText Fechadenacimiento= findViewById(R.id.txtfechadenacimiento);
        EditText Cuidad= findViewById(R.id.txtcuidad);
        EditText correo= findViewById(R.id.txtcorreo);
        EditText Telefono= findViewById(R.id.txttelefono);
        RadioButton Mas=(RadioButton) findViewById(R.id.btmasculino);
        RadioButton Fem=(RadioButton) findViewById(R.id.btfemenino);
        String sexo, Ced,Name,Fnacimiento,city,Email,phone;
        if(Mas.isChecked())
            sexo = "Hombre";
        else
            sexo = "Mujer";
        Ced = Cedula.getText().toString();
        Name= Nombres.getText().toString();
        Fnacimiento= Fechadenacimiento.getText().toString();
        city= Cuidad.getText().toString();
        Email= correo.getText().toString();
        phone =Telefono.getText().toString();
        Intent intent= new Intent(MainActivity.this, Listadeformulario.class);
        Bundle b= new Bundle();
        b.putString("CEDULA",Ced);
        b.putString("NOMBRE", Name);
        b.putString("FECHA",Fnacimiento);
        b.putString("CUIDAD",city);
        b.putString("GENERO",sexo);
        b.putString("CORREO",Email);
        b.putString("TELEFONO",phone);

        intent.putExtras(b);
        startActivity(intent);
    }
}