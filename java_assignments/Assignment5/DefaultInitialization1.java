package yourname.assignment.singleton;

public class DefaultInitialization1 {
      String str;
    public static DefaultInitialization1 assign(String s) {
        str = s;
        return new DefaultInitialization1();
    }
      void print(){
            System.out.println(str);
        }

    public static void main(String[] args) {
        assign("vamshi");
        DefaultInitialization1 d=new DefaultInitialization1();
        d.print();

    }
}
//we cant assign or print string as static method cant access non static variables
