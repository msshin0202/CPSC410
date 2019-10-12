package com.zetcode;

import ast.PROGRAM;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {
    public static Board board = new Board();

    public static Board board = new Board();

    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(board);
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        PROGRAM program = new PROGRAM();
        program.parse();
        program.evaluate();
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
