package java_assignments;
 import java.util.*;

public class Assignment2 {
    public static boolean checkStirng(String s){
        int index=0;
        String sl=s.toLowerCase();
        boolean []visited=new boolean [26];
        for(int i=0;i<sl.length();i++){
            if('a'<=sl.charAt(i)&&sl.charAt(i)<='z'){
                index=s.charAt(i)-'a';
            }
            visited[index]=true;

        }
        for(int j=0;j<26;j++){
            if(!visited[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStirng("vamshi krishna"));
    }
}
