import java.util.Scanner;

public class I_HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int hcf, lcm, rem, num, div;
        if(num1 > num2){
            num = num1;
            div = num2;
        }else{
            num = num2;
            div = num1;
        }
        rem = num % div;
        hcf = div;
        while(rem != 0){
            rem = num % div;
            hcf = div;
            num = div;
            div = rem;
        }
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF and LCM are: " + hcf + " " + lcm);
    }
}
