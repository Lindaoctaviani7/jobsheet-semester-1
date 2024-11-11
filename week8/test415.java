import java.util.Scanner;

public class test415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,n,bil=1,output=1;
        for(i=1;1<=6;i++) {
            if (i%2 == 0) {
                output=i*i;
            }
            else output = 1;
            System.out.println(output);
        }

    }
}
