package ast;

import libs.Node;

public class PROGRAM extends Node {
    BOARD board;
    SNAKE snake;
    FRUIT fruit;

    @Override
    public void parse() {
        String nextNode = tokenizer.getAndCheckNext("start");

        while(!tokenizer.checkToken("end")) {
            switch (nextNode) {
                case "board":
                    board = new BOARD();
                    board.parse();
                    break;
                case "snake":
                    snake = new SNAKE();
                    snake.parse();
                    break;
                case "fruit":
                    fruit = new FRUIT();
                    fruit.parse();
                    break;
            }
            nextNode = tokenizer.getNext();
        }
    }

    @Override
    public String evaluate() {
        board.evaluate();
        snake.evaluate();
        fruit.evaluate();
    }
}
