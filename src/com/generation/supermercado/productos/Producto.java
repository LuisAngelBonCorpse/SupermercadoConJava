package com.generation.supermercado.productos;

import com.generation.supermercado.IContenedor;
import com.generation.supermercado.IProducto;
import com.generation.supermercado.contenedores.Contenedor;

public abstract class Producto implements IProducto {

    private String referencia;
    private float peso;
    private float volumen;
    private IContenedor contenedor;


    public Producto(String referencia, float peso, float volumen){
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        return contenedor.volumenDisponible() > volumen;
    }

    @Override
    public void meter(Contenedor contenedor){
        this.contenedor = contenedor;
    }
}
