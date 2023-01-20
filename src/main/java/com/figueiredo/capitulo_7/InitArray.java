package com.figueiredo.capitulo_7;

// Inicializando os elementos de um array como valores padrão de zero.

public class InitArray {
    public static void main(String[] args) {
        int total0 = 0,
                total1 = 0,
                total2 = 0,
                totalLinha = 0,
                Dez = 10;

        final int ARRAY_LENGTH = Dez; // declara constante

        // declara array variável e o inicializa com um objeto array
        int[] array0 = new int[Dez],
                array1 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 },
                array2 = new int[ARRAY_LENGTH];

        System.out.printf("%s%8s%8s%8s%8s%n", "Index", "Value", "Value", "Value", "Total"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array0.length; counter++) { // retorna "counter" para o array0, array1, array2,

            for (int counter2 = 0; counter2 < array2.length; counter2++) { // retorna "counter" para "2 + 2 * counter2"

                array2[counter2] = 2 + 2 * counter2;
            }
            // soma ...
            total0 += array0[counter]; // da coluna 1
            total1 += array1[counter]; // da coluna 2
            total2 += array2[counter]; // da coluna 3
            totalLinha = array0[counter] + array1[counter] + array2[counter]; // da limha

            System.out.printf("%5d%8d%8d%8d%8d%n", counter, array0[counter], array1[counter], array2[counter], // imprime as linhas da tabela
                    totalLinha); // imprime os valores dos arays

        }
        System.out.printf("%s%8s%8s%8d%8d%n", "Total", total0, total1, total2, (total0 + total1 + total2)); // rodapé Total
                                                                                                            
    } // fim do metodo main
} // fim da classe InitArray
