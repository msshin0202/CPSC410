package ui;

import ast.PROGRAM;
import com.zetcode.Snake;
import libs.Node;
import libs.Tokenizer;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<String> literals = Arrays.asList("board","width","height","snake","size","speed","fruit","lifetime","set");
        Tokenizer.makeTokenizer("input.tvar",literals);
        Node.setWriter("output.txt");

        PROGRAM p = new PROGRAM();
        p.parse();
        p.evaluate();

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });

        System.out.println("completed successfully");
        Node.closeWriter();
    }
}
