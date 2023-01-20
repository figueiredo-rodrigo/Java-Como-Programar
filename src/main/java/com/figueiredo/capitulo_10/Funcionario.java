package com.figueiredo.capitulo_10;

// Superclasse abstrata Employee.

public abstract class Funcionario {
    private final String nome;
    private final String sobrenome;
    private final String seguroSocial;

    // construtor
    public Funcionario(String nome, String sobrenome, String seguroSocial) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.seguroSocial = seguroSocial;
    }

    // retorna o nome
    public String getnome() {
        return nome;
    }

    // retorna o sobrenome
    public String getsobrenome() {
        return sobrenome;
    }

    // retorna o número do seguro social
    public String getseguroSocial() {
        return seguroSocial;
    }

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nnúmero do seguro social: %s",
                getnome(), getsobrenome(), getseguroSocial());
    }

    // O método abstract deve ser sobrescrito pelas subclasses concretas
    public abstract double ganhos(); // nenhuma implementação aqui
} // fim da classe abstrata Employee