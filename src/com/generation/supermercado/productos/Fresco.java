package com.generation.supermercado.productos;

import com.generation.supermercado.ICaducables;

import java.time.LocalDate;

public class Fresco extends Alimentacion implements ICaducables {
    private LocalDate caducidad;

    public Fresco(String referencia, float peso, float volumen, LocalDate caducidad) {
        super(referencia, peso, volumen);
        this.caducidad = caducidad;
    }

    @Override
    public boolean estaCaducado() {
        return caducidad.isBefore(LocalDate.now());
    }
}
