package com.figueiredo.capitulo_10;

// A classe concreta SalariedEmployee estende a classe abstrata Employee.

public class FuncionarioSalario extends Funcionario implements Pagamento {
    private double salarioSemanal;

    // construtor
    public FuncionarioSalario(String nome, String sobrenome, String seguroSocial, double salarioSemanal) {
        super(nome, sobrenome, seguroSocial);

        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException(
                    "O salário semanal deve ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // configura o salário
    public void setsalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException(
                    "O salário semanal deve ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // retorna o salário
    public double getsalarioSemanal() {
        return salarioSemanal;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double ganhos() {
        return getsalarioSemanal();
    }

    // retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString() {
        return String.format("Nome do funcionario: %s%n%s: $%,.2f",
                super.toString(), "salário semanal", getsalarioSemanal());
    }

    @Override
    public double getValorDopagamento() {
        return 0;
    }
} // fim da classe SalariedEmployee
