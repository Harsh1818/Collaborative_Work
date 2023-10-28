public class SampleClass {
    public static void main(String[] args) {
        System.out.println("Hello from the Team Lead!");
        int number = 5;
        System.out.println("Square of " + number + " is: " + square(number));
        greet("Dev2");
    }

    public static int square(int x) {
        return x * x;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}