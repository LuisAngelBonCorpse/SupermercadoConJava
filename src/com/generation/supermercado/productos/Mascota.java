package com.generation.supermercado.productos;

import com.generation.supermercado.IProducto;
import com.generation.supermercado.enumerados.Categorias;

public class Mascota extends Producto{
    public Mascota(String referencia, float peso, float volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categorias getCategoria() {
        return Categorias.MASCOTA;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return !Categorias.FARMACIA.equals(producto.getCategoria());
    }
}
