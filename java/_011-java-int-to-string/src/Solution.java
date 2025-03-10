import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = null;
        boolean flag = true;

        while(flag) {
            try {
                n = in .nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next();
            }
        }

        in.close();

        String s = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}