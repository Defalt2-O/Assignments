import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        findArea(r);
        findPerimeter(r);
    }

    static void findArea(float r){
        float area = 3.14f * r * r;
        System.out.println("Area of the circle is: " + area);
    }

    static void findPerimeter(float r){
        float perimeter = 2 * 3.14f * r;
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
}
