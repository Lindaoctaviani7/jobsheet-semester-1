import java.util.Scanner;
public class Usia15 {
    public static void main (String[] args){
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int usia;
        //input
        System.out.print("Masukkan Usia: ");
        usia = sc.nextInt();
        //eksekusi
        if (usia<0){
            System.out.println("Input Tidak Valid");
        }
        else if (usia>=0&&usia<=12){
            System.out.println("Kategori Usia: Anak-Anak");
        }
        else if (usia>=13&&usia<=19){
            System.out.println("Kategori Usia: Remaja");
        }
        else if (usia>=20&&usia<=64){
            System.out.println("Kategori Usia: Dewasa");
        }
        else {
            System.out.println("Kategori Usia: Lansia");
        }
    }
}
