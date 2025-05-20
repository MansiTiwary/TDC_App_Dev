import java.sql.SQLOutput;
import java.util.*;
public class Buzz_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0 || n%10==7)
            System.out.println("IA A BUZZ NUMBER");
        else
            System.out.println("IS NOT A BUZZ NUMBER");
    }
}
