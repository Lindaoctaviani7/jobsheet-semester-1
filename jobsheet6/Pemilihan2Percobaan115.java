package jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        Scanner absen15 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan tahun: ");
        tahun = absen15.nextInt();
        if ((tahun%4)==0) {
            if ((tahun%100)!=0) {
                System.out.println("Tahun Kabisat");
            }
            else{
                System.out.println("Bukan Tahun Kabisat");
            }
        }
        else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
