package com.inacap.evaluacion2.modelo;

import java.util.ArrayList;

public class ListaCompra
{
    private static ListaCompra instancia= new ListaCompra();
    private ArrayList<producto> listaCompra;

    private ListaCompra(){
        listaCompra=new ArrayList<>();

    }
    public static ListaCompra getInstancia(){
        return instancia;
    }

    public void agregarProducto(producto producto){
        listaCompra.add(producto);
    }
}
