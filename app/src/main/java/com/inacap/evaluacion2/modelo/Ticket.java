package com.inacap.evaluacion2.modelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.inacap.evaluacion2.MainActivity;
import com.inacap.evaluacion2.R;
import com.inacap.evaluacion2.SeleccionaProductosActivity;

public class Ticket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
    }
    public void Terminar(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}