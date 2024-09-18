import java.util.Scanner;

public class laundry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga, kg;
        System.out.print("masukkan kg: ");
        kg = input.nextDouble();
        harga = 2000*kg;

        System.out.print("maka harga dari " + kg +" kg adalah : " + harga);
        
    }
    
}
