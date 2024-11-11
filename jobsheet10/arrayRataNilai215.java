import java.util.Scanner;

public class arrayRataNilai215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[5];
        double total = 0, totLulus = 0, dtotTdkLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMhs[i] >= 70) {
                jmlLulus++;
                totLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                dtotTdkLulus += nilaiMhs[i];
            }
        }

        double rata2Lulus = totLulus / jmlLulus;
        double rata2TidakLulus = dtotTdkLulus / jmlTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        sc.close();
    }
}