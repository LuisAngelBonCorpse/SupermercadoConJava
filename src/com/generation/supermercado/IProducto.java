package com.generation.supermercado;

import com.generation.supermercado.contenedores.Contenedor;
import com.generation.supermercado.enumerados.Categorias;

public interface IProducto {
    String getReferencia();
    Categorias getCategoria();
    float getPeso();
    float getVolumen();

    boolean esCompatible(IProducto producto);

    boolean tengoEspacio(IContenedor contenedor);

    void meter(Contenedor contenedor);
}
