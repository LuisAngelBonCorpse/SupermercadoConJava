package com.generation.supermercado.contenedores;

import com.generation.supermercado.IContenedor;
import com.generation.supermercado.IProducto;

import java.util.HashSet;
import java.util.Set;

public abstract class Contenedor implements IContenedor {
    private final String referencia;
    private final float altura;
    private final int resistencia;
    private Set<IProducto> productos;

    public Contenedor(String referencia, float altura, int resistencia) {
        this.referencia = referencia;
        this.altura = altura;
        this.resistencia = resistencia;
        productos = new HashSet<IProducto>();
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "referencia='" + referencia + '\'' +
                ", altura=" + altura +
                ", resistencia=" + resistencia +
                ", productos=" + productos +
                '}';
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public float getVolumen() {
        return altura * getSuperficie();
    }

    @Override
    public int volumenDisponible() {
        return (int) (getVolumen() - volumenOcupado());
    }

    private float volumenOcupado(){
        int res = 0;
        for (IProducto producto: productos){
            res += producto.getVolumen();
        }
        return res;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        return productos;
    }

    @Override
    public boolean meter(IProducto producto) {
        boolean resistenciaOk = resiste(producto);
        boolean volumenOk = producto.tengoEspacio(this);
        boolean compatibilidadOk = true;

        for (IProducto p: productos){
            boolean compatibleOk = producto.esCompatible(p);
            compatibilidadOk = compatibleOk;
        }

        boolean aceptar = resistenciaOk && volumenOk && compatibilidadOk;
        if (aceptar){
            productos.add(producto);
            producto.meter(this);
        }
        return aceptar;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return resistenciaActual() > producto.getPeso();
    }

    protected int resistenciaActual(){
        return getResistencia() - resistenciaUsada();
    }

    protected int resistenciaUsada(){
        int res = 0;
        for (IProducto producto: productos){
            res += producto.getPeso();
        }
        return res;
    }
}
