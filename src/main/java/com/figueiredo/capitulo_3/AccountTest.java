package com.figueiredo.capitulo_3;

  // Entrada e saída de números de ponto flutuante com objetos Account.

import java.util.Scanner;

public class AccountTest {
    private static Scanner input;

    public static void main(String[] args) {

        // Atribui valores iniciais as contas

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // exibe saldo inicial de cada objeto

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando

        input = new Scanner(System.in);

        // Entrada de externa de dados

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        
        // Imprime o saldo das contas

        System.out.printf("%nadding %.2f to account1 balance", depositAmount);
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        
        // adiciona o saldo as contas
        
        account1.deposit(depositAmount);
        account2.deposit(depositAmount); 

        // exibe os saldos

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

    } // fim de main
} // fim da classe AccountTest
