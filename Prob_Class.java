
import java.util.*;

class Student {
    String name;
    String gender;

    Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

public class Prob_Class{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of boys");
        int size_b = scanner.nextInt();

        System.out.println("Enter the number of girls");
        int size_w = scanner.nextInt();

        Student[] boys = new Student[size_b];
        Student[] girls = new Student[size_w];

        System.out.println("Enter the name of boys:");
        for (int i = 0; i < boys.length; i++) {
            System.out.println("Boy name:");
            boys[i] = new Student(scanner.next(), "Boy");
        }

        System.out.println("Enter the name of girls:");
        for (int i = 0; i < girls.length; i++) {
            System.out.println("Girl name:");
            girls[i] = new Student(scanner.next(), "Girl");
        }

        int room = 1;

        if (boys.length % 2 == 0) {
            for (int i = 0; i < boys.length - 1; i += 2) {
                System.out.println("Boy " + boys[i].name + " and boy "
                        + boys[i + 1].name + " are together in room: " + room);
                room++;
            }
            System.out.println("No boys are left");

        } else {
            for (int i = 0; i < boys.length - 1; i += 2) {
                System.out.println("Boy " + boys[i].name + " and boy "
                        + boys[i + 1].name + " are together in room: " + room);
                room++;
            }
            System.out.println("One boy is left: " + boys[size_b - 1].name);
            room++;
        }

        for (int i = 0; i < girls.length - 1; i += 2) {
            System.out.println("Girl " + girls[i].name + " and girl "
                    + girls[i + 1].name + " are together in room: " + room);
            room++;
        }

        if (girls.length % 2 == 0) {
            System.out.println("No girls are left");
        } else {
            System.out.println("One girl is left: " + girls[size_w - 1].name);
        }

        scanner.close();
    }
}
