
# 🏪 Sistema de Controle de Pedidos

## 📋 Descrição
Sistema simples para controle de pedidos em Java, desenvolvido como parte de processo seletivo. Implementa funcionalidades básicas de gestão de pedidos com validações.

## 🚀 Funcionalidades
- Criação de pedidos com cliente e itens
- Cálculo automático do valor total
- Validação de itens (quantidade e preço positivo)
- Adição segura de itens ao pedido

## 🏗️ Estrutura do Projeto
src/
├── main/
│ └── java/
│ └── com/controlepedido/Loja/
│ ├── entity/
│ │ ├── Pedido.java
│ │ └── ItemPedido.java
│ ├── LojaApplication.java
│ └── TestePedido.java



## 📦 Classes Principais

### `Pedido`
- Gerencia pedidos com ID, cliente e lista de itens
- Métodos: `calcularTotal()`, `adicionarItem()`

### `ItemPedido`  
- Representa itens individuais do pedido
- Atributos: descrição, quantidade, preço unitário

## 🛠️ Tecnologias
- Java 8+
- Spring Boot (estrutura base)
- Programação Orientada a Objetos

## 📝 Como Executar
1. Clone o repositório
2. Execute `TestePedido.java` para ver o funcionamento
3. Ou rode `LojaApplication.java` para iniciar a aplicação Spring

## ✨ Autor
Desenvolvido como parte de desafio técnico.



*********************************************************************************

Sistema de gestão de pedidos desenvolvido em Java como teste técnico.

## 🎯 Objetivo
Demonstrar conhecimentos em:
- POO e encapsulamento
- Collections Java (List)
- Tratamento de exceções
- Boas práticas de código

## 📁 Arquivos
- `Pedido.java` + `ItemPedido.java` → Lógica do negócio
- `TestePedido.java` → Classe de teste/main
- `respostas-teoricas.txt` → Questões teóricas respondidas

## 🚀 Execução
Run `TestePedido.java` para ver o exemplo funcionando.