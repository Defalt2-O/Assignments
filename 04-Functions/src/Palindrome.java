import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }

    static void isPalindrome(int num){
        int original = num;
        int palindrome = 0;
        while(num != 0){
            int rem = num % 10;
            palindrome = palindrome * 10 + rem;
            num /= 10;
        }
        if(original == palindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
