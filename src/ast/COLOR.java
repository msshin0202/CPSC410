package ast;

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
}
