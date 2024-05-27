import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Principal, Rate and Time.");
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}