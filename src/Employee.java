public class Employee implements Payable{
        private String name;
        public Employee(String name)
        {
            this.name = name;
        }
        @Override
        public void pay(double amount) {
            System.out.println(name + " paid " + amount);
        }
        public static void main(String[] args) {
            Payable p = new Employee("Shashi");
            p.pay(1500.0);
        }
}
