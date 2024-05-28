import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find armstrong numbers between them. ");
        boolean not_present = true;
        int num1 = sc.nextInt(), num2 = sc.nextInt(), temp, armstrong, remainder, num1copy = num1;
        while(num1 <= num2){
            armstrong = 0;
            temp = num1;
            while(temp != 0){
                remainder = temp % 10;
                armstrong += (int) Math.pow(remainder,3);
                temp /= 10;
            }
            if(num1 == armstrong){
                System.out.println(armstrong);
                not_present = false;
            }
            num1++;
        }
        if(not_present){
            System.out.println("There are no armstrong numbers between " + num1copy + " and " + num2);
        }
    }
}
