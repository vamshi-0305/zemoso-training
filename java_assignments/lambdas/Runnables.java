package java_assignments.lambdas;

import java.util.concurrent.Callable;

public class Runnables {
    public void methodAcceptingRunnable(Runnable r){

    }
    public void methodAcceptingCallable(Callable c){

    }

    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println("hello,lambda");
        new Runnables().methodAcceptingRunnable(()->{
            System.out.println("Complex lambda");
            persist();
            email();


        });
        Callable callable = ()->"Hello,callable";
        new Runnables().methodAcceptingCallable(()->{
            return "hello!";
        });
    }
    private static void email(){

    }
    private static void persist(){

    }
    interface Tradable<Trade>{
        boolean check(Trade t);
    };
   // Tradable<Trade> bigTradeLambda = (trade)->trade.isBigTrade();
   // Tradable<Trade> ibmTradeLamda = (trade)->trade.getInstrument();

}
