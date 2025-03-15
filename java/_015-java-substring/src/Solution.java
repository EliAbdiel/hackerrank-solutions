import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        in.close();

        printSubstring(S, start, end);
    }

    static void printSubstring(String s, int start, int end) {
        try {
            System.out.println(s.substring(start, end));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}