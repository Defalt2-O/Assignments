import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Find the Perimeter of: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Parallelogram");
            System.out.println("5. Rhombus");
            System.out.println("6. Equilateral Triangle");
            System.out.println("7. Exit");
            System.out.print("Enter your choice of number: ");
            choice = sc.nextInt();
            System.out.println();

            if(choice == 1) {
                System.out.print("Enter radius of Circle: ");
                float r = sc.nextFloat();
                float perimeter = 3.14f * r * 2f;
                System.out.println("Perimeter of the circle is: " + perimeter);
                System.out.println();
            }
            else if(choice == 2) {
                System.out.print("Enter Length and Width of Rectangle: ");
                float length = sc.nextFloat();
                float width = sc.nextFloat();
                float perimeter = 2f * (length + width);
                System.out.println("Perimeter of the Rectangle is: " + perimeter);
                System.out.println();
            }
            else if(choice == 3) {
                System.out.print("Enter Length of Square: ");
                float length = sc.nextFloat();
                float perimeter = length * 4f;
                System.out.println("Perimeter of the Square is: " + perimeter);
                System.out.println();
            }
            else if(choice == 4) {
                System.out.print("Enter Base and Height of Parallelogram: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                float perimeter = 2f * (base + height);
                System.out.println("Perimeter of the Parallelogram is: " + perimeter);
                System.out.println();
            }
            else if(choice == 5) {
                System.out.print("Enter Length of Rhombus: ");
                float length = sc.nextFloat();
                float perimeter = length * 4f;
                System.out.println("Perimeter of the Rhombus is: " + perimeter);
                System.out.println();
            }
            else if(choice == 6) {
                System.out.print("Enter Side of Equilateral Triangle: ");
                float side = sc.nextFloat();
                float perimeter = side * 3f;
                System.out.println("Perimeter of the Equilateral Triangle is: " + perimeter);
                System.out.println();
            } else if (choice == 7){
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
                System.out.println();
            }
        } while (true);
    }
}
