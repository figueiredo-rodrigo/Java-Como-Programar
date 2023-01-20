package com.figueiredo.capitulo_04;

// Classe Student que armazena o nome e a média de um aluno.
public class Student {

    private String name;
    private double average;

    // construtor inicializa variáveis de instância
    public Student(String name, double average) {
        this.name = name; // atribui à variável de instância
                          
        
        if (average < 0.00)
            average = 0;
        else if (average > 100.0)
            average = 100.0;
        this.average = average;// atribui à variável de instância
    }

    // define o nome de Student
    public void setName(String name) {
        this.name = name;
    }

    // recupera o nome de Student
    public String getName() {
        return name;
    }

    // define a média de Student
    public void setAverage(double studentAverage, double average) {

    }

    // recupera a média de Student
    public double getAverage() {
        return average;
    }

    // determina e retorna a letra da nota de Student
    public String getLetterGrade() {
        String letterGrade = ""; // inicializado como uma String vazia

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
} // finaliza a classe Student