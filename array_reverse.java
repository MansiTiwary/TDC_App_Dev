import java.util.*;
public class array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TERMS");
        int n = sc.nextInt();
        System.out.println("ENTER ELEMENTS");
        int arr[] = new int[n];
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
            //Arrays.sort(arr);
        }
        System.out.println("REVERSE ORDER");
        for (int i = n-1; i >= 0; i--) {

            System.out.println(arr[i]);
        }
    }
}
