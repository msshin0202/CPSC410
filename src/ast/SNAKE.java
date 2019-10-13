package ast;

import libs.BoundaryCheckException;
import libs.Node;

import static com.zetcode.Snake.board;

public class SNAKE extends Node {
    private COLOR headColor;
    private COLOR bodyColor;
    private int size = 0;
    private int speed = 0;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("snake");
        tokenizer.getAndCheckNext("headcolor");
        headColor = new COLOR();
        headColor.parse();
        tokenizer.getAndCheckNext("bodycolor");
        bodyColor = new COLOR();
        bodyColor.parse();
        tokenizer.getAndCheckNext("size");
        size = Integer.parseInt(tokenizer.getNext());
        tokenizer.getAndCheckNext("speed");
        speed = Integer.parseInt(tokenizer.getNext());
    }

    @Override
    public String evaluate() {
        board.setHeadLoc(headColor.evaluate());
        board.setBodyLoc(bodyColor.evaluate());

        boundaryCheck();
        speed = (board.getB_WIDTH() + board.getB_HEIGHT())/2/speed;
        board.setDELAY(speed);
        board.setDots(size);

        return null;
    }

    public void boundaryCheck() {
        if (speed >= 100 || speed <= 1) {
            throw new BoundaryCheckException(speed, "snake");
        }
    }
}
