public class Child extends Parent{
    private int grade;
    public Child(String name, int grade) {
        super(name);
        this.grade = grade;
    }
    @Override
    public void showRole() {
        super.showRole();
        System.out.println("Role detail: Student in grade " + grade);
    }
    public static void main(String[] args) {
        Child s = new Child("Shashi", 10);
        System.out.println("Name: " + s.name);
        s.showRole();
    }
}
