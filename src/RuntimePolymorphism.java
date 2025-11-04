public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        a1.makeSound();
        a2.makeSound();
    }
}
