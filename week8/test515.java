import java.util.Scanner;

public class test515 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil=3, i, n;

        System.out.println("Input n: ");
        n = sc.nextInt();

        for (i=1; bil<=n;) {
            System.out.println(bil);
            bil = bil+i;
            i=i+2;
        }
    }
    
}
