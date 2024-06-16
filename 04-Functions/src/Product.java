import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int prod = findProd(n1, n2);
        System.out.println("Product is: " + prod);
    }

    static int findProd(int n1, int n2){
        return n1 * n2;
    }
}
