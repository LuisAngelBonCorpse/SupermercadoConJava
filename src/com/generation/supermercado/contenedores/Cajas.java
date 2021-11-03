package com.generation.supermercado.contenedores;

import com.generation.supermercado.IProducto;
import com.generation.supermercado.enumerados.TipoContenedor;

public class Cajas extends Contenedor{
    private float ancho;
    private float largo;

    public Cajas(String referencia, float altura, float ancho, float largo){
        super(referencia, altura, 0);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public float getSuperficie() {
        return ancho * largo;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

    @Override
    public boolean resiste(IProducto producto){
        return true;
    }
}
