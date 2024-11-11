import java.util.Scanner;

public class siakad152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.printf("Nilai rata-rata mahasiswa ke-%d: %.2f%n", (i + 1), (totalPerSiswa / jumlahMataKuliah));
            System.out.println("\n==================================");
        }

        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.printf("Mata Kuliah %d: %.2f%n", (j + 1), (totalPerMatkul / jumlahMahasiswa));
        }

        sc.close();
    }
}
