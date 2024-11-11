
public class test715 {
    public static void main (String[] args) {
        int a=1,b=1,c=0;

        System.out.println(a);
        System.out.println(b);

        for (int i=0; c<55;) {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
