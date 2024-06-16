import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int max = isMax(n1, n2, n3);
        int min = isMin(n1, n2, n3);
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }

    static int isMax(int n1, int n2, int n3){
        if(n1 > n2){
            return Math.max(n1, n3);
        }else{
            return Math.max(n2, n3);
        }
        //There exists a function called Math.max(), which takes 2 arguments and returns the maximum between them
    }

    static int isMin(int n1, int n2, int n3){
        if(n1 < n2) {
            return Math.min(n1, n3);
        } else {
            return Math.min(n2, n3);
        }
        //Similarly, there exists a function Math.min(), which returns the minimum value of 2 args.
    }
}
