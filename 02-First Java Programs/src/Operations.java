import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter an operator");
        char operator = sc.next().charAt(0);
        int result = 0;
        if (operator == '+'){
            result = a + b;
        }
        else if (operator == '-'){
            result = a - b;
        }
        else if (operator == '*'){
            result = a * b;
        }
        else if (operator == '/'){
            result = a / b;
        }
        System.out.println("The result of " + a +" "+ operator +" "+b + " is: " + result);
    }
}
