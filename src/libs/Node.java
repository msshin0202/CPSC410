package libs;

import java.util.*;

public abstract class Node {

    public static Set<String> colorSet = new HashSet<String>() {{
        add("green");
        add("orange");
        add("red");
        add("yellow");
    }};
    // public static Set<String> colorSet = new HashSet<>(Arrays.asList("green", "orange", "red", "yellow"));
    protected static Tokenizer tokenizer = Tokenizer.getTokenizer();

    abstract public void parse();
    abstract public String evaluate();
    abstract public void nameCheck();
    abstract public void typeCheck();
}
