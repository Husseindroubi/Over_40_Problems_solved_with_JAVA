import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        do {
            System.out.println("Type your grade: ....");
            grade = sc.nextInt();
        } while (grade < 1 || grade > 5);
        switch (grade) {
            case 1:
                System.out.println("Very Good");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Sufficient");
                break;
            default:
                System.out.println("Not Sufficient");
                break;
        }
        System.out.println("-------------------------------------");
    }
}
