import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        getSmallestAndLargest(s, k);
    }

    static void getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (smallest.compareTo(current) > 0) {
                smallest = current;
            }
            if (largest.compareTo(current) < 0) {
                largest = current;
            }
        }
        
        System.out.println(smallest + "\n" + largest);
    }
}