import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till what number do you want the series?");
        int n = sc.nextInt(), current = 1, previous = 0, count = 1, temp;
        System.out.print(previous + " " + current + " ");
        while(count <= (n-2)){
            temp = current;
            current += previous;
            previous = temp;
            System.out.print(current + " ");
            count++;
        }
    }
}
