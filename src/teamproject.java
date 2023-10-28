public class SampleClass {
    public static void main(String[] args) {
        System.out.println("Hello from the Team Lead!");
        int number = 5;
        System.out.println("Square of " + number + " is: " + square(number));
        greet("Dev3");
        printNumbers();
    }

    public static int square(int x) {
        return x * x;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}