import java.util.Scanner;

public class I_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to view its factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        while(n != 1){
            factorial *= n;
            n--;
        }
        System.out.println("Factorial: " + factorial);
    }
}
