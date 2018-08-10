/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class DrawingTree extends JPanel {

    static Node[] copieTab = new Node[100];
    int n = 0;

    public DrawingTree(Node[] nodes, int n) {
        copieTab = nodes.clone();
        this.n = n;
    }

    public void paintComponent(Graphics g) {
        for (int i = 0; i < n; i++) {
            g.drawOval(copieTab[i].x, copieTab[i].y, 40, 40);
            String s = String.valueOf(copieTab[i].getKey());
            g.drawString(s, copieTab[i].x + 5, copieTab[i].y + 25);
            if (copieTab[i].getRightChild() != null) {
                g.setColor(Color.red);
                g.drawLine(copieTab[i].x + 15, copieTab[i].y + 40, copieTab[i].x + 90, copieTab[i].y + 90);
            }
            if (copieTab[i].getLeftChild() != null) {
                g.setColor(Color.green);
                g.drawLine(copieTab[i].x + 15, copieTab[i].y + 40, copieTab[i].x - 50, copieTab[i].y + 90);
            }
            g.setColor(Color.black);
        }
    }
}
