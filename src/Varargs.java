public class Varargs {
    public static void Numbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Numbers(1, 2, 3);
        Numbers(10);
        Numbers();
    }
}
