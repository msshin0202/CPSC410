package libs;

public class BoundaryCheckException extends RuntimeException {
    public BoundaryCheckException(Integer i){
        System.out.println("BOUNDARY CHECK FAIL!!! This value is out of bound: " + i);
        System.exit(0);
    }
}
