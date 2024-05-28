import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it is Palindrome");
        String word = sc.next();
        char rev;
        String reverse = "";
        int length = word.length() - 1;
        while(length != -1){
            rev = word.charAt(length);
            reverse = reverse + rev;
            length--;
        }
        if (reverse.equalsIgnoreCase(word)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a Palindrome");
        }
    }
}
