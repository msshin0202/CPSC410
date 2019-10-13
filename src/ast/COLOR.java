package ast;

import libs.NameCheckException;
import libs.Node;

public class COLOR extends STATEMENT {
    String color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("set");
        color = tokenizer.getNext();
    }

    @Override
    public String evaluate() {
        return color;
    }

    @Override
    public void nameCheck() {
        if (!Node.colorSet.contains(color)) {
            throw new NameCheckException(color);
        }
    }

    @Override
    public void typeCheck() {

    }
}
