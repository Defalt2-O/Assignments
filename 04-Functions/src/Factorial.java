import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        findFact(num);
    }

    static void findFact(int num){
        int fact = 1;
        while(num >= 2){
            fact *= num;
            num--;
        }
        System.out.println("Factorial is: " + fact);
    }
}
