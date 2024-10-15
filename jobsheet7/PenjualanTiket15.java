import java.util.Scanner;

public class PenjualanTiket15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0, hargaTiket = 50000;
        double totalPenjualanTiketHariIni = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau 0 untuk keluar): ");

            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silahkan masukkan jumlah yang valid");
                continue;
            } 
            if  (jumlahTiket == 0) {
                break;
            }
            double totalHarga = jumlahTiket*hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }

            totalPenjualanTiketHariIni += totalHarga;
            totalTiket += jumlahTiket;

            System.out.println("Total harga untuk " + jumlahTiket + "Tiket: Rp " + totalHarga);
        }

        System.out.println("\nTotal tiket terjual hari ini: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalPenjualanTiketHariIni);
    }
}
