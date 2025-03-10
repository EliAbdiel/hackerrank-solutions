import java.util.Scanner;

public class Solution {

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        flag = (B <= 0 || H <= 0) ? false: true;
    }

    static void areaOfParallelogram() {
        System.out.println(B * H);
    }

    public static void main(String[] args) throws Exception {
        if (flag) {
            areaOfParallelogram();
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");            
        }
    }
}
