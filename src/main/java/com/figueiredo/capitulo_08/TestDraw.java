package com.figueiredo.capitulo_08;

// Criando um JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class TestDraw {

    public static void main(String[] args) {

        JFrame app = new JFrame();

        for(int i = 0; i<1000000; i++ ){
        DrawPanel panel = new DrawPanel();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(800, 800);
        app.setVisible(true);
        
    }}
} // fim da classe TestDraw
