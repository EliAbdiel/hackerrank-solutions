import java.util.Scanner;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        init(N);
    }
    
    static void init(int n) {
        if (n%2 != 0) {
            print("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                print("Not Weird");
            } else if (n >= 6 && n <= 20) {
                print("Weird");
            } else {
                print("Not Weird");
            }
        }
    }
    
    static void print(String s) {
        System.out.println(s);
    }
}
