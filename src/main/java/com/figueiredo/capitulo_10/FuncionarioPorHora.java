package com.figueiredo.capitulo_10;

// Classe HourlyEmployee estende Employee.

public class FuncionarioPorHora extends Funcionario {
    private double salario; // salário por hora
    private double horas; // horas trabalhadas durante a semana

    // construtor
    public FuncionarioPorHora(String nome, String sobrenome, String seguroSocial, double salario, double horas) {
        super(nome, sobrenome, seguroSocial);

        if (salario < 0.0) // valida remuneração
            throw new IllegalArgumentException(
                    "Salario por hora deve ser >= 0.0");

        if ((horas < 0.0) || (horas > 168.0)) // valida horas
            throw new IllegalArgumentException(
                    "horas trabalhadas deve ser >= 0.0 and <= 168.0");

        this.salario = salario;
        this.horas = horas;
    }

    // configura a remuneração
    public void setsalario(double salario) {
        if (salario < 0.0) // valida remuneração
            throw new IllegalArgumentException(
                    "Salario por hora deve ser >= 0.0");

        this.salario = salario;
    }

    // retorna a remuneração
    public double getsalario() {
        return salario;
    }

    // configura as horas trabalhadas
    public void sethoras(double horas) {
        if ((horas < 0.0) || (horas > 168.0)) // valida horas
            throw new IllegalArgumentException(
                    "horas trabalhadas deve ser >= 0.0 and <= 168.0");

        this.horas = horas;
    }

    // retorna as horas trabalhadas
    public double gethoras() {
        return horas;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double ganhos() {
        if (gethoras() <= 40) // nenhuma hora extra
            return getsalario() * gethoras();
        else
            return 40 * getsalario() + (gethoras() - 40) * getsalario() * 1.5;
    }

    // retorna a representação de String do objeto HourlyEmployee
    @Override
    public String toString() {
        return String.format("Funcionário por hora: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "salario por hora", getsalario(),
                "Horas trabalhadas", gethoras());
    }
} // fim da classe HourlyEmployee