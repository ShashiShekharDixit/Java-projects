public class Overloading {
    public static void Name(String name) {
        System.out.println("Name: " + name);
    }
    public static void Age(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void print(String name, int age, String city) {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
    public static void main(String[] args) {
        Name("Shashi");
        Age("Shekhar", 22);
        print("Saurabh", 24, "Lucknow");
    }
}
