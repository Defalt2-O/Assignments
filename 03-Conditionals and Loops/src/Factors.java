import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to view its factors: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            if(n%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
