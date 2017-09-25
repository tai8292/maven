package tantai;
import java.util.Scanner;
import org.joda.time.LocalTime;
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
        App r = new App();
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
