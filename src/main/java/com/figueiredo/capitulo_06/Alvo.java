package com.figueiredo.capitulo_6;

// Desenhando um rosto sorridente com cores e formas preenchidas.
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Alvo extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int x = 10,
                y = 10,
                w = 200,
                h = 200;

        SecureRandom randomNumbers = new SecureRandom();

        // seleciona o inteiro aleatório entre 0 e 255
        int R = 0 + randomNumbers.nextInt(255);
        int G = 0 + randomNumbers.nextInt(255);
        int B = 0 + randomNumbers.nextInt(255);

        int R1 = 0 + randomNumbers.nextInt(255);
        int G1 = 0 + randomNumbers.nextInt(255);
        int B1 = 0 + randomNumbers.nextInt(255);

        Color color0 = new Color(R, G, B);
        Color color1 = new Color(R1, G1, B1);

        // desenha os círculos
        g.setColor(color0);
        g.fillOval(x, y, w, h);

        g.setColor(color1);
        g.fillOval(30, 30, w - 40, h - 40);

        g.setColor(color0);
        g.fillOval(x + 40, y + 40, w - 80, h - 80);

        g.setColor(color1);
        g.fillOval(70, 70, w - 120, h - 120);

        g.setColor(color0);
        g.fillOval(x + 80, y + 80, w - 160, h - 160);

        g.setColor(Color.BLACK);
        g.fillOval(x + 95, y + 95, w - 190, h - 190);

    }
} // fim da classe DrawSmiley
