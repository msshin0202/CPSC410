package libs;

public class TokenizerException extends RuntimeException {
    public TokenizerException(String literal) {
        String errorMessage = "you did not provide value for: ";
        switch (literal) {
            case "board":
            case "snake":
            case "fruit":
                errorMessage += literal;
                break;
            case "width":
            case "height":
                errorMessage += String.format("board's %s", literal);
                break;
            case "headcolor":
            case "bodycolor":
            case "size":
            case "speed":
                errorMessage += String.format("snake's %s", literal);
                break;
            case "applecolor":
                errorMessage += String.format("fruit's %s", literal);
                break;
            default:
                errorMessage = String.format("%s is not valid at its position", literal);
                break;
        }
        System.err.println(errorMessage);
        System.exit(0);
    }
}
