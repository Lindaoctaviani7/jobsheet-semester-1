import java.util.Scanner;

public class test215 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, kali=1;

        System.out.println("input n: ");
        n = sc.nextInt();

        for (i=1;i<=n;i++) {
            i = kali*n;

        }
        System.out.println(i);
    }
    
}
