package com.generation;

import com.generation.supermercado.IContenedor;
import com.generation.supermercado.IPedido;
import com.generation.supermercado.IProducto;
import com.generation.supermercado.contenedores.Bolsas;
import com.generation.supermercado.contenedores.Cajas;
import com.generation.supermercado.productos.Congelado;
import com.generation.supermercado.productos.Fresco;
import com.generation.supermercado.productos.Higiene;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        IPedido miPedido = new Pedidos("pedido000");

        IContenedor bolsa1 = new Bolsas("B000", 40.5f, 23.3f,1200);
        IContenedor caja1 = new Cajas("C000", 30, 50, 75);

        miPedido.addContenedor(bolsa1);
        miPedido.addContenedor(caja1);

        System.out.println("Pedido con contenedores: " +miPedido);

        IProducto manzanas = new Fresco("MZN0", 1200,1300, LocalDate.now().plusDays(15));
        IProducto helado = new Congelado("HLD0", 800,900);
        IProducto papelWC = new Higiene("PWC0", 50,1500);
        IProducto peras = new Fresco("PER0", 600,1100, LocalDate.now().plusDays(-5));

        IContenedor contenedorManzana = miPedido.addProducto(manzanas);
        IContenedor contenedorHelado = miPedido.addProducto(helado);
        IContenedor contenedorPapelWC = miPedido.addProducto(papelWC);
        IContenedor contenedorPera = miPedido.addProducto(peras);

        System.out.println("Pedido con contenedores y productos: " +miPedido);

    }
}
