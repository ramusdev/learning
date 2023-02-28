import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a: ");
        int variableA = scanner.nextInt();

        System.out.println("Insert b: ");
        int variableB = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println(add(variableA, variableB));
    }
    public static int add (int a,int b) {
        int result = 0;
        result = a + b;
        return result;
    }
}
