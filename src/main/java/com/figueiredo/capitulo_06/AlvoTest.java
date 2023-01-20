package com.figueiredo.capitulo_06;

// Aplicativo de teste que exibe um rosto sorridente.
import javax.swing.JFrame;

public class AlvoTest {
    public static void main(String[] args) {
       
JFrame application = new JFrame();

       for(int i = 0; i<10000; i++ ){
       
         Alvo panel = new Alvo();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
        
    }}
} // fim da classe DrawSmileyTest
