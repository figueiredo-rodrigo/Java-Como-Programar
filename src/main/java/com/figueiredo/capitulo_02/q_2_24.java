package com.figueiredo.capitulo_2;

// Figura 2.15: Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais 
// e operadores de igualdade.
import java.util.Scanner; // programa utiliza a classe Scanner

public class q_2_24 {
    private static Scanner input;

	// método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        input = new Scanner(System.in);

        int numero1 = 0; // primeiro número a comparar 
        int numero2 = 0; // segundo número a comparar
        int numero3 = 0; // terceiro número a comparar
        int numero4 = 0; // quarto número a comparar
        int numero5 = 0; // quinto número a comparar
        int maiorNumero = 0; 
        int menorNumero = 0;

        System.out.print("\n" + "**Inicio do programa**" + "\n\n"); // prompt

        System.out.print("Digite o primeiro numero: "); // prompt
        numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Digite o segundo numero.: "); // prompt
        numero2 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Digite o terceiro numero: "); // prompt
        numero3 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Digite o quarto numero..: "); // prompt
        numero4 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Digite o quinto numero..: "); // prompt
        numero5 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        
        //Maior numero

        if (numero1 >= numero2)
            if (numero1 >= numero3)
                if (numero1 >= numero4)
                    if (numero1 >= numero5)
                        maiorNumero = numero1;

        if (numero2 >= numero1)
            if (numero2 >= numero3)
                if (numero2 >= numero4)
                    if (numero2 >= numero5)
                        maiorNumero = numero2;

        if (numero3 >= numero1)
            if (numero3 >= numero2)
                if (numero3 >= numero4)
                    if (numero3 >= numero5)
                        maiorNumero = numero3;

        if (numero4 >= numero1)
            if (numero4 >= numero2)
                if (numero4 >= numero3)
                    if (numero4 >= numero5)
                        maiorNumero = numero4;

        if (numero5 >= numero1)
            if (numero5 >= numero2)
                if (numero5 >= numero3)
                    if (numero5 >= numero5)
                        maiorNumero = numero5;

        // Menor munero

        if (numero1 <= numero2)
            if (numero1 <= numero3)
                if (numero1 <= numero4)
                    if (numero1 <= numero5)
                        menorNumero = numero1;

        if (numero2 <= numero1)
            if (numero2 <= numero3)
                if (numero2 <= numero4)
                    if (numero2 <= numero5)
                        menorNumero = numero2;

        if (numero3 <= numero1)
            if (numero3 <= numero2)
                if (numero3 <= numero4)
                    if (numero3 <= numero5)
                        menorNumero = numero3;

        if (numero4 <= numero1)
            if (numero4 <= numero2)
                if (numero4 <= numero3)
                    if (numero4 <= numero5)
                        menorNumero = numero4;

        if (numero5 <= numero1)
            if (numero5 <= numero2)
                if (numero5 <= numero3)
                    if (numero5 <= numero4)
                        menorNumero = numero5;

        System.out.println("\n" + "Maior número: " + maiorNumero); // prompt
        System.out.println("Menor número: " + menorNumero); // prompt

        System.out.print("\n" + "**Fim do programa**"); // prompt

    } // fim do método main
} // fim da classe Comparison