package ast;

import libs.Node;

import static com.zetcode.Snake.board;

public class SNAKE extends Node {
    private String headColor = "";
    private String bodyColor = "";
    private int size = 0;
    private int speed = 0;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("snake");
        tokenizer.getAndCheckNext("set");
        headColor = tokenizer.getNext();
        tokenizer.getAndCheckNext("set");
        bodyColor = tokenizer.getNext();
        tokenizer.getAndCheckNext("size");
        size = Integer.parseInt(tokenizer.getNext());
        tokenizer.getAndCheckNext("speed");
        speed = Integer.parseInt(tokenizer.getNext());
    }

    @Override
    public String evaluate() {
        board.setHeadLoc(headColor);
        board.setBodyLoc(bodyColor);
        board.setDELAY(speed);
        board.setDots(size);

        return null;
    }
}
