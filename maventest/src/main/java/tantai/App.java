package tantai;
import java.util.Scanner;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;
import java.util.Date;
/**
 * Hello world!
 *
 */
public final class App {
/**
 * Hello world!
 * Constructor
 */
    private App() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.println(a);
    }
/**
 * Hello world!
 *@param args is
 */
    public static void main(final String[] args) {
        App app = new App();
        LocalTime currentTime = new LocalTime();
        LocalDate currentDate = new LocalDate();
        System.out.println("The current local date is: " + currentDate);
        System.out.println("The current local time is: " + currentTime);
        Date date = new Date();
        System.out.println("The date: " + date);

        Greeter greeter = new Greeter();
        greeter.sayGoodbye();
    }
}
