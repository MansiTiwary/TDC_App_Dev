import java.util.*;
public class Palindrome_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = "";
        for(int i = s.length() -1;i>=0;i--){
            reversed += s.charAt(i);
        }
        if(s.equals(reversed))
            System.out.println("PALINDROME STRING");
        else
            System.out.println("NOT A PALINDROME STRING");
    }
}
