package ast;

import libs.Node;

import java.util.ArrayList;
import java.util.List;

public class PROGRAM extends Node {
    private List<STATEMENT> statements = new ArrayList<>();
    BOARD board;
    SNAKE snake;
    FRUIT fruit;

    /*
    @Override
    public void parse() {
        tokenizer.getAndCheckNext("start");

        while (!tokenizer.checkToken("end")) {
            if (tokenizer.checkToken("board")) {
                board = new BOARD();
                board.parse();
            }
            if (tokenizer.checkToken("snake")) {
                snake = new SNAKE();
                snake.parse();
            }
            if (tokenizer.checkToken("fruit")) {
                fruit = new FRUIT();
                fruit.parse();
            }
        }
    }
     */

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("start");

        while (!tokenizer.checkToken("end")) {
            STATEMENT s = null;
            if (tokenizer.checkToken("board")) {
                s = new BOARD();
            } else if (tokenizer.checkToken("snake")) {
                s = new SNAKE();
            } else if (tokenizer.checkToken("fruit")) {
                s = new FRUIT();
            }
            s.parse();
            statements.add(s);
        }
    }

    @Override
    public String evaluate() {
        for (STATEMENT s: statements) {
            s.evaluate();
        }
        return null;
    }
}
