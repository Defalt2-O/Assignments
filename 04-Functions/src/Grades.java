import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        double marks1 = (double) marks / 10;
        marks1 = Math.ceil(marks1);
        marks = (int) marks1;
        String grade = findGrade(marks);
        System.out.println("Your Grade is: " + grade);
    }

    static String findGrade(int marks){
        switch(marks){
            case 10 -> {
                return "AA";
            }
            case 9 -> {
                return "AB";
            }
            case 8 -> {
                return "BB";
            }
            case 7 -> {
                return "BC";
            }
            case 6 -> {
                return "CD";
            }
            case 5 -> {
                return "DD";
            }
            default -> {
                return "Fail";
            }
        }
    }
}
