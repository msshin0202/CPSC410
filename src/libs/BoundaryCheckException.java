package libs;

public class BoundaryCheckException extends RuntimeException {
    public BoundaryCheckException(Integer i, String str){
        System.out.println("BOUNDARY CHECK FAIL!!! This value is out of bound: " + i);

        if (str.equals("snake")) {
            System.out.println("Snake's speed should be in range [1,100]");
        } else if (str.equals("height")) {
            System.out.println("Height should be in range [100,1000]");
        } else if (str.equals("width")) {
            System.out.println("Width should be in range [100,1000]");
        }

        System.exit(0);
    }
}
