import java.util.Scanner;

public class Computing_Circle {
    public static void main(String[] args) {
        double radius, area;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            radius = in.nextDouble();
            
            area = radius * radius * 3.14159;

            System.out.println("The area of the circle with radius " + radius + " is " + area);
        }
    }
}