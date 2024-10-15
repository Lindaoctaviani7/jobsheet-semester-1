import java.util.Scanner;

public class Pemilihan2Percobaan215 {

    public static void main(String[] args) {
        //scanner
        Scanner absen15 = new Scanner(System.in);

        //deklarasi variabel
        String member, qris;
        int jumlah_beli, potongan = 1000, menu;
        double total_bayar = 0, diskon, harga = 0;

        //input
        System.err.println("============================");
        System.out.println("\tMenu Cafe 1A");
        System.err.println("============================");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
        System.out.println("============================");
        System.out.print("Masukkan Menu: ");
        menu = absen15.nextInt();
        System.out.print("Masukkan Jumlah: ");
        jumlah_beli = absen15.nextInt();
        absen15.nextLine();
        System.out.print("Punya Member (y/t) ? ");
        member = absen15.nextLine().toLowerCase();
        System.out.print("Apakah menggunakan Qris (y/t) ? ");
        qris = absen15.nextLine().toLowerCase();

        //controlstatement
        if (qris.equals("y")) {
            if (member.equals("y")) {
                diskon = 0.1;
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }

                //menghitung total bayar dengan diskon
                total_bayar = harga - (harga * diskon) * jumlah_beli - potongan;
            } else {
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar = harga * jumlah_beli - potongan;
            }
        } else {
            if (member.equals("y")) {
                diskon = 0.1;
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }

                //menghitung total bayar dengan diskon
                total_bayar = harga - (harga * diskon) * jumlah_beli;
            } else {
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar = harga * jumlah_beli;
            }
        }
        //output
        System.err.println("============================");
        System.out.println("\tTotal Bayar");
        System.err.println("============================");
        System.out.println("Total Bayar Sebesar " + total_bayar);
    }
}