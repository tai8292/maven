package tantai;
import java.util.Scanner;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;
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
        System.out.println("Input a: ");
        int a = in.nextInt();
        System.out.println(a);
    }
/**
 * Hello world!
 *@param args is args
 */
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        App r = new App();
        LocalTime currentTime = new LocalTime();
        LocalDate currentDate = new LocalDate();
        System.out.println("The current local time is: " + currentTime);
        System.out.println("The current local date is: " + currentDate);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        greeter.sayGoodbye();

        System.out.print("\nInput condition: ");
        String condition = in.next();
        SayHello s = new SayHello();
        s.isTrue(condition);
    }
}
