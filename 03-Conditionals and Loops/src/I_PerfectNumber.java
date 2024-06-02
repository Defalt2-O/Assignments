import java.util.Scanner;

public class I_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0, c = 1;
        while(c < num){
            if(num % c == 0){
                sum += c;
            }
            c++;
        }
        if(sum == num){
            System.out.println("Number is perfect.");
        }else{
            System.out.println("Number is not perfect.");
        }


    }
}
