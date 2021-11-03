package com.generation.supermercado.productos;

import com.generation.supermercado.IProducto;
import com.generation.supermercado.enumerados.Categorias;

public class Higiene extends Producto{

    public Higiene(String referencia, float peso, float volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categorias getCategoria() {
        return Categorias.HIGIENE;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return !Categorias.ALIMENTACIÓN.equals(producto.getCategoria());
    }
}
