import java.util.Scanner;

public class bioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:\n1. Input data penonton\n2. Tampilkan daftar penonton\n3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input tidak valid! Masukkan baris (1-4) dan kolom (1-2).");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (String[] row : penonton) {
                    for (String seat : row) {
                        System.out.print((seat != null ? seat : "*") + "\t");
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                sc.close();
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
       