import java.util.Scanner;
public class keramik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sisiKeramik, sisiLantai, banyakKeramik, luaskeramik, luaslantai;
    
        System.out.println("masukkan sisi lantai: ");
        sisiLantai = sc.nextDouble();
        System.out.println("masukkan sisi kermik: ");
        sisiKeramik = sc.nextDouble();
        luaslantai = sisiLantai*sisiLantai;

        System.out.println("maka luas lantainya adalah " + luaslantai);

        

    }
    
}
