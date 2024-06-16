import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to display: ");
        int num = sc.nextInt();
        printFib(num);
    }

    static void printFib(int num){
        if(num == 1){
            System.out.print("0");
        } else {
            System.out.print("0 1 ");
            int a = 0;
            int b = 1;
            num -= 2;
            for (int i = 0; i < num; i++) {
                int sum = a + b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        }
    }
}
