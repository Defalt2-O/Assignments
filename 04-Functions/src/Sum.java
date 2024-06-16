import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        findSum(n1, n2);
    }

    static void findSum(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("Sum is: " + sum);
    }
}
