import java.util.Scanner;

public class I_AverageN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many no's do you want to enter: ");
        int n = sc.nextInt(), sum = 0;
        float avg;
        System.out.print("Enter numbers:");
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            sum += num;
        }
        avg = (float) sum / n;
        System.out.println("Average of the numbers is: " + avg);
    }
}
