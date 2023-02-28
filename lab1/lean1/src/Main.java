public class Main {
    public static void main(String[] args) {
        // System.out.println("This is Java project");
        // System.out.println("Second string");

        boolean a = true;

        if (a) {
            System.out.println("a is true");
        } else {
            System.out.println("a is false");
        }

        System.out.println(add(1, 2));

    }

    public static int add (int a,int b) {
        int result = 0;
        result = a + b;
        return result;
    }

}
