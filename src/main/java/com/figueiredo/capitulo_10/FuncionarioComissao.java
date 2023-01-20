package com.figueiredo.capitulo_10;

// Classe CommissionEmployee estende Employee.

public class FuncionarioComissao extends Funcionario {
    private double vendasBrutas; // vendas brutas semanais
    private double taxaComissao; // porcentagem da comissão

    // construtor
    public FuncionarioComissao(String nome, String sobrenome, String seguroSocial, double vendasBrutas, double taxaComissao) {
        super(nome, sobrenome, seguroSocial);

        if (taxaComissao <= 0.0 || taxaComissao >= 1.0) // valida
            throw new IllegalArgumentException(
                    "A taxa de comissão deve ser > 0.0 e < 1.0");

        if (vendasBrutas < 0.0) // valida
            throw new IllegalArgumentException("As vendas brutas devem ser >= 0.0");
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    // configura a quantidade de vendas brutas
    public void setvendasBrutas(double vendasBrutas) {
        if (vendasBrutas < 0.0) // valida
            throw new IllegalArgumentException("As vendas brutas devem ser >= 0.0");

        this.vendasBrutas = vendasBrutas;
    }

    // retorna a quantidade de vendas brutas
    public double getvendasBrutas() {
        return vendasBrutas;
    }

    // configura a taxa de comissão
    public void settaxaComissao(double taxaComissao) {
        
        if (taxaComissao <= 0.0 || taxaComissao >= 1.0) // valida
            throw new IllegalArgumentException(
                    "A taxa de comissão deve ser > 0.0 e < 1.0");

        this.taxaComissao = taxaComissao;
    }

    // retorna a taxa de comissão
    public double gettaxaComissao() {
        return taxaComissao;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double ganhos() {
        return gettaxaComissao() * getvendasBrutas();
    }

    // retorna a representação String do objeto CommissionEmployee
    @Override

    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "Funcionário comissionado", super.toString(),
                "vendas brutas", getvendasBrutas(),
                "Taxa de comissão", gettaxaComissao());
    }
} // fim da classe CommissionEmployee
