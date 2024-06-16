import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 < n2){
            primeNumbers(n1, n2);
        }
        else{
            primeNumbers(n2, n1);
        }
    }

    static void primeNumbers(int n1, int n2){
        if(n1 == 1){
            n1++;
        }
        while(n1 <= n2){
            int c = 2;
            while(c * c <= n1){
                if(n1 % c == 0){
                    break;
                }
                c++;
            }
            if(c * c > n1){
                System.out.println(n1);
            }
            n1++;
        }
    }
}
