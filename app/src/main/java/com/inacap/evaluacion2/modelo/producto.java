package com.inacap.evaluacion2.modelo;

import com.inacap.evaluacion2.R;

public class producto {
    private String nombre;
    private String descripcion;
    private int idfoto;
    private boolean estado;

    public static final producto[] producto ={
      new producto("Café","Nescafe, Gold, Monterrey", R.drawable.cafe),
            new producto("Té","Manzanilla, Menta, Negro", R.drawable.te),
            new producto("Waffle","Clasico, Miel, Manjar", R.drawable.waffle),
            new producto("Muffin","Chocolate, Avellanas, Relleno manjar", R.drawable.muffin),
            new producto("Sandwich","Jamon/queso, Lechuga/tomate", R.drawable.sandwich)
    };

    public producto(String nombre, String descripcion, int idfoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idfoto = idfoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdfoto() {
        return idfoto;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
