import java.util.Scanner;

public class I_DifferentSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of numbers, negative or positive. Enter '0' to stop.");
        int n, negative = 0, e_positive = 0, o_positive = 0;
        do{
            n = sc.nextInt();
            if(n < 0){
                negative += n;
            }else{
                if(n % 2 == 0){
                    e_positive += n;
                }else{
                    o_positive += n;
                }
            }
        }while(n != 0);
        System.out.println("Sum of Negative Numbers: " + negative);
        System.out.println("Sum of Positive Even Numbers: " + e_positive);
        System.out.println("Sum of Positive Odd Numbers: " + o_positive);
    }
}
