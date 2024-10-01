import java.util.Scanner;
public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiKuis, nilaiTugas, nilaiUjian, nim, nomorAbsen;
        double nilaiAkhir;
        String nama, kualifikasi = null, nilaiHuruf = null;
        char kelas;

        System.out.print("masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("masukkan nim: ");
        nim = sc.nextInt();
        System.out.print("masukkan kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("masukkan nomor absen: ");
        nomorAbsen = sc.nextInt();
        System.out.print("masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("masukkan nilai Ujian: ");
        nilaiUjian = sc.nextInt();
        System.out.print("Mahasiswa dengan nama " + nama + "NIM " + nim + "kelas " + kelas + " nomor absen " + nomorAbsen);
        
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUjian)/3;

        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
            nilaiHuruf = "A" ;
            kualifikasi = "Sangat Baik";    
        }
        else if (nilaiAkhir >= 73 && nilaiAkhir <= 80 ){
            nilaiHuruf =  "B+" ;
            kualifikasi = "Lebih dari Baik ";
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 73 ){
            nilaiHuruf = "B" ;
            kualifikasi = "Baik" ;
        }

        System.out.println("nilai akhir: " + nilaiAkhir);
        System.out.println("nilai akhir huruf: "+ nilaiHuruf);
        System.out.println("kualifikasi: " + kualifikasi);
    }
}
