import java.util.Scanner;

public class tugas15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jmlResponden = 10;
        int jmlPertanyaan = 6;
        int[][] hasilSurvei = new int[jmlResponden][jmlPertanyaan];

        System.out.println("Masukkan rating (nilai 1-5) untuk setiap responden:");
        for (int i = 0; i < jmlResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jmlPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
                while (hasilSurvei[i][j] < 1 || hasilSurvei[i][j] > 5) {
                    System.out.print("Nilai tidak valid.");
                    hasilSurvei[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jmlResponden; i++) {
            int totalResponden = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = (double) totalResponden / jmlPertanyaan;
            System.out.printf("Responden %d: %.2f\n", (i + 1), rataRataResponden);
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jmlPertanyaan; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < jmlResponden; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = (double) totalPertanyaan / jmlResponden;

            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataRataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.printf("\nRata-rata nilai keseluruhan: %.2f\n", rataRataKeseluruhan);

        sc.close();
    }
}
