import java.util.Calendar;

public class TimeGreeting {
    public static void main(String[] args) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour < 12) {
            System.out.println("Good morning!🌞🌞");
        } else if (hour < 17) {
            System.out.println("Good afternoon!🌗🌗");
        } else {
            System.out.println("Good evening!🌘🌘");
        }
    }
}
