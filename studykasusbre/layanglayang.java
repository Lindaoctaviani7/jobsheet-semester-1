import java.util.Scanner;
public class layanglayang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1, d2, luas;

        System.out.print("masukkan nilai d1: ");
        d1 = input.nextDouble();
        System.out.print("masukkan nilai d2: ");
        d2 = input.nextDouble();
        luas = (1/2f*(d1*d2));

        System.out.println("maka luas layang-layangnya adalah " + luas);

    }
    
}
