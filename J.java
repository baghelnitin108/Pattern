import java.util.*;

public class J {
    public static void main(String[] args) {
        System.out.println("Print pattern");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int k = (a + 1) / 2;
            for (int j = 1; j <= a; j++) {
                if (i == 1 || j == k || (i == a && j <= k) || (j == 1 && i > k)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t ");
                }

            }
            System.out.println();
            System.out.println();
        }
    }
}