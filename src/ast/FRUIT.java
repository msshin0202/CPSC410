package ast;

import com.zetcode.Snake;

public class FRUIT extends STATEMENT {
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

    @Override
    public void nameCheck() {

    }

    @Override
    public void typeCheck() {

    }
}
