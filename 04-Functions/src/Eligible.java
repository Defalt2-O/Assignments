import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        isEligible(age);
    }

    static void isEligible(int age){
        if(age >= 18){
            System.out.println("Eligible");
            return;
        }
        System.out.println("Not Eligible");
    }
}
