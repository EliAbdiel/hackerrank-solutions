import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        StringBuilder s = new StringBuilder(A);
        String S = String.valueOf(s.reverse());
        String result = (A.equalsIgnoreCase(S)) ? "Yes": "No";
        System.out.println(result);
        sc.close();
    }
}