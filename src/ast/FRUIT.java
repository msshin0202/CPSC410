package ast;

import com.zetcode.Snake;
import libs.Node;

public class FRUIT extends Node {
    private COLOR color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("fruit");
        tokenizer.getAndCheckNext("applecolor");
        color = new COLOR();
        color.parse();
    }

    @Override
    public String evaluate() {
        Snake.board.setAppleLoc(color.evaluate());
        return null;
    }
}
