import java.util.Scanner;

public class ProdSumDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), n1 = n,temp, prod = 1, sum = 0, diff = 0;
        while(n1 != 0){
            temp = n1 % 10;
            prod *= temp;
            sum += temp;
            diff = prod - sum;
            n1 /= 10;
        }
        System.out.println("The product("+ prod +") minus the sum(" + sum + ") of the digits of " + n + " is " + diff);

    }
}
