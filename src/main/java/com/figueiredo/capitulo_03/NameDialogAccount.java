package com.figueiredo.capitulo_03;

import javax.swing.JOptionPane;

public class NameDialogAccount {

    public static void main(String[] args) {

         // Atribui valores iniciais as contas

         Account account1 = new Account("Jane Green", 50.00);
         Account account2 = new Account("John Blue", -7.53);
 
         // exibe saldo inicial de cada objeto
 
         System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
       
         // pede para o usuário inserir o valor a ser depositado na conta 1

        String depositAmount = JOptionPane.showInputDialog("Enter deposit amount for account1: ");
        double doubledepositAmount = Double.parseDouble(depositAmount);

         // Imprime o valor adicionado na conta 1

        String message = String.format("adding %.2f to account1 balance", doubledepositAmount);
        JOptionPane.showMessageDialog(null, message);
        
        // pede para o usuário inserir o valor a ser depositado na conta 2
        
        depositAmount = JOptionPane.showInputDialog("Enter deposit amount for account2: ");
        doubledepositAmount = Double.parseDouble(depositAmount);

         // Imprime o valor adicionado na conta 2

         message = String.format("adding %.2f to account2 balance", doubledepositAmount);

         JOptionPane.showMessageDialog(null, message);
        
         // adiciona o saldo as contas
                
        account1.deposit(doubledepositAmount);
        account2.deposit(doubledepositAmount); 


        message = String.format("%s balance: $%.2f %n %s balance.: $%.2f", account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance());

        JOptionPane.showMessageDialog(null, message);
 
        // exibe os saldos

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

    } // fim de main
} // termina NameDialo
