package com.inacap.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class SeleccionaProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciona_productos);
    }
    public void sacarTicket(View view)
    {
        String cafe=((Spinner)findViewById(R.id.Cafe)).getSelectedItem().toString();
        String te=((Spinner)findViewById(R.id.Te)).getSelectedItem().toString();
        String waffle=((Spinner)findViewById(R.id.Waffle)).getSelectedItem().toString();
        String muffin=((Spinner)findViewById(R.id.Muffin)).getSelectedItem().toString();
        String sandwich=((Spinner)findViewById(R.id.Sandwich)).getSelectedItem().toString();
    }
}