public class Anonymous {
    interface Greeting { void sayHello(); }
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        g.sayHello();
    }
}

