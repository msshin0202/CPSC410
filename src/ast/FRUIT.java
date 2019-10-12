package ast;

import com.zetcode.Snake;
import libs.Node;

import java.awt.*;

public class FRUIT extends Node {
    private COLOR color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("fruit");
        tokenizer.getAndCheckNext("fcolor");
        color = new COLOR();
        color.parse();
    }

    @Override
    public String evaluate() {
        Snake.board.setAppleLoc(color.evaluate());
        return null;
    }
}
