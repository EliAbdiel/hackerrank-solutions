import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNextLine()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }
}
