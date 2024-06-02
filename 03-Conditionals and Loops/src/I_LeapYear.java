import java.util.Scanner;

public class I_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean leap = false;
        if(year % 4 == 0){
            leap = true;
            if(year % 100 == 0){
                if(year % 400 != 0){
                    leap = false;
                }
            }
        }
        if(leap){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
