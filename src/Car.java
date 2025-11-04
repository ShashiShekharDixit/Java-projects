public class Car extends Overriding {
    @Override
    public void startEngine() {
        System.out.println("Car Engine Starts");
    }
    public static void main(String[] args) {
        Overriding v = new Car();
        v.startEngine();
    }
}
