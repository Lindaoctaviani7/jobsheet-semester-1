import java.util.Scanner;

public class bahanbakar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga=9000, liter;

        System.out.print("Berapa liter bensin: ");
        liter = input.nextDouble();
        harga = liter*harga;

        System.out.println("jadi harga dari " + liter + " liter bensin adalah " + harga);
    }
    
}
