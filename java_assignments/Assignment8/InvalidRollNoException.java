package java_assignments;

public class InvalidRollNoException extends Exception{
    @Override
    public String toString() {
        return "Invalid RollNo.exceeds limit";
    }
}
