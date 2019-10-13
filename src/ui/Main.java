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

import static com.zetcode.Snake.board;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<String> literals = Arrays.asList("start", "board", "width", "height", "snake","headcolor", "bodycolor",
                "size", "speed", "fruit", "applecolor", "set", "end");
        Tokenizer.makeTokenizer("input.snake",literals);
        PROGRAM p = new PROGRAM();
        p.parse();
        p.evaluate();
        board.setBoard();


        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });

        System.out.println("completed successfully");
    }
}
