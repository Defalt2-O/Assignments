import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Find the Area of: ");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Isosceles Triangle");
            System.out.println("5. Parallelogram");
            System.out.println("6. Rhombus");
            System.out.println("7. Equilateral Triangle");
            System.out.println("8. Exit");
            System.out.print("Enter your choice of number: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter radius of Circle: ");
                float r = sc.nextFloat();
                float area = 3.14f * r * r;
                System.out.println("Area of the circle is: " + area);
            }
            else if(choice == 2) {
                System.out.print("Enter Base and Height of Triangle: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                float area = (base * height) / 2f;
                System.out.println("Area of the Triangle is: " + area);
            }
            else if(choice == 3) {
                System.out.print("Enter Length and Width of Rectangle: ");
                float length = sc.nextFloat();
                float width = sc.nextFloat();
                float area = length * width;
                System.out.println("Area of the Rectangle is: " + area);
            }
            else if(choice == 4) {
                System.out.print("Enter Base and Height of Isosceles Triangle: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                float area = base * height * 0.5f;
                System.out.println("Area of the Isosceles Triangle is: " + area);
            }
            else if(choice == 5) {
                System.out.print("Enter Base and Height of Parallelogram: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                float area = base * height;
                System.out.println("Area of the Parallelogram is: " + area);
            }
            else if(choice == 6) {
                System.out.print("Enter diagonal 1 and diagonal 2 of Rhombus: ");
                float d1 = sc.nextFloat();
                float d2 = sc.nextFloat();
                float area = (d1 * d2) / 2f;
                System.out.println("Area of the Rhombus is: " + area);
            }
            else if(choice == 7) {
                System.out.print("Enter length of side of Equilateral Triangle: ");
                float length = sc.nextFloat();
                double area = (Math.sqrt(3.0) / 4) * length * length;
                System.out.println("Area of the circle is: " + area);
            } else if (choice == 8){
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
}
