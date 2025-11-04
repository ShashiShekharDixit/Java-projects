import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(Integer.valueOf(20));
        int sum = nums.get(0) + nums.get(1);
        System.out.println("Sum: " + sum);
    }
}
