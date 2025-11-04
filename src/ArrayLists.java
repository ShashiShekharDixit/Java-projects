import java.util.ArrayList;

public class ArrayLists {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Shashi");
            names.add("Shekhar");
            names.add("Saurabh");
            System.out.println("Size: " + names.size());
            System.out.println("Names: " + names);
            names.remove("Shashi");
            System.out.println("After remove: " + names);
        }
}
