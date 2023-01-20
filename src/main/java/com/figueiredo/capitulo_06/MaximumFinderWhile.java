package com.figueiredo.capitulo_06;

// A classe test define o maior e menor valor da entrada de dados.
import java.util.Scanner;

public class MaximumFinderWhile {
    private static Scanner input;

    public static void main(String[] args) {

        double recebeImput = 0,
                maiorValor = 0,
                menorValor = 0;
        int contador = 0; // variavel do while

        input = new Scanner(System.in); // variavel para o 

        System.out.printf("%n%s%n%s%n%s%n%n%s", // imprime as informações iniciais
                "***Inicio do programa***",
                "Para encerrar no UNIX/Linux/Mac OS X <Ctrl> d e pressione Enter",
                "Para encerrar no Windows <Ctrl> z e pressione Enter",
                "Enter nuber: ");

        while (input.hasNext()) { // faz loop até o usuário inserir o indicador de fim do arquivo

            System.out.print("Enter nuber: ");

            recebeImput = input.nextDouble(); // lê a nota

            if (contador == 0) { // atibui o valor inicial do maior e menor valor
                menorValor = recebeImput;
                maiorValor = recebeImput;
            }

            if (recebeImput >= maiorValor) // define o maior valor
                maiorValor = recebeImput;

            if (recebeImput <= menorValor) // define o menor valor
                menorValor = recebeImput;

            ++contador; // incrementa em 1
        } // fim do while

        System.out.printf("%n***Resutado***%n%nMaior: %.2f%n", maiorValor); // imprime resultado do amior valor
        System.out.printf("Menor: %.2f%n%n", menorValor); // imprime resultado do menor valor

    } // fim de main
} // finalza a classe Test