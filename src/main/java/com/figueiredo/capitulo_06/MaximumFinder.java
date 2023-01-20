package com.figueiredo.capitulo_6;

// Método maximum declarado pelo programador com três parâmetros double.
import java.util.Scanner;

public class MaximumFinder {
    private static Scanner input;

    // obtém três valores de ponto flutuante e localiza o valor máximo
    public static void main(String[] args) {
        input = new Scanner(System.in);

        // solicita e insere três valores de ponto flutuante
        System.out.print("Enter three floating-point values separated by spaces: ");
        
        double number1 = input.nextDouble(); // lê o primeiro double
        double number2 = input.nextDouble(); // lê o segundo double
        double number3 = input.nextDouble(); // lê o terceiro double

        // determina o valor máximo
        double result = maximum(number1, number2, number3);

        // exibe o valor máximo
        System.out.println(result);
    }

    // retorna o máximo dos seus três parâmetros de double
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // supõe que x é o maior valor inicial

        // determina se y é maior que maximumValue
        if (y > maximumValue)
            maximumValue = y;

        // determina se z é maior que maximumValue
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }
} // fim da classe MaximumFinder
