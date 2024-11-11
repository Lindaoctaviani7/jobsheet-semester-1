import java.util.Scanner;

public class test315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, output;

        System.out.println("Input n: ");
        n = sc.nextInt();

        for (i=1;i<=n;i++) {
            output = i*i;

            System.out.println(output);
        }
    }
    
}
