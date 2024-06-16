import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        isArmstrong(num);
    }

    static void isArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num /= 10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number.");
        }
    }
}
