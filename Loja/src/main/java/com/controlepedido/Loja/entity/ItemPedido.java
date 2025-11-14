package com.controlepedido.Loja.entity;

public class ItemPedido {
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido() {
    }

    public ItemPedido(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}