package ast;

import com.zetcode.Snake;
import libs.Node;

public class FRUIT extends Node {
    private String color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("fruit");
        color = tokenizer.getNext();
    }

    @Override
    public String evaluate() {
        String basicLoc = Snake.board.getBasicLoc();
        // "src/resources/apple.png"
        Snake.board.setAppleLoc(basicLoc + color + ".png");
        return null;
    }
}
