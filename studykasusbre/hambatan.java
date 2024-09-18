import java.util.Scanner;
public class hambatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1, r2, r3, rTotal;

        System.out.print("masukkan nilai r1: ");
        r1 = input.nextInt();
        System.out.print("masukkan nilai r2: ");
        r2 = input.nextInt();
        System.out.print("masukkan nilai r2: ");
        r3 = input.nextInt();
        rTotal = r1+r2+r3;

        System.out.println("maka hambatan totalnya adalah " + rTotal);

    }
    
}
