package libs;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
