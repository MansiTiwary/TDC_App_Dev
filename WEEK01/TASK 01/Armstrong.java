import java.util.*;
//153 = 1^3+5^3+6^3 is equal to the number
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3); // since you're checking for 3-digit Armstrong
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " IS AN ARMSTRONG NUMBER");
        else
            System.out.println(n + " IS NOT AN ARMSTRONG NUMBER");
    }
}
