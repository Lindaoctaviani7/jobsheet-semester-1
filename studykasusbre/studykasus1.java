
import java.util.Scanner;

public class studykasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double waktu, jarak, kecepatan;
        System.out.print("masukkan jarak: ");
        jarak = input.nextDouble();
        System.out.print("masukkan kecepatan ");
        kecepatan = input.nextDouble();
        waktu = (jarak/kecepatan)*60;

        System.out.println("Maka waktu yang diperlukan adalah " + waktu+" menit");

    }
  
}
