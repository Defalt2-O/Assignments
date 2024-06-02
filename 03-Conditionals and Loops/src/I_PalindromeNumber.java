import java.util.Scanner;

public class I_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its Palindrome");
        int num = sc.nextInt(),num1 = num, palindrome = 0;
        while(num1 != 0){
            int temp = num1 % 10;
            palindrome = palindrome * 10 + temp;
            num1 /= 10;
        }
        if(num == palindrome){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome number");
        }

    }
}
