package com.figueiredo.capitulo_07;

// Aplicativo de teste para exibir um arco-íris.
import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
} // fim da classe DrawRainbowTest
