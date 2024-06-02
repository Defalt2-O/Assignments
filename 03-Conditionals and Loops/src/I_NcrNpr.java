import java.util.Scanner;

public class I_NcrNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of n and r");
        int n = sc.nextInt(), n1 = n;
        int r = sc.nextInt(), r2 = r, c = 1;
        int fact_n = 1,fact_r = 1;
        while (c <= r){
            fact_n *= n1;
            n1--;
            c++;
        }
        c=1;
        while(c <= r){
            fact_r *= r2;
            r2--;
            c++;
        }
        int npr = fact_n;
        int ncr = fact_n/fact_r;
        System.out.println("NCr = " + ncr + " and NPr = " + npr);
    }
}
