package com.generation;

import com.generation.supermercado.IContenedor;
import com.generation.supermercado.IPedido;
import com.generation.supermercado.IProducto;

import java.util.HashSet;
import java.util.Set;

public class Pedidos implements IPedido {
    private final String referencia;
    private final Set<IContenedor> contenedores;


    public Pedidos(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Pedidos { \n" +
                "referencia='" + referencia + '\''+'\n' +
                "contenedores=" + contenedores + '\n' +
                '}' + '\n';
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        Set<IProducto> productos = null;
        for (IContenedor c: contenedores) {
            if (productos == null) {
                productos = c.getProductos();
            } else {
                productos.addAll(c.getProductos());
            }
        }
        return productos;
    }

    @Override
    public Set<IContenedor> getContenedores() {
        return contenedores;
    }

    @Override
    public void addContenedor(IContenedor contenedor) {
        contenedores.add(contenedor);
    }

    @Override
    public IContenedor addProducto(IProducto producto) {
        for (IContenedor contenedor : contenedores
             ) {    if (contenedor.meter(producto)) {
                        return contenedor;
                    }
        }
        return null;
    }
}
