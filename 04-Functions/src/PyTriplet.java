import java.util.Scanner;

public class PyTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        boolean value = isTriplet(n1, n2, n3);
        if(value){
            System.out.println("The numbers are Pythagorean Triplets.");
        } else{
            System.out.println("The numbers are not Pythagorean Triplets.");
        }
    }

    static boolean isTriplet(int n1, int n2, int n3){
        int a = n1 * n1;
        int b = n2 * n2;
        int c = n3 * n3;
        if(a == (b + c)){
            return true;
        }
        if(b == (a + c)){
            return true;
        }
        return c == (a + b);
    }
}
