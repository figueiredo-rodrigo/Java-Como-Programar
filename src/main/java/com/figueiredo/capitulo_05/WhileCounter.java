package com.figueiredo.capitulo_5;

 // Repetição controlada por contador com a instrução de repetição while.
 
  public class WhileCounter 
  {
  public static void main(String[] args) 
  { 
  int counter = 1; // declara e inicializa a variável de controleÿ
 
  while (counter <= 10) // condição de continuação do loop
  {
  System.out.printf("%d ", counter);
  ++counter; // variável de controle de incrementoÿ
  }
 
  System.out.println();
  } 
  } // fim da classe WhileCounter
