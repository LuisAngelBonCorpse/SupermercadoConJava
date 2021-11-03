package com.generation.supermercado.productos;

import com.generation.supermercado.IProducto;
import com.generation.supermercado.enumerados.Categorias;

public class Farmacia extends Producto{

    public Farmacia(String referencia, float peso, float volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categorias getCategoria() {
        return Categorias.FARMACIA;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return !Categorias.ALIMENTACIÓN.equals(producto.getCategoria()) && !Categorias.MASCOTA.equals(producto.getCategoria());
    }
}
