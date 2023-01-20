package com.figueiredo.capitulo_03;

// Figura 3.5: Account.java
// a classe Account com um construtor que inicializa nome e balanço.

public class Account {
    private String name; // variável de instância
    private double balance; // variável de instância

    // Construtor

    public Account(String name, double balance) // o construtor inicializa name com nome do parâmetro. O nome do
                                                // construtor é nome da classe
    {
        this.name = name; // atribui name à variável de instância name

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0

        if (balance > 0.0) // se o saldo for válido
            this.setBalance(balance); // o atribui à variável de instância balance
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo
    
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount; // o adiciona ao saldo
    }

    // Get e Set

    public String getName() // método para recuperar o nome do objeto
    {
        return name; // retorna valor do nome para o chamador
    }

    public void setName(String name) // método para definir o nome no objeto
    {
        this.name = name; // armazena o nome
    }

    public double getBalance() { // método retorna o saldo da conta ÿ
        return balance;
    }

    public void setBalance(double balance) { // método que define o nome
        this.balance = balance;
    }

} // fim da classe Account
