// write a program to find the area of a circle using a final variable for pi.
import java.util.Scanner;
class Tenth {
    public static void main(String[] args) {
        final double PI = 3.14159; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
        scanner.close();
    }
}


