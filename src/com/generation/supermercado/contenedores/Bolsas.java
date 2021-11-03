package com.generation.supermercado.contenedores;

import com.generation.supermercado.enumerados.TipoContenedor;

public class Bolsas extends Contenedor{

    private float diametro;

    public Bolsas(String referencia, float altura, float diametro, int resistencia) {
        super(referencia, altura, resistencia);
        this.diametro = diametro;
    }

    @Override
    public float getSuperficie() {
        float radio = getDiametro() /2;
        return (float) (Math.PI * radio * radio);
    }

    private float getDiametro() {
        return diametro;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }
}
