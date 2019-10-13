package ast;

import com.zetcode.Snake;
import libs.BoundaryCheckException;
import libs.Node;

public class BOARD extends Node {
    public int height;
    public int width;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("board");
        for (int i = 0; i < 2; i++){
            if (tokenizer.checkToken("width")) {
                tokenizer.getAndCheckNext("width");
                width = Integer.parseInt(tokenizer.getNext());
            }
            if (tokenizer.checkToken("height")) {
                tokenizer.getAndCheckNext("height");
                height = Integer.parseInt(tokenizer.getNext());
            }
        }
    }

    @Override
    public String evaluate() {
        Snake.board.setB_HEIGHT(height);
        Snake.board.setB_WIDTH(width);
        boundaryCheck();
        return null;
    }

    public void boundaryCheck() {
        if (height > 1000 || height < 100) {
            throw new BoundaryCheckException(height, "height");
        }
        if (width > 1000 || width < 100) {
            throw new BoundaryCheckException(width, "width");
        }
    }
}
