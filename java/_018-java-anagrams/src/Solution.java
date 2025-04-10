import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        
        for (int i = 0; i < a.length(); i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
         return true;
    }
}