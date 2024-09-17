import java.util.Scanner; 
public class Gajibulanan {
    public static void main(String[] args) {
     
        //1.variabel
        int jumlahJam, upahPerJam;
        float persenBonus = (float)0.1, persenPajak = 0.05f;

        //2.input
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam: ");
        jumlahJam = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = sc.nextInt();

        //3.eksekusi
        int totalGaji = jumlahJam*upahPerJam;
        float bonus = persenBonus*totalGaji;
        int totalGajiPlusBonus = totalGaji+(int)bonus;
        float pajak = persenPajak*totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus-(int)pajak;

        //4.output
        System.out.println("Total gaji = " + totalGaji);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji bersih = " + gajiBersih);
    }
}
