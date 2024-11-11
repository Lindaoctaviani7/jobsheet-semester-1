import java.util.Scanner;

public class TugasNilai15 {
    public static void main (String[] args) {
//sum buat  nambahin semua nilai
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
    int jumlahMahasiswa = sc.nextInt();

    int[] nilaiMahasiswa = new int[jumlahMahasiswa];
    int totalNilai = 0;

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiMahasiswa[i] = sc.nextInt();
        totalNilai += nilaiMahasiswa[i];
    }

    double rataRata = (double) totalNilai / jumlahMahasiswa;

    int nilaiTertinggi = nilaiMahasiswa[0];
    int nilaiTerendah = nilaiMahasiswa[0];

    for (int i = 1; i < jumlahMahasiswa; i++) {
        if (nilaiMahasiswa[i] > nilaiTertinggi) {
            nilaiTertinggi = nilaiMahasiswa[i];
        }
        if (nilaiMahasiswa[i] < nilaiTerendah) {
            nilaiTerendah = nilaiMahasiswa[i];
        }
    }

    System.out.println("Daftar Nilai Mahasiswa:");
    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
    }

        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        sc.close();
    }
}   
       