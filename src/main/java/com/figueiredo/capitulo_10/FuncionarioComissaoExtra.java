package com.figueiredo.capitulo_10;

// Classe BasePlusCommissionEmployee estende a CommissionEmployee.

public class  FuncionarioComissaoExtra extends FuncionarioComissao {
    private double salarioBase; // salário de base por semana

    // construtor
    public FuncionarioComissaoExtra(String nome, String sobrenome, String seguroSocial, double vendasBrutas, double taxaComissao, double salarioBase) {
        super(nome, sobrenome, seguroSocial, vendasBrutas, taxaComissao);

        if (salarioBase < 0.0) // valida salarioBase
            throw new IllegalArgumentException("O salário base deve ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    // configura o salário-base
    public void setsalarioBase(double salarioBase) {
        if (salarioBase < 0.0) // valida salarioBase
            throw new IllegalArgumentException("O salário base deve ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    // retorna o salário-base continua

    public double getsalarioBase() {
        return salarioBase;
    }

    // calcula os vencimentos; sobrescreve o método ganhos em FuncionarioComissao
    @Override
    public double ganhos() {
        return getsalarioBase() + super.ganhos();
    }

    // retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-assalariado", super.toString(),
                "salário base", getsalarioBase());
    }
} // fim da classe BasePlusCommissionEmployee