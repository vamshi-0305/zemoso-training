package java_assignments;

public class InvalidNameException extends Exception{
    @Override
    public String toString() {
        return "Name not valid";
    }
}
