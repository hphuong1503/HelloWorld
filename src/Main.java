import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Input number a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.print("Input number b");
        int b = scanner.nextInt();

        System.out.print("Sum of a  & b: "+(a+b));

    }
}
