import java.util.Scanner;

public class I_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = sc.nextInt(), n1 = num, sum = 0;
        while(n1 != 0){
            int rem = n1 % 10;
            sum += rem;
            n1 /= 10;
        }
        System.out.println("Sum of digits of " + num + " is " + sum);

    }
}
