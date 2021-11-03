package com.generation.supermercado.productos;

import com.generation.supermercado.IProducto;
import com.generation.supermercado.enumerados.Categorias;

public class Alimentacion extends Producto {

    public Alimentacion(String referencia, float peso, float volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categorias getCategoria() {
        return Categorias.ALIMENTACIÓN;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return Categorias.ALIMENTACIÓN.equals(producto.getCategoria());
    }
}
