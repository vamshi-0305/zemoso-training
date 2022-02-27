package java_assignments.lambdas;

public class TargetType {
    public interface Email{
        String construcEmail(String name);

    }
    Email email =(String name)->name+"vamshimudhiraj0305@gmail.com";
    public String getEmail(String name,Email email){
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("vamshi",(String name)->name+"vamshimudhiraj0305@gmail.com");
    }
}
