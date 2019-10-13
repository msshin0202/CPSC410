package libs;

public class NameCheckException extends RuntimeException {
    public NameCheckException(String s){
        System.err.println("NAME CHECK FAIL!!! This color not available: " + s);
        System.err.println("Available colors are: 'green', 'orange', 'red', 'yellow'");
        System.exit(0);
    }
}

