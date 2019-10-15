package libs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Tokenizer {


    private static String program;
    private static List<String> literals;
    private String[] tokens;
    private int currentToken;
    private static Tokenizer theTokenizer;

    private Tokenizer(String filename, List<String> literalsList){
        literals = literalsList;
        try {
            program = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
        } catch (IOException e) {
           System.out.println("Didn't find file");
            System.exit(0);
        }
        tokenize();
    }

    private void tokenize (){
        String tokenizedProgram = program;
        tokenizedProgram = tokenizedProgram.toLowerCase();
        tokenizedProgram = tokenizedProgram.replace("\n","");
        tokenizedProgram = tokenizedProgram.replaceAll("([0-9]+)","_$1_");

        for (String s : literals){
//            tokenizedProgram = tokenizedProgram.replaceAll(s,"_"+s+"_");
            tokenizedProgram = tokenizedProgram.replace(s,"_"+s+"_");
        }
//        tokenizedProgram = tokenizedProgram.replaceAll("__","_");
        tokenizedProgram = tokenizedProgram.replaceAll("[ ]+","");
        String [] temparray=tokenizedProgram.split("[_]+");
        tokens = new String[temparray.length-1];

        System.arraycopy(temparray,1,tokens,0,temparray.length-1);
    }

    private String checkNext(){
        String token="";
        if (currentToken<tokens.length){
            token = tokens[currentToken];
        }
        else
            token="NO_MORE_TOKENS";
        return token;
    }

    public String getNext(){
        String token="";
        if (currentToken<tokens.length){
            token = tokens[currentToken];
            currentToken++;
        }
        else
            token="NULLTOKEN";
        return token;
    }


    public boolean checkToken(String regexp){
        String s = checkNext();
        return (s.matches(regexp));
    }


    public String getAndCheckNext(String regexp){
        String s = getNext();
        if (!s.matches(regexp)) {
            throw new TokenizerException(regexp);
        }
        return s;
    }

    public boolean moreTokens(){
        return currentToken<tokens.length;
    }

    public static void makeTokenizer(String filename, List<String> literals){
        if (theTokenizer==null){
            theTokenizer = new Tokenizer(filename,literals);
        }
    }

    public static Tokenizer getTokenizer(){
        return theTokenizer;
    }

}
