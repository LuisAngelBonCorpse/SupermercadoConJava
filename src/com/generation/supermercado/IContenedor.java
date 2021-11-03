package com.generation.supermercado;

import com.generation.supermercado.enumerados.TipoContenedor;

import java.util.Set;

public interface IContenedor {

    float getSuperficie();
    float getVolumen();

    int volumenDisponible();
    int getResistencia();

    String getReferencia();
    TipoContenedor getTipo();

    Set<IProducto> getProductos();

    boolean meter(IProducto producto);
    boolean resiste(IProducto producto);
}
