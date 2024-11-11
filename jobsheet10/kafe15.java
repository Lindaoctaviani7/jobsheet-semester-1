import java.util.Scanner;

public class kafe15 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String namaMakanan = sc.nextLine();
        
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                break;
            }
        }
        
        System.out.println();
        if (ditemukan) {
            System.out.println("Makanan " + namaMakanan + " tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan " + namaMakanan + " tidak ada di menu.");
        }
        
        sc.close();
    }
}
    
