package com.figueiredo.capitulo_10;

// Classe Invoice que implementa Payable.

public class Fatura implements Pagamento {
    private final String numeroDaPeça;
    private final String descriçãoParcial;
    private int quantidade;
    private double precoPorItem;

    // construtor
    public Fatura(String numeroDaPeça, String descriçãoParcial, int quantidade, double precoPorItem) {
        if (quantidade < 0) // valida quantidade
            throw new IllegalArgumentException("Quantidade deve ser >= 0");

        if (precoPorItem < 0.0) // valida precoPorItem
            throw new IllegalArgumentException(
                    "Preço por item deve ser >= 0");

        this.quantidade = quantidade;
        this.numeroDaPeça = numeroDaPeça;
        this.descriçãoParcial = descriçãoParcial;
        this.precoPorItem = precoPorItem;
    } // fim do construtor

    // obtém o número da peça
    public String getNumeroDaPeça() {
        return numeroDaPeça; // deve validar
    }

    // obtém a descrição
    public String getdescriçãoParcial() {
        return descriçãoParcial;
    }

    // configura a quantidade
    public void setquantidade(int quantidade) {
        if (quantidade < 0) // valida quantidade
            throw new IllegalArgumentException("quantidade deve ser >= 0");

        this.quantidade = quantidade;
    }

    // obtém quantidade
    public int getquantidade() {
        return quantidade;
    }

    // configura preço por item
    public void setprecoPorItem(double precoPorItem) {
        if (precoPorItem < 0.0) // valida precoPorItem
            throw new IllegalArgumentException(
                    "Preço por item deve ser >= 0");

        this.precoPorItem = precoPorItem;
    }

    // obtém preço por item
    public double getprecoPorItem() {
        return precoPorItem;
    }

    // retorno da representação de String do objeto Invoice
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "fatura", "número da peça", getNumeroDaPeça(), getdescriçãoParcial(),
                "quantidade", getquantidade(), "preço por item", getprecoPorItem());
    }

    // método requerido para executar o contrato com a interface Payable
    @Override
    public double getValorDopagamento() {
        return getquantidade() * getprecoPorItem(); // calcula custo total
    }

    public Object getMessage() {
        return null;
    }

    
} // fim da classe Invoice