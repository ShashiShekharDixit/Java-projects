public class Exception {
    public static void main(String[] args) {
        try {
                int a = 10, b = 0;
                int c = a / b;
                System.out.println("Result: " + c);
        } catch (ArithmeticException ex) {
                System.out.println("Caught exception: " + ex.getMessage());
        } finally {
                System.out.println("Finally block always runs");
        }
    }
}
