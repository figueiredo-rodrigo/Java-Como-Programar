package com.figueiredo.capitulo_8;

// Demonstração do membro static.

 public class EmployeTest
 {
 public static void main(String[] args)
 {
 // mostra que a contagem é 0 antes de criar Employees
 System.out.printf("Employees before instantiation: %d%n",
 Employe.getCount());

 // cria dois Employees; a contagem deve ser 2
 Employe e1 = new Employe("Susan", "Baker");
 Employe e2 = new Employe("Bob", "Blue"); 

 // mostra que a contagem é 2 depois de criar dois Employees
 System.out.printf("%nEmployees after instantiation:%n");
 System.out.printf("via e1.getCount(): %d%n", Employe.getCount());
 System.out.printf("via e2.getCount(): %d%n", Employe.getCount());
 System.out.printf("via Employee.getCount(): %d%n",
 Employe.getCount());

 // obtém nomes de Employees
 System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", 



 e1.getFirstName(), e1.getLastName(),
 e2.getFirstName(), e2.getLastName());
 }
 } // fim da classe EmployeeTest