import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        sc.close();
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes":"No");
        System.out.println(capitalizeLetter(A) + " " + capitalizeLetter(B)); 
    }
    
    static String capitalizeLetter(String s) {
        try {
            return s.substring(0,1).toUpperCase() + s.substring(1);
        } catch(IndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        }   
    }
}