//package quiz;
import java.util.Scanner;
public class Bahanbakar15 {
        public static void main (String args[]){
            //definisi tipe data
            float perkotaan = 0.5f, tol = 0.3f, pegunungan = 0.7f, durasi_kota, durasi_gunung, durasi_tol,kecepatan_kota, kecepatan_tol, kecepatan_gunung, kapasitas_mesin, target_bbm;
           
            //deklarasi input
            Scanner input = new Scanner (System.in);
            
            //input kecepatan kota
            System.out.print("Kecepatan kendaraan kota: ");
            kecepatan_kota = input.nextFloat();
            //input kecepatan tol
            System.out.print("Kecepatan kendaraan tol: ");
            kecepatan_tol = input.nextFloat();
            //input kecepatan gunung
            System.out.print("Kecepatan kendaraan gunung: ");
            kecepatan_gunung = input.nextFloat();
            //input durasi lewat kota
            System.out.print("Durasi perjalanan lewat kota: ");
            durasi_kota = input.nextFloat();
            //input durasi lewat tol
            System.out.print("Durasi perjalanan lewat tol: ");
            durasi_tol = input.nextFloat();
            //input durasi lewat gunung
            System.out.print("Durasi perjalanan lewat gunung: ");
            durasi_gunung = input.nextFloat();
            //input kapasitas mesin
            System.out.print("Kapasitas mesin: ");
            kapasitas_mesin = input.nextFloat();
            // input target harian
            System.out.print("Target harian: ");
            target_bbm = input.nextFloat();
            
            // konsumsi bahan bakar di kota
            float konsum_kota = ((kecepatan_kota * durasi_kota / 100) * kapasitas_mesin * perkotaan);
            // hitung jarak kota
            float jarak_kota = (kecepatan_kota * durasi_kota);
           
            // konsumsi bahan bakar di pegunungan
            float konsum_pegunungan = ((kecepatan_gunung * durasi_gunung / 100) * kapasitas_mesin * pegunungan);
            // hitung jarak gunung
            float jarak_gunung = (kecepatan_gunung * durasi_gunung);
           
            // konsumsi bahan bakar di tol
            float konsum_tol = ((kecepatan_tol * durasi_tol / 100) * kapasitas_mesin * tol);
            // hitung jarak tol
            float jarak_tol = (kecepatan_tol * durasi_tol);
            
            // hitung total konsumsi
            float total_jarak = (jarak_gunung + jarak_kota + jarak_tol);
           
            // total konsumsi bahan bakar
            float total_konsum = (konsum_kota + konsum_pegunungan + konsum_tol);
            
            // rata rata
            float rata = (total_konsum / total_jarak);
            
            // persentase
            float persentase = ((total_konsum/target_bbm) * 100);

            // Output 
            System.out.println("Konsumsi BBM Kota: " + konsum_kota);
            System.out.println("Konsumsi BBM Gunung: " + konsum_pegunungan);
            System.out.println("Konsumsi BBM Tol: " + konsum_tol);
            System.out.println("Total Konsumsi bahan bakar: " + total_konsum);
            System.out.println("Rata Rata: " + rata);
            System.out.println("Persentase: " + persentase + "%");
    }
}