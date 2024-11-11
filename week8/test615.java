package week8;
import java.util.Scanner;
public class test615 {
    public static void main (String[] args) {
        int i,n,bil=10;
        Scanner sc = new Scanner(System.in);
        for(i=1;bil<=104;i++){
            if (i%2 == 0) {
                bil = bil+4;
            }
            else bil = bil*2;
        }
        System.out.println(i);
    }
}
