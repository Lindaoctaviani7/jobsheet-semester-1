import java.util.Scanner;
public class pemilihanbilangan15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nomor: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("hasil " + angka + " termasuk bilangan " + hasil);
        
    }
}
