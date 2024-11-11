import java.util.Scanner;

public class gameRpg15 {
public static void main(String[] args) {
    int playerHealth, playerAttack, enemyHealth, enemyAttack, round, choice, iniTiapPlayerHealth;
    Scanner scanner = new Scanner(System.in);

         // Input data health pemain & musuh
         System.out.print("Masukkan nyawa pemain: ");
         playerHealth = scanner.nextInt();
         System.out.print("Masukkan nyawa musuh: ");
         enemyHealth = scanner.nextInt();

         // Input data attack power pemain & musuh
         System.out.print("Masukkan kekuatan serangan pemain: ");
         playerAttack = scanner.nextInt();
         System.out.print("Masukkan kekuatan serangan musuh: ");
         enemyAttack = scanner.nextInt();

         // Menyimpan nyawa awal pemain untuk kondisi kritis
         iniTiapPlayerHealth = playerHealth;
         
         // Inisialisasi ronde
         round = 1;

         // Mulai pertarungan
         while (playerHealth > 0 && enemyHealth > 0) {
             System.out.println("\n--- Ronde " + round + " ---");
            
             // Pemain menyerang musuh
             enemyHealth -= playerAttack;
             System.out.println("Pemain menyerang musuh! Nyawa musuh tersisa: " + enemyHealth);

             // Cek apakah musuh mati
             if (enemyHealth <= 0) {
                 System.out.println("Musuh telah kalah! Pemain menang!");
                 break;
             }
             // Musuh menyerang pemain
             playerHealth -= enemyAttack;
             System.out.println("Musuh menyerang pemain! Nyawa pemain tersisa: " + playerHealth);

             // Cek apakah pemain mati
             if (playerHealth <= 0) {
                 System.out.println("Pemain telah kalah! Musuh menang!");
                 break;
             }

             // Cek kondisi kritis
             if (playerHealth <= 0.2*iniTiapPlayerHealth) {
                 System.out.println("Pemain berada dalam kondisi kritis!");
                 System.out.println("Apakah anda ingin melarikan diri? ");
                 System.out.print("(1. ya)");
                 System.out.print("(2. tidak): ");
                 choice = scanner.nextInt();

                 if (choice == 1) {
                     System.out.println("Pemain melarikan diri! Pertarungan selesai.");
                     break;
                 } else if (choice == 2) {
                     System.out.println("Pemain memilih untuk terus bertarung.");
                 } else {
                     System.out.println("Pilihan tidak valid, pemain terus bertarung.");
                 }
             }

             // Increment ronde
             round++;
         }

         scanner.close();
     }
 }