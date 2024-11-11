import java.util.Scanner;

public class arrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai : " + rata2);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                jmlLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus.");
            }
        }
        System.out.println("Banyaknya mahasiswa yang lulus sebanyak: " + jmlLulus);
    }
    
}
