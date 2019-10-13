package ast;

import libs.NameCheckException;
import libs.Node;

public class COLOR extends Node {
    String color;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("set");
        color = tokenizer.getNext();
    }

    @Override
    public String evaluate() {
        nameCheck();
        return color;
    }

    public void nameCheck() {
        if (!colorSet.contains(color)) {
            throw new NameCheckException(color);
        }
    }
}
