package ast;

import com.zetcode.Snake;
import libs.Node;

import java.awt.*;

public class FRUIT extends Node {
    private COLOR color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("fruit");
        color = new COLOR();
        color.parse();
    }

    @Override
    public String evaluate() {
        String basicLoc = Snake.board.getBasicLoc();
        // "src/resources/apple.png"
        Snake.board.setAppleLoc(basicLoc + color.evaluate() + ".png");
        return null;
    }
}
