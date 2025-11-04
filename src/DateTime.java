import java.time.*;
public class DateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now().withNano(0);
        LocalDateTime dt = LocalDateTime.now().withNano(0);
        System.out.println("Date: " + d);
        System.out.println("Time: " + t);
        System.out.println("DateTime: " + dt);
    }
}

