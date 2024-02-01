package QueueAndStack;

public class RangeException extends Exception{
    public RangeException(String message) {
        super(message);
        System.out.println("Yanlış aralık");
    }
}
