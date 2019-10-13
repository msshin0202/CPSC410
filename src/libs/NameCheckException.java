package libs;

public class NameCheckException extends RuntimeException {
    public NameCheckException(String s){
        System.out.println("NAME CHECK FAIL!!! This color not available: " + s);
        System.out.println("Available colors are: 'green', 'orange', 'red', 'yellow'");
        System.exit(0);
    }
}

