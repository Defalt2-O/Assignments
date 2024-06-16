import java.util.Scanner;

public class SumOfNaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sumOfNumbers(num);
    }

    static void sumOfNumbers(int num){
        int c = 1;
        int sum = 0;
        while(c <= num){
            sum += c;
            c++;
        }
        System.out.println("Sum of first " + num + " numbers is: " + sum);
    }
}
