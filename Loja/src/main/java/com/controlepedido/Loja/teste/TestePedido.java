package com.controlepedido.Loja.teste;

import com.controlepedido.Loja.entity.ItemPedido;
import com.controlepedido.Loja.entity.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        // Cria Pedido para João
        Pedido pedido = new Pedido(1, "João");

        // Adiciona itens
        pedido.adicionarItem(new ItemPedido("Camiseta", 2, 25.50));
        pedido.adicionarItem(new ItemPedido("Calça", 1, 89.90));
        pedido.adicionarItem(new ItemPedido("Tênis", 1, 120.00));

        // Imprime resultados
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Itens no pedido: " + pedido.getItens().size());
        System.out.println("Valor total: " + pedido.calcularTotal());
    }
}
