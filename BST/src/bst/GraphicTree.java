/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class GraphicTree extends BSTVisualisation {

    static Node[] tab = new Node[100];
    static int i = 0;
    JFrame fenetre = null;
    JPanel panel = null;

    public GraphicTree() {
        fenetre = new JFrame();
        fenetre.setTitle("BST");
        fenetre.setSize(1000, 600);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
    }

    public void getReady(Node node) {
        tab[i] = node;
        i++;
        if (node.getLeftChild() != null) {
            getReady(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            getReady(node.getRightChild());
        }
    }

    public void drawTree() {
        fenetre.setContentPane(new DrawingTree(tab, howMany));
        fenetre.repaint();
        fenetre.revalidate();
        fenetre.setVisible(true);
    }
}
