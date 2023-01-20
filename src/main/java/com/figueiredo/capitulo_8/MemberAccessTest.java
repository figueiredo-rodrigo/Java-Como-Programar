package com.figueiredo.capitulo_8;

// Membros privados da classe Time1 não são acessíveis.
public class MemberAccessTest {
    public static void main(String[] args) {
        // cria e inicializa um objeto Time1
        Time1 time = new Time1(); // invoca o construtor Time1

        time.setTime(7,15,30);

        System.out.println(time);
        
 // time.hour = 7; // erro: hour tem acesso privado em Time1 
 // time.minute = 15; // erro: minute tem acesso privado em Time1
 // time.second = 30; // erro: second tem acesso privado em Time1
 }
} // fim da classe MemberAccessTest
