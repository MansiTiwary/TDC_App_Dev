import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i = 2;i<n;i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
            System.out.println();
    }
}
