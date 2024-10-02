import java.util.Scanner;
public class pemilihanharidenganif15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String dayType;
        int dayName;

        System.out.print("Input number: ");
        dayName = sc.nextInt();

        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "invalid number ";
        }
        System.out.println(dayName + " is a "+dayType);
    }
}
