import java.util.Scanner;

public class pembayaranParkir15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasiTotal=0, durasiParkir;
        double totalPembayaran, biaya;

        System.out.print("Program hitung pembayaran parkir");
        System.out.print("Masukkan jenis kendaraan, 1 untuk mobil, 2 untuk motor, dan 0 untuk keluar");

        while (true) {
            System.out.print("Jenis kendaraan (1/2/0): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }
            System.out.print("Durasi parkir (jam): ");
            durasiParkir = sc.nextInt();

            if (durasiParkir <= 0) {
                System.out.println("Durasi tidak valid, harus lebih dari 0 jam.");
                continue;
            }
            if (durasiParkir > 5) {
                biaya = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    biaya = 3000*durasiParkir;
                } else if (jenisKendaraan == 2) {
                    biaya = 2000*durasiParkir;
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }
            totalPembayaran += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
        }   
        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
    
}
