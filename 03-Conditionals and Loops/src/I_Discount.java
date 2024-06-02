import java.util.Scanner;

public class I_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of Product: ");
        float price = sc.nextInt();
        System.out.print("Enter discount percentage: ");
        int disc = sc.nextInt();
        float amount = price - ((float) disc /100 * price);
        System.out.println("Price after discount is: " + amount);
    }
}
