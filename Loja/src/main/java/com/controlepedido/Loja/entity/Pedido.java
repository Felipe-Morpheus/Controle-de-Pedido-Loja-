package com.controlepedido.Loja.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private String cliente;
    private List<ItemPedido> itens;

    public Pedido() {
    }

    public Pedido(long id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }



    /*Metodos*/
    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getPrecoUnitario();
        }
        return total;
    }

    public void adicionarItem(ItemPedido item) {
        if (item.getQuantidade() <= 0 || item.getPrecoUnitario() <= 0) {
            System.out.println("Item inválido não adicionado: " + item.getDescricao());
            return;
        }
        itens.add(item);
    }


}