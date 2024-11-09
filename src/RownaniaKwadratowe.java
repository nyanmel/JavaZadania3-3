import java.util.Scanner;

public class RownaniaKwadratowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient\n a: ");
        double a = scanner.nextDouble();


        if (a == 0) {
            System.out.println("The coefficient a cannot be zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;

        System.out.printf("Delta: %.2f\n", delta);


        switch (Double.compare(delta, 0)) {
            case 1:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("The equation has two roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;

            case 0:
                double x = -b / (2 * a);
                System.out.printf("The equation has one root: x = %.2f\n", x);
                break;

            case -1:
                System.out.println("The equation has no real roots.");
                break;
        }

        scanner.close();
    }
}
