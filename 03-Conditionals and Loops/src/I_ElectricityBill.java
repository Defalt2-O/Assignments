import java.util.Scanner;

public class I_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter meter readings of current month and previous month (in kW)");
        float current = sc.nextFloat();
        float previous = sc.nextFloat();
        float used = current - previous;
        System.out.println("Enter cost per unit (in kW/h)");
        float cost = sc.nextFloat();
        float amount = cost * used;
        System.out.println("Your bill for the month is: " + amount);



    }
}
