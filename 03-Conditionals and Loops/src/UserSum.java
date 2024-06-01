import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.println("Enter sequence of numbers to add. Enter '0' to stop.");
        do {
            n = sc.nextInt();
            sum += n;
        } while(n != 0);
        System.out.println("Sum of all numbers entered: " + sum);
    }
}
