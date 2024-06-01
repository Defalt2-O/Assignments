import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int n;
        System.out.println("Enter sequence of numbers to find largest number. Enter '0' to stop.");
        do {
            n = sc.nextInt();
            if (n > largest){
                largest = n;
            }
        } while(n != 0);
        System.out.println("Largest Number: " + largest);
    }
}
