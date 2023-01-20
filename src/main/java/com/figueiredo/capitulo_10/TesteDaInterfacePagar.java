package com.figueiredo.capitulo_10;

// Programa de teste da interface Payable que processa Invoices e 
// Employees polimorficamente.
public class TesteDaInterfacePagar {
    public static void main(String[] args) {
        // cria array Payable de quatro elementos
        Pagamento[] objetosParaPagamento = new Pagamento[4];

        // preenche o array com objetos que implementam Payable
        objetosParaPagamento[0] = new Fatura("01234", "assento", 2, 375.00);
        objetosParaPagamento[1] = new Fatura("56789", "pneu", 4, 79.95);
        objetosParaPagamento[2] = new FuncionarioSalario("John", "Smith", "111-11-1111", 800.00);
        objetosParaPagamento[3] = new FuncionarioSalario("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.printf("%n%s%n","Faturas e funcionários processados polimorficamente:");

        // processa genericamente cada elemento no array objetosParaPagamento
        for (Pagamento valorDopagamento : objetosParaPagamento) {
            // gera saída de valorDopagamento e sua quantia de pagamento apropriado
            System.out.printf("%n%s %n%s: $%,.2f%n", valorDopagamento.toString(), // poderia invocar implicitamente continua

                    "pagamento devido", valorDopagamento.getValorDopagamento());
        }
    } // fim de main
} // fim da classe PayableInterfaceTest
