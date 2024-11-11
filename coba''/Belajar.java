import java.util.Scanner;


public class Belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil [] = new int[9];
        bil [6] = 988;
        
        for (int i=3; i<5; i+=1){
            System.out.print("Masukkan Nilai ke " + i + " = ");
            bil[i] = input.nextInt();
        }

        System.out.print("Masukkan Nilai ke 8 = ");
            bil[8] = input.nextInt();

        for (int i=0; i<=8; i++){
            System.out.print("Nilai ke " + i + " adalah ");
            System.out.println(bil[i]);
        }
    }
}
