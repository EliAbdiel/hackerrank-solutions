import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        tokens(s);
    }

    static void tokens(String s) {
        String[] parts = s.trim().split("[\\s+!,?._'@]+");
        int length = parts.length;
        if (length == 1 && parts[0].equals("")) {
            System.out.println(0);    
        } else {
            System.out.println(length);
            for(String part: parts) {
                System.out.println(part);
            }
        }
    }
}