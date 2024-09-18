import java.util.Scanner;
public class rparalel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r1, r2, r3, rTotal;

        System.out.print("masukkan nilai r1: ");
        r1 = input.nextDouble();
        System.out.print("masukkan nilai r2: ");
        r2 = input.nextDouble();
        System.out.print("masukkan nilai r3: ");
        r3 = input.nextDouble();
        rTotal = 1/((1/r1)+(1/r2)+(1/r3));
        System.out.print("rTotalnya adalah: " + rTotal);
    }
}
