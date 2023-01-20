package com.figueiredo.capitulo_04;

// Cria e testa objetos Student.
public class StudentTest {

    public static void main(String[] args) {

        // Atribui valores iniciais as contas
        Student account1 = new Student("Jane Green", -1.00);
        Student account2 = new Student("John Blue", 10000);

        // Imprime nota e letra dos alunos
        System.out.printf("%s's - avarege: %.2f - letter grade is: %s%n", account1.getName(), account1.getAverage(), account1.getLetterGrade());
        System.out.printf("%s's - avarege: %.2f - letter grade is: %s%n", account2.getName(), account2.getAverage(), account2.getLetterGrade());
        
    } // fim do método main
} // fim da classe StudentTest