import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money in INR: ");
        double rupees = sc.nextFloat();
        double usd = rupees * 0.0120f;
        System.out.println("The equivalent amount in USD is: "+ usd);
    }
}
