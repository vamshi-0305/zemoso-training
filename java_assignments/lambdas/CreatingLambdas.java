//package java_assignments.lambdas;
//
//public class CreatingLambdas {
//    interface Greeting{
//        public String sayHello(String g);
//    }
//    public void testGreeting(String a,Greeting g){
//        String result =g.sayHello(a);
//        System.out.println("Result:"+result);
//    }
//
//    public static void main(String[] args) {
//        //creating lambda expression which provides implementation for functional interface Greeting
//        new CreatingLambdas().testGreeting("Vamshi",(String s)->"Hello,"+s);
//        new CreatingLambdas().testGreeting("krishna",(String s)->"Hello,"+s);
//        new CreatingLambdas().testGreeting(" ",(String p)->!p.isEmpty()?"Howdy,"+p:"did u forget something");
//
//
//    }
//}
//
