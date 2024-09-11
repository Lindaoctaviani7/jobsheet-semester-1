import java.util.Scanner; 
public class Gajibulanan {
    public static void main(String[] args) {
     
        //1.variabel
        int jumlahJam, upahPerJam;
        float persenBonus = (float)0.1, persenPajak = 0.05f;

        //2.input
        Scanner sc = new Scanner(System.in);
        jumlahJam = sc.nextInt();
        upahPerJam = sc.nextInt();

        int totalGaji = jumlahJam*upahPerJam;
        float bonus = persenBonus*totalGaji;
        int totalGajiPlusBonus = totalGaji+(int)bonus;
        float pajak = persenPajak*totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus-(int)pajak;

        System.out.println("Total gaji = " + totalGaji);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji bersih = " + gajiBersih);

    }
    
}
