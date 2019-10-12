package ast;

import libs.Node;

public class PROGRAM extends Node {
    BOARD board;
    SNAKE snake;
    FRUIT fruit;

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

    @Override
    public String evaluate() {
        board.evaluate();
        snake.evaluate();
        fruit.evaluate();
        return null;
    }
}
